package View;

import Core.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends  JFrame{
    private JPanel conteiner;
    private JLabel lbl_info;
    private JPanel pnl_top;
    private JPanel pnl_bottom;
    private JLabel lbl_email;
    private JTextField txt_email;
    private JLabel lbl_password;
    private JPasswordField pass_password;
    private JButton btn_login;

    public LoginUI(){
        this.add(conteiner);
        this.setTitle("Müşteri Yönetim Paneli");
        this.setVisible(true); //UI'ın görünebilmesi için
        this.setSize(400,400);
        int screenX=(int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()-this.getSize().getWidth())/2);
        int screenY=(int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()-this.getSize().getHeight())/2);
        this.setLocation(screenX, screenY);

        btn_login.addActionListener(new ActionListener() {

            JTextField[] checkList={txt_email,pass_password};

            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldListEmpty(checkList))
                    Helper.showAutoMessage("fill");
               else if (!Helper.isEmailValid(txt_email.getText()))
                    Helper.showAutoMessage("Lütfen geçerli bir e-mail giriniz");
            }
        });
    }
}

package Core;

import javax.swing.*;

public class Helper
{


  public static void setTheme(){
     for (UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels()){
         System.out.println(info.getName());
         if (info.getName().equals("Nimbus")) {
             try {
                 UIManager.setLookAndFeel(info.getClassName());
             } catch (Exception exception) {
                 throw new RuntimeException(exception.getMessage());

             }
             break;
         }

     }
      UIManager.put("OptionPane.okButtonText","TAMAM");
  }

  public static boolean isFieldEmpty(JTextField textField){
      return textField.getText().trim().isEmpty();
  }

  public static boolean isFieldListEmpty(JTextField[] textFields){
      for (JTextField textField : textFields){
          if (isFieldEmpty(textField)) return true;
      }
      return false;
  }


  public static boolean isEmailValid(String email){


      if (email==null || email.trim().isEmpty()) return false;
      if (!email.contains("@")) return false;

      String parts[]=email.split("@");

      if (parts.length!=2) return false;
      if (parts[0].trim().isEmpty() || parts[1].trim().isEmpty()) return false;
      if (!parts[1].trim().contains(".")) return false;

      String [] lastParts=parts[1].split("\\.");

      if (lastParts.length!=2) return false;
      if (lastParts[1].trim().isEmpty()) return false;

      return true;
  }

  public static void showAutoMessage(String whatHappened){
      String message;
      String title;

      switch (whatHappened){
          case "fill" ->{
              message="Lütfen tüm alanları doldurunuz";
              title="UYARI";
              JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);
          }
          case "done" ->{
              message="İşlem başarılı";
              title="BAŞARILI";
              JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
          }
          case "error" ->{
              message="Bir hata oluştu";
              title="HATA";
              JOptionPane.showMessageDialog(null,message,title,JOptionPane.ERROR_MESSAGE);

          }
          default -> {
              message=whatHappened;
              title="UYARI";
              JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);
          }
      }
  }

}

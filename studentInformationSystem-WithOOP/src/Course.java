public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String coursePrefixName;
    int note;
    int quiz;
    double realNote;

    public Course(String name, String code, String coursePrefixName)
    {
        this.name = name;
        this.code = code;
        this.coursePrefixName =coursePrefixName ;
        this.note = 0;
        this.quiz=0;
        this.realNote=0;
    }

    public void addTeacher(Teacher teacher)
    {
        if (this.coursePrefixName.equals(teacher.branch))
        {
            this.courseTeacher = teacher;
            System.out.print("İşlem başarılı ");
        }
        else
        {
            System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
        }
        printTeacher();
    }

    public void printTeacher() {
        if (courseTeacher != null)
        {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else
        {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
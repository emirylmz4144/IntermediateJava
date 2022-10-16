public class Student {
    String name,studentNumber;
    int classes;
    Course math;
    Course physics;
    Course chemical;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String studentNumber, Course math,Course physics,Course chemical)
    {
        this.name = name;
        this.classes = classes;
        this.studentNumber = studentNumber;
        this.math = math;
        this.physics = physics;
        this.chemical = chemical;
        calcAvarage();
        this.isPass = false;
    }


    public void addCheckExamNote(int math, int physics, int chemical)
    {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physics>= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemical >= 0 && chemical<= 100) {
            this.chemical.note = chemical;
        }

    }
    public void addCheckQuizNote(int math, int physics, int chemical)
    {

        if (math >= 0 && math <= 100) {
            this.math.quiz = math;
        }

        if (physics>= 0 && physics <= 100) {
            this.physics.quiz = physics;
        }

        if (chemical >= 0 && chemical<= 100) {
            this.chemical.quiz = chemical;
        }

    }
    public void realNote()
    {
        this.math.realNote=((this.math.note*0.8)+(this.math.quiz*0.2));
        this.physics.realNote=((this.physics.note*0.8)+(this.physics.quiz*0.2));
        this.chemical.realNote=((this.chemical.note*0.8)+(this.chemical.quiz*0.2));
    }

    public void isPass()
    {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemical.note == 0)
        {
            System.out.println("Notlar tam olarak girilmemiş");
        } else
           {
            this.isPass = isCheckPass();
            printExamNote();
            printQuizNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage()
    {
        realNote();
        this.avarage = (this.physics.realNote + this.chemical.realNote + this.math.realNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printExamNote()
    {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.math.note);
        System.out.println("Fizik Notu : " + this.physics.note);
        System.out.println("Kimya Notu : " + this.chemical.note);
    }
    public void printQuizNote()
    {
        System.out.println("Matematik Quizi : " + this.math.quiz);
        System.out.println("Fizik Quizi: " + this.physics.quiz);
        System.out.println("Kimya Quizi : " + this.chemical.quiz);
    }

}
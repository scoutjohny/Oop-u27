import java.util.Locale;

public class Student extends Person {
    public String schoolName;
    public String classNo;

    public Student(String firstName, String lastName, int age, int height, int weight, String schoolName, String classNo) {
        super(firstName, lastName, age, height, weight);
        this.schoolName = schoolName;
        this.classNo = classNo;
    }

    @Override
    public void personalInfo(){
        System.out.println("Personal information: ");
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Age: " + this.age + " years old");
        System.out.println("Height: " + this.height + "cm");
        System.out.println("Weight: " + this.weight + "Kg");
        System.out.println("School name: " + this.schoolName);
        System.out.println("Class number: " + this.classNo);
        System.out.println("Have a Nice Day! :D");
    }
}

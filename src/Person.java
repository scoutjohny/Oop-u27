import java.util.Scanner;

public class Person {

    public String firstName;
    private String lastName;
    int age;
    int height;
    int weight;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    Konstruktor metoda bez parametara - noArgsConstructor
//    public Person(){
//
//    }

    //Konstruktor sa parametrima - parametrizovani konstruktor
    public Person(String firstName, String lastName, int age, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //Varijanta konstruktora sa unosom podataka iz konzole :D
    public Person() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kreiranje nove persone je u toku!");
        System.out.println("Molimo Vas da unesete ime persone: ");
        this.firstName = scanner.nextLine();
        System.out.println("Molimo Vas da unesete prezime persone: ");
        this.lastName = scanner.nextLine();
        System.out.println("Molimo Vas da unesete godinu rođenja persone: ");
        this.age = scanner.nextInt();
        System.out.println("Molimo Vas da unesete visinu persone u cm: ");
        this.height = scanner.nextInt();
        System.out.println("Molimo Vas da unesete težinu persone u kg: ");
        this.weight = scanner.nextInt();

        System.out.println("Kreirana je persona sa sledećim karakteristikama:");
        personalInfo();
    }


    public String details(String firstName) {
        this.firstName = firstName;
        return this.firstName;
    }

    public void personalInfo() {
        System.out.println("Personal information: ");
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Age: " + this.age + " years old");
        System.out.println("Height: " + this.height + "cm");
        System.out.println("Weight: " + this.weight + "Kg");
        System.out.println("Have a Nice Day! :D");
    }

}

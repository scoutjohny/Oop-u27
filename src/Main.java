public class Main {
    public static void main(String[] args) {

//        Person person = new Person("Nikola","Đorđević",43,179,71);
Person person = new Person();
        person.firstName = "Nikola";
  person.setLastName("Đorđević");
//        person.height = 179;
//        person.weight = 71;

        Person nikola = new Person("Nikola","Birtašević",36,189,78);
//        nikola.firstName = "Nikola";
//        nikola.lastName = "Birtašević";
//        nikola.height = 189;
//        nikola.weight = 78;

        System.out.println(person.firstName);
        person.details("Janko");
        System.out.println("Novo ime je: ");
        System.out.println(person.firstName);

        person.personalInfo();

        Person novaPersona = new Person();

        Kalkulator kalkulator = new Kalkulator(6,2);

        System.out.println(kalkulator.deljenje());
    }
}

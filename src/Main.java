public class Main {
    public static void main(String[] args) {

//        Person person = new Person("Nikola","Đorđević",43,179,71);
//Person person = new Person();
//        person.firstName = "Nikola";
//  person.setLastName("Đorđević");
//        person.height = 179;
//        person.weight = 71;

//        Person nikola = new Person("Nikola","Birtašević",36,189,78);
//        nikola.firstName = "Nikola";
//        nikola.lastName = "Birtašević";
//        nikola.height = 189;
//        nikola.weight = 78;

//        System.out.println(person.firstName);
//        person.details("Janko");
//        System.out.println("Novo ime je: ");
//        System.out.println(person.firstName);

//        person.personalInfo();

//        Person novaPersona = new Person("Mile","Kitić",80,165,100);

//        Kalkulator kalkulator = new Kalkulator(6,2);

//        System.out.println(kalkulator.deljenje());

        Student student = new Student("Nikola", "Birtašević",25, 195, 85, "Sorbona", "I-3");
//        student.firstName = "Rade";
        student.personalInfo();

//        Teacher teacher = new Teacher();
//        teacher.schoolName = "V beogradska gimnazija";
//        teacher.subjectName = "Filozofija";

        DwarfWarrior dwarfWarrior = new DwarfWarrior();
        dwarfWarrior.health = 100;
        dwarfWarrior.rage = 0;
        dwarfWarrior.receiveHit();
        dwarfWarrior.mainWeaponHit();
        dwarfWarrior.receiveHit();
        dwarfWarrior.offWeaponHit();
        dwarfWarrior.areaOfEffectDamage();
    }
}

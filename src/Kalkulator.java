public class Kalkulator {
    int number1, number2;

    public Kalkulator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public void sabiranje(){
        System.out.println("Rezultat sabiranja brojeva "+number1+ " i " +number2 + " je: "+(number1+number2));
    }

    public void oduzimanje(){
        System.out.println("Rezultat oduzimanja brojeva "+number1+ " i " +number2 + " je: "+(number1-number2));
    }

    public void množenje(){
        System.out.println("Rezultat množenja brojeva "+number1+ " i " +number2 + " je: "+(number1*number2));
    }

//    public void deljenje(){
//        System.out.println("Rezultat deljenja brojeva "+number1+ " i " +number2 + " je: "+(number1/number2));
//    }

    public double deljenje(){
        return (double) number1 /number2;
    }
}

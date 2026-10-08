package Inharitance;

public class InharitanceRunner {
    void main() {
        Animal mela = new Animal(4, GenderType.male);
        System.out.println(mela.getNumberOfLegs() + " Mela");
        Bear bear = new Bear();
        System.out.println(bear.getNumberOfLegs() + " Bear");

    }
}

package Inharitance;

public class Bear extends Animal {

    public Bear() {
        super(10, GenderType.male);
    }

    @Override
    void run() {
        System.out.println("Inharitance.Bear is running");
    }

}
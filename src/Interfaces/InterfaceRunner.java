package Interfaces;

public class InterfaceRunner {
    void main() {
        Bird number1 = new Eagle();
        Bird number2 = new Wero();


        Bird[] birds = {number1, number2};
        for (int i = 0; i < birds.length; i++) {
            birds[i].makeSound();
        }

    }
}

package Inharitance;

public class Animal {
    private int numberOfLegs;
    GenderType gender;

  public Animal(int numberOfLegs, GenderType gender) {
    this.numberOfLegs = numberOfLegs;
    this.gender = gender;
  }

   int getNumberOfLegs() {
      return numberOfLegs;
  }

  void run() {
    System.out.println("Inharitance.Animal is Running");
  }
}

enum GenderType {
    male,
    female
}

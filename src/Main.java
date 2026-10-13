
void main() {
    randomizer();
    Person newPerson = new Person(12,"asdasd","asdasd", "male");
    newPerson.getUserCar().isElectric();
}

void randomizer() {
    Randomizer fabric = new Randomizer(5);
    System.out.println(fabric.getFinalNumber());
}

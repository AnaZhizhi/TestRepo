public class Randomizer {
    private int number;

    public Randomizer(int number) {
        this.number = number;
        randomize();
    }

    private void randomize() {
        number = number * 2;
        randomize1();
    }

    private void randomize1() {
        number = number * 5;
    }

    int getFinalNumber() {
        return number;
    }


}

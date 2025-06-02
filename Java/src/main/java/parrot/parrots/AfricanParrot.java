package parrot.parrots;

import parrot.Parrot;

public class AfricanParrot implements Parrot {
    private final int numberOfCoconuts;
    private static double LOAD_FACTOR = 9.0;
    private static final double MIN_SPEED = 0.0;


    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(MIN_SPEED, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}

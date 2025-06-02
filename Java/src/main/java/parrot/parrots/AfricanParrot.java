package parrot.parrots;

import parrot.Parrot;

public class AfricanParrot implements Parrot {
    private final int numberOfCoconuts;
    private double loadFactor = 9.0;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, baseSpeed - loadFactor * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}

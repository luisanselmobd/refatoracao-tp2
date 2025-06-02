package parrot.parrots;

import parrot.Parrot;

public class NorwegianBlueParrot implements Parrot {
    private final double voltage;
    private final boolean isNailed;
    private static final double MIN_SPEED = 24.0;
    private static final double MIN_VOLTAGE = 0.0;
    private static final double NO_NAILED_SPEED = 0.0;

    private double getBaseSpeed(double voltage) {
        return Math.min(MIN_SPEED, voltage * BASE_SPEED);
    }

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() { return isNailed ? NO_NAILED_SPEED : getBaseSpeed(voltage); }

    @Override
    public String getCry() {
        return  voltage > MIN_VOLTAGE ? "Bzzzzzz" : "...";
    }
}



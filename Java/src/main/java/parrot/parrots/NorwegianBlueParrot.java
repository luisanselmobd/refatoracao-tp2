package parrot.parrots;

import parrot.Parrot;

public class NorwegianBlueParrot implements Parrot {
    private final double voltage;
    private final boolean isNailed;

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * baseSpeed);
    }

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() { return isNailed ? 0 : getBaseSpeed(voltage); }

    @Override
    public String getCry() {
        return  voltage > 0 ? "Bzzzzzz" : "...";
    }
}



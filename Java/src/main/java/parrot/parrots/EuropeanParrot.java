package parrot.parrots;

import parrot.Parrot;

public class EuropeanParrot implements Parrot {
    @Override
    public double getSpeed() {
        return baseSpeed;
    }

    @Override
    public String getCry() { return "Sqoork!"; }
}

package parrot;

import parrot.parrots.AfricanParrot;
import parrot.parrots.EuropeanParrot;
import parrot.parrots.NorwegianBlueParrot;

import java.util.HashMap;
import java.util.Map;

public class ParrotFactory {
    public static EuropeanParrot createEuropeanParrot() {
        return new EuropeanParrot();
    }

    public static AfricanParrot createAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }

    public static NorwegianBlueParrot createNorwegianBlueParrot(double voltage, boolean isNailed) {
        return new NorwegianBlueParrot(voltage, isNailed);
    }
}

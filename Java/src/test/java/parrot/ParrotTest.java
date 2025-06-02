package parrot;

import org.junit.jupiter.api.Test;
import parrot.parrots.AfricanParrot;
import parrot.parrots.EuropeanParrot;
import parrot.parrots.NorwegianBlueParrot;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        EuropeanParrot parrot = new EuropeanParrot();
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }
    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        AfricanParrot parrot = new AfricanParrot( 1);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        AfricanParrot parrot = new AfricanParrot( 2);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        AfricanParrot parrot = new AfricanParrot( 0);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        NorwegianBlueParrot parrot = new NorwegianBlueParrot( 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        NorwegianBlueParrot parrot = new NorwegianBlueParrot( 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        NorwegianBlueParrot parrot = new NorwegianBlueParrot( 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getCryOfEuropeanParrot() {
        EuropeanParrot parrot = new EuropeanParrot();
        assertEquals("Sqoork!", parrot.getCry());
    }

    @Test
    public void getCryOfAfricanParrot() {
        AfricanParrot parrot = new AfricanParrot(1);
        assertEquals("Sqaark!", parrot.getCry());
    }
    @Test
    public void getCryOfNorwegianBlueHighVoltage() {
        NorwegianBlueParrot parrot = new NorwegianBlueParrot( 4, false);
        assertEquals("Bzzzzzz", parrot.getCry());
    }

    @Test
    public void getCryOfNorwegianBlueNoVoltage() {
        NorwegianBlueParrot parrot = new NorwegianBlueParrot( 0, false);
        assertEquals("...", parrot.getCry());
    }
}

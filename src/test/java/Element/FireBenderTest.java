package Element;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FireBenderTest {

    private FireBender azula;

    @BeforeEach

    void setup(){
        azula = new FireBender("Azula",14,false, "Fire");

    }

    @Test

    void jumpTest(){
        assertTrue(azula.jump().equals("Azula jumped using fire blast!"));
    }

    @Test

    void fireTempColourTestBlue(){
        azula.setFireTemp(1990);
        assertTrue(azula.getFireColour().equals("blue"));
    }

    @Test

    void fireTempColourTestWhite(){
        azula.setFireTemp(2401);
        assertTrue(azula.getFireColour().equals("white"));
    }



}


package Element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WaterBenderTest {

    private WaterBender katara;


    @BeforeEach
    void setup(){
        katara = new WaterBender("Katara",14, true, "Northern");
    }

    @Test
    void jumpTest(){
        Assertions.assertTrue(katara.jump().equals(katara.name + " jumps using water blast!"));
    }

    @Test
    void freezeWaterTest(){
        katara.freezeWater();
        Assertions.assertTrue(katara.getWaterState().equals("Ice"));
    }

    @Test
    void unfreezeWaterTest(){
        katara.freezeWater();
        katara.unfreezeWater();
        Assertions.assertTrue(katara.getWaterState().equals("liquid"));
    }

}

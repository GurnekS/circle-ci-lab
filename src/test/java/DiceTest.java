
import objects.Dice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

public class DiceTest {

    @Test
    public void testDice()
    {
        Dice dice = new Dice(12, "blue");
        assertEquals(12,dice.getSides());
        assertEquals("blue",dice.getColor());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10,11,12})
    public void testValidNumber(int number)
    {
        Dice dice = new Dice(12, "blue");

        int roll = dice.roll();
        assertTrue(roll >= 1 && roll <= 12);

    }
//    code cov
    @Test
    public void testColors(){
        Dice dice = new Dice(12, "green");
        assertEquals("green", dice.getColor());
    }

    @Test
    public void testRoll()
    {
        Dice dice = new Dice(12, "red");
        int frequency = 1;
        int[] totalFrequencyOfRoll = new int[frequency];
        for (int i = 0; i < frequency ; i++) {
            totalFrequencyOfRoll[i] = dice.roll();
            assertTrue(totalFrequencyOfRoll[i] >= 1 && totalFrequencyOfRoll[i] <=12);
        }



    }

    @Test
    public void testToString(){
        Dice dice = new Dice(12, "red");
        assertEquals("A 12 sided die", dice.toString());
    }




}

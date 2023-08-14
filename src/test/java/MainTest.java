import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void calculateCircleAreaTest(){
        //arrange
        double expected = 3.14;
        int r = 1;

        //act
        double result = Main.calculateCircleArea(r);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateCircleLengthTest(){
        //arrange
        double expected = 6.28;
        int r = 1;

        //act
        double result = Main.calculateCircleLength(r);

        //assert
        Assertions.assertEquals(expected, result);
    }
}

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void calculateCircleAreaTest(){
        //arrange
        double expected = 3.14;
        int r = 1;

        //act
        double result = Main.calculateCircleArea(r);

        //assert
        Assert.assertTrue(expected == result);
    }

    @Test
    public void calculateCircleLengthTest(){
        //arrange
        double expected = 6.28;
        int r = 1;

        //act
        double result = Main.calculateCircleLength(r);

        //assert
        Assert.assertTrue(expected == result);
    }
}

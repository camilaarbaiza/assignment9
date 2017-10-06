import org.junit.Assert;

import static org.junit.Assert.*;

public class LinearEquationTest {

    LinearEquation example1 = new LinearEquation(9, 4, 3, -5, -6, -21);
    double answer1 = -2;
    double answer2 = 3;

    @org.junit.Test
    public void getX() throws Exception {

        Assert.assertEquals(answer1, example1.getX(),0);

    }

    @org.junit.Test
    public void getY() throws Exception {

        Assert.assertEquals(answer2, example1.getY(), 0);


    }

}
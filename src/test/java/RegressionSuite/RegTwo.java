package RegressionSuite;

import base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegTwo extends BaseTest {
    public RegTwo() throws IOException {
        super();
    }

    @Test
    void regTestTwo_1(){
        System.out.println("regTestTwo_1");
    }
    @Test
    void regTestTwo_2(){
        System.out.println("regTestTwo_2");
    }
}

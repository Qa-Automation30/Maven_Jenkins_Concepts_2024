package RegressionSuite;

import base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegOne extends BaseTest {

    public RegOne() throws IOException {
        super();
    }

    @Test
    void regTestOne_1(){
        System.out.println("regTestOne_1");
    }
    @Test
    void regTestOne_2(){
        System.out.println("regTestOne_2");
    }
}

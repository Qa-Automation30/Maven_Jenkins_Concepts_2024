package SmokeSuite;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeOne extends BaseTest {
    @Test
    void smoke1() {
        System.out.println("smoke one");
    }

    @Test
    void smoke2() {
        System.out.println("smoke 2");
    }
}

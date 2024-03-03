package SmokeSuite;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SmokeOne extends BaseTest {
    public SmokeOne() throws IOException {
        super();
    }

    @Test
    void smoke1() {
        System.out.println("smoke one");
    }

    @Test
    void smoke2() {
        System.out.println("smoke 2");
    }
}

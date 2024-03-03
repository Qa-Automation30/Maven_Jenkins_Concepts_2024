package SanitySuite;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SanityTwo extends BaseTest {
    public SanityTwo() throws IOException {
        super();
    }

    @Test
    void sanityTwo_1(){
        System.out.println("sanityTwo_1");
    }
    @Test
    void sanityTwo_2(){
        System.out.println("sanityTwo_2");
    }
}

package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    static FileInputStream fis;
    static Properties prop;

    public BaseTest() throws IOException {
        System.out.println("comes into before suite");

        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\prop.config");
        prop = new Properties();
        prop.load(fis);
        // First need to set up the env on which you want to run your test cases-->
        // Second need to pass the URL for which you need to test, means QA URL, UAT Url, Dev URL
        if(System.getProperty("env").equalsIgnoreCase("QA")){
            setupBrowser();
        }
        else if(System.getProperty("env").equalsIgnoreCase("UAT")){
            setupBrowser();
        }
        else {
            setupBrowser();
        }
    }
    void setupBrowser(){
           if(System.getProperty("browser").equalsIgnoreCase("chrome")){
                System.out.println("Chrome driver Launched with below URL");

           }
           else if(System.getProperty("browser").equalsIgnoreCase("firefox")){
               System.out.println("firefox driver Launched with below URL");
           }
           else {
               System.out.println("edge driver Launched with below URL");
           }
    }

    @AfterSuite
    void tearDown(){

    }
}

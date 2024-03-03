package base;

import org.testng.annotations.AfterSuite;

import java.io.FileInputStream;
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
            System.out.println("in QA");
            setupBrowser();
        }
        else if(System.getProperty("env").equalsIgnoreCase("UAT")){
            System.out.println("In UAT Env");
            setupBrowser();
        }
        else {
            System.out.println("In PreProd Env");
            setupBrowser();
        }
    }
    void setupBrowser(){
           if(System.getProperty("browser").equalsIgnoreCase("chrome")){
                System.out.println("Chrome driver setup done");
               launchURL();

           }
           else if(System.getProperty("browser").equalsIgnoreCase("firefox")){
               System.out.println("firefox driver driver setup done");
               launchURL();
           }
           else {
               System.out.println("edge driver setup done");
               launchURL();
           }
    }
    void launchURL(){
        if(System.getProperty("url").equalsIgnoreCase("qaURL")){
            System.out.println("QA URL Launched");

        }
        else if(System.getProperty("url").equalsIgnoreCase("uatURL")){
            System.out.println("UAT URL Launched");
        }
        else {
            System.out.println("Pre Prod URL Launched");
        }
    }

    @AfterSuite
    void tearDown(){

    }
}

//  mvn test -PRegression -Denv=QA -Dbrowser=chrome
//  mvn test -PRegression -Denv=qa -Dbrowser=chrome -Durl=uatURL

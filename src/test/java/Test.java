/**
 * Created by m18 on 19.01.2016.
 */
import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class Test {
    private Selenium selenium;

    @Before
    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://backendless.com/");
        selenium.start();
    }

    @Test
    public void testJava() throws Exception {
        selenium.open("/");
        selenium.click("css=a.contact-form-btn.hidden-xs > span");
        selenium.type("name=your-name", "my");
        selenium.type("name=your-company", "company");
        selenium.type("name=your-phone", "hello");
        selenium.type("name=your-email", "email");
        selenium.type("name=your-message", "1!");
        selenium.click("css=input.wpcf7-form-control.wpcf7-submit");
        selenium.click("//div[3]/span");
    }

    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }
}


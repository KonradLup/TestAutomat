import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestSetup {

    String projectLocation = System.getProperty("user.dir");
    WebDriver driver;


    //hermetyzacja: public/private/protected
    @BeforeEach
    public void setup() {
        System.out.println(projectLocation);
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }

    public void testone() {
    }

    @AfterEach
    public void teardown() {
        // różnica pomiędzy driver.close(), a driver.quit()
        driver.close();
    }
}

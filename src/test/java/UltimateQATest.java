import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Git - system kontroli wersji

public class UltimateQATest extends BaseTestSetup {

    @Test
     public void testOne() {
        WebElement buttonUsingId = driver.findElement(By.id("idExample"));
        Assertions.assertTrue(buttonUsingId.isDisplayed());
        buttonUsingId.click();

        //log.info

        WebElement textButtonSucces = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals("ButtonSucces", textButtonSucces.getText());
    }

        //input[@id='et_pb_contact_name_0']   1 out of 1
        //input[@class='input et_contact_error']   1 out of 2
        //input[@class='input et_contact_error' and @id='et_pb_contact_name_0']
        //*[@class='et_pb_contact']/form[@class='et_pb_contact_form clearfix']/p/input
        //*[@class='et_pb_contact']/form[@class='et_pb_contact_form clearfix']//input
        //*[@class='et_pb_contact']/form[@class='et_pb_contact_form clearfix']//input[@id='et_pb_contact_name_0']
        //input[@placeholder='Name']
        //*[@placeholder='Name']
        //*[text()="Email Me!"]
        //*[contains(text(), 'Email Me')]

        //*[] - ogolna postac XPath

        @Test
        public void testTwo() {
        WebElement inputName = driver.findElement(By.xpath("//input[@id='et_pb_contact_name_0']"));
        inputName.sendKeys("Tester");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='et_pb_contact_email_0']"));
        inputEmail.sendKeys("tester@tester.pl");

        WebElement buttonEmailMe = driver.findElement(By.xpath("//*[text()=\"Email Me!\"]"));
        Assertions.assertTrue(buttonEmailMe.isDisplayed());
        buttonEmailMe.click();

        WebElement textThanks = driver.findElement(By.xpath("//*[@id='et_pb_contact_form_0']//p"));

}


    }


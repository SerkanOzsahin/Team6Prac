package tolgaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//1-siteye gidin
//https://demoqa.com/
//2-forms seçin
//3-practice form seçin
//4-formu dolurup submit yapın
//5-form penceresini close ile kapatın
public class tolgaBaslangic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement formButton = driver.findElement(By.className("card-body"));
        formButton.click();
         Thread.sleep(3000);

        WebElement toolsFormButton = driver.findElement(By.className("pr-1"));
        toolsFormButton.click();
        Thread.sleep(3000);

        WebElement practiceFormButton = driver.findElement(By.xpath("//div[text()='Forms']"));
        practiceFormButton.click();
        Thread.sleep(3000);

        WebElement fformButton = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        fformButton.click();
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.id("firstName"));
        name.sendKeys("Tolga");
        Thread.sleep(3000);


        WebElement surname = driver.findElement(By.id("lastName"));
        surname.sendKeys("Aktaş");
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("akts.tlga@gmail.com");
        Thread.sleep(3000);

        WebElement genderMale=driver.findElement(By.className("custom-control-label"));
        genderMale.click();
        Thread.sleep(3000);

        WebElement mobileNumber=driver.findElement(By.id("userNumber"));
        mobileNumber.sendKeys("5555555555");
        Thread.sleep(3000);

       // WebElement subjects=driver.findElement(By.id("subjectsContainer"));
       // subjects.click();
       // Thread.sleep(2000);

        //WebElement hobbies=driver.findElement(By.id("hobbies-checkbox-1"));
        // Thread.sleep(2000);
        //hobbies.click();

        WebElement currentAdress=driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys("Sakarya/Akyazı");

        WebElement selectState=driver.findElement(By.id("state"));
        selectState.click();


    }
}

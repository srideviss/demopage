import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class selenium {
    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunkumarm\\Downloads\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         WebDriverWait wait = new WebDriverWait(driver, 20);

         driver.get("https://www.demoblaze.com/index.html");
         driver.manage().window().maximize();

         WebElement Loginbutton = driver.findElement(By.id("login2"));
         Loginbutton.click();

         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);



         WebElement username = driver.findElement(By.id("loginusername"));
         wait.until(ExpectedConditions.elementToBeClickable(username));
         username.sendKeys("adf");

         WebElement password = driver.findElement(By.id("loginpassword"));
         password.sendKeys("adf");

         WebElement login = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
         login.click();

         Thread.sleep(2000);

         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
         WebElement product = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));

         product.click();


         WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
         wait.until(ExpectedConditions.elementToBeClickable(addtocart));
         addtocart.click();

         Thread.sleep(2000);

         driver.switchTo().alert().accept();

         WebElement cart = driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a"));
         cart.click();

         Thread.sleep(2000);
         WebElement placeorder = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button"));
         placeorder.click();

         WebElement name = driver.findElement(By.id("name"));
         name.sendKeys("adf");

         WebElement country = driver.findElement(By.id("country"));
         country.sendKeys("india");

         WebElement city = driver.findElement(By.id("city"));
         city.sendKeys("chennai");

         WebElement card = driver.findElement(By.id("card"));
         card.sendKeys("123456789");

         WebElement month = driver.findElement(By.id("month"));
         month.sendKeys("jan");

         WebElement year = driver.findElement(By.id("year"));
         year.sendKeys("2020");

         WebElement purchase = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
         purchase.click();

         Thread.sleep(2000);

         WebElement ok = driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"));
         ok.click();
        
         System.out.println("execution is over");


    }
}

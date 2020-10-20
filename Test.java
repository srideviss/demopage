import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirubakaranb\\Downloads\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement Username=driver.findElement(By.id("user-name"));
        Username.sendKeys("standard_user");
        WebElement Password=driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        WebElement Login=driver.findElement(By.id("login-button"));
        Login.click();
        Thread.sleep(3000);

        WebElement Product=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/a/div"));
        Product.click();

        WebElement AddtoCard=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
         AddtoCard.click();
        Thread.sleep(3000);
        WebElement Card=driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span"));
        Card.click();
        WebElement Checkout=driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
        Checkout.click();
        driver.findElement(By.id("first-name")).sendKeys("kiruba");
        driver.findElement(By.id("last-name")).sendKeys("karan");
        driver.findElement(By.id("postal-code")).sendKeys("600099");
        Thread.sleep(3000);
        WebElement Finish=driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
        Finish.click();
        driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();

    }
}
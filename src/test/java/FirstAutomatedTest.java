import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomatedTest {
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
        WebElement signInButton = driver.findElement(By.xpath("//div[@id='MenuContent']/a[2]"));
        signInButton.click();
        WebElement registerNowButton = driver.findElement(By.xpath("//div[@id='Catalog']/a[1]"));
        registerNowButton.click();
        WebElement userId = driver.findElement(By.xpath("//input[@name='username']"));
        userId.sendKeys("Rafal12");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Rafal1234");
        WebElement repeatPassword = driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
        repeatPassword.sendKeys("Rafal1234");
        WebElement firstName = driver.findElement(By.xpath("//input[@name='account.firstName']"));
        firstName.sendKeys("Rafal");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='account.lastName']"));
        lastName.sendKeys("Rafalski");
        WebElement email = driver.findElement(By.cssSelector("[name='account.email']"));
        email.sendKeys("rafal.k12@gmail.com");
        WebElement phone = driver.findElement(By.cssSelector("[name='account.phone']"));
        phone.sendKeys("500400234");
        WebElement address1 = driver.findElement(By.cssSelector("[name='account.address1']"));
        address1.sendKeys("Mokotowska12");
        WebElement address2 = driver.findElement(By.cssSelector("[name='account.address2']"));
        address2.sendKeys("Bemowska2");
        WebElement city = driver.findElement(By.cssSelector("[name='account.city'"));
        city.sendKeys("Warsaw");
        WebElement state = driver.findElement(By.cssSelector("[name='account.state']"));
        state.sendKeys("PL");
        WebElement zip = driver.findElement(By.cssSelector("[name='account.zip']"));
        zip.sendKeys("02-100");
        WebElement country = driver.findElement(By.cssSelector("[name='account.country']"));
        country.sendKeys("Poland");
        WebElement languageDropdown = driver.findElement(By.cssSelector("option[value='japanese']"));
        languageDropdown.click();
        WebElement favouriteCategoryDropdown = driver.findElement(By.cssSelector("option[value='DOGS']"));
        favouriteCategoryDropdown.click();
        WebElement myListCheckbox = driver.findElement(By.cssSelector("input[name='account.listOption']"));
        myListCheckbox.getText();
        WebElement saveAccountInfo = driver.findElement(By.cssSelector("[NAME='newAccount']"));
        saveAccountInfo.click();



    }

    @AfterMethod
    public void afterMethod() {

//        driver.close(); // służy do zamkniecia strony internetowej ( za pomocą x).
//        driver.quit(); // służy do zabicia procesu google chrome.
    }
}


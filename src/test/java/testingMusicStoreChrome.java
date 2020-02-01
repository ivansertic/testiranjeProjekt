import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class testingMusicStoreChrome {

    private WebDriver chromeDriver;
    private WebDriverWait waitChrome;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        waitChrome = new WebDriverWait(chromeDriver,20);
        chromeDriver.navigate().to("https://musicshop.hr/");

    }

    @Test
    public void signInWithNoPassword()  {
        chromeDriver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/div[3]/div[1]/input")).click();

        WebElement signIn;
        signIn = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/header/div/div/div/nav/dl[2]/dt/a")));
        signIn.click();

        WebElement emailField;
        emailField = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div/div[1]/form/section/div[1]/div/div[1]/input")));
        emailField.sendKeys("testiranje@mail.com");

        WebElement submitButton;
        submitButton = waitChrome.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div/div[1]/form/section/div[2]/button"))));
        submitButton.click();

        waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div[1]")));
        chromeDriver.quit();
    }

    @Test
    public void signIn() throws InterruptedException {

        signInMethod();
        Thread.sleep(3000);
        chromeDriver.quit();
    }

    @Test
    public void signOut() throws InterruptedException {
        signInMethod();

        WebElement signOut;
        signOut = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/header/div/div/div/nav/dl[2]/dt/a")));
        signOut.click();

        Thread.sleep(3000);

        chromeDriver.quit();
    }

    @Test
    public void addElementToCart() throws InterruptedException {

        signInMethod();

        Thread.sleep(3000);

        addToCartMethod();

        Thread.sleep(3000);

        chromeDriver.quit();
    }

    @Test
    public void deleteItemFromCart() throws InterruptedException {
        signInMethod();

        Thread.sleep(3000);


        addToCartMethod();

        WebElement deleteButton;
        deleteButton = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr/td[6]/div/div/a")));
        deleteButton.click();

        waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/div[1]/p")));

        Thread.sleep(3000);

        chromeDriver.quit();

    }

    private  void signInMethod() throws InterruptedException {
        chromeDriver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/div[3]/div[1]/input")).click();

        WebElement signIn;
        signIn = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/header/div/div/div/nav/dl[2]/dt/a")));
        signIn.click();

        Thread.sleep(3000);
        WebElement emailField;
        emailField = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div/div[1]/form/section/div[1]/div/div[1]/input")));
        emailField.sendKeys("testiranje@mail.com");

        Thread.sleep(3000);
        WebElement password;
        password = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div/div[1]/form/section/div[1]/div/div[2]/input")));
        password.sendKeys("12345678");

        Thread.sleep(300);
        WebElement submitButton;
        submitButton = waitChrome.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div/div[1]/form/section/div[2]/button"))));
        submitButton.click();
    }

    private void addToCartMethod() throws InterruptedException {
        Actions hover = new Actions(chromeDriver);
        WebElement guitar = chromeDriver.findElement(By.xpath("/html/body/div[4]/header/section[3]/div/div/nav/ul/li[2]/div/a"));
        hover.moveToElement(guitar).build().perform();
        hover.moveToElement(chromeDriver.findElement(By.xpath("/html/body/div[4]/header/section[3]/div/div/nav/ul/li[2]/div/ul/li[1]/a"))).build().perform();
        hover.moveToElement(chromeDriver.findElement(By.xpath("/html/body/div[4]/header/section[3]/div/div/nav/ul/li[2]/div/ul/li[1]/ul/li[1]/a"))).click().build().perform();

        Thread.sleep(3000);

        WebElement addToCart;
        addToCart = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div[2]/div[2]/div[4]/a[1]")));
        addToCart.click();

        WebElement goToCheckout;
        goToCheckout = waitChrome.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/header/section[1]/div/div/div[1]/div[2]/div/div[3]/div[1]/div[3]/div[6]/a")));
        goToCheckout.click();
    }


}

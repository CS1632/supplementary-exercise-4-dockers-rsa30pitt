// Generated by Selenium IDE
package edu.pitt.cs;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--headless");
      driver = new ChromeDriver(options);
      js = (JavascriptExecutor) driver;
      vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
      driver.quit();
    }
    @Test
    public void tEST2RESET() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
      driver.findElement(By.xpath("//a[contains(@href, \'/reset\')]")).click();
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 1. Jennyanydots\')]")).getText(), is("ID 1. Jennyanydots"));
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 2. Old Deuteronomy\')]")).getText(), is("ID 2. Old Deuteronomy"));
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 3. Mistoffelees\')]")).getText(), is("ID 3. Mistoffelees"));
      driver.close();
    }
    @Test
    public void tEST4LISTING() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
      driver.findElement(By.xpath("//a[contains(text(),\'Catalog\')]")).click();
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 3. Mistoffelees\')]")).getText(), is("ID 3. Mistoffelees"));
      driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).click();
      driver.close();
    }
    @Test
    public void tEST6RENT() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
      driver.findElement(By.linkText("Reset")).click();
      driver.findElement(By.linkText("Rent-A-Cat")).click();
      driver.findElement(By.id("rentID")).click();
      driver.findElement(By.id("rentID")).sendKeys("1");
      driver.findElement(By.xpath("//button[@onclick=\'rentSubmit()\']")).click();
      assertThat(driver.findElement(By.id("rentResult")).getText(), is("Success!"));
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'Rented out\')]")).getText(), is("Rented out"));
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 2. Old Deuteronomy\')]")).getText(), is("ID 2. Old Deuteronomy"));
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 3. Mistoffelees\')]")).getText(), is("ID 3. Mistoffelees"));
      driver.close();
    }
    @Test
    public void tEST8FEEDACAT() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
      driver.findElement(By.linkText("Feed-A-Cat")).click();
      {
        List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Feed\')]"));
        assert(elements.size() > 0);
      }
      driver.close();
    }
    @Test
    public void tEST9FEED() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
      driver.findElement(By.linkText("Feed-A-Cat")).click();
      driver.findElement(By.id("catnips")).click();
      driver.findElement(By.id("catnips")).sendKeys("6");
      driver.findElement(By.cssSelector(".btn")).click();
      driver.findElement(By.xpath("//div[@id=\'feedResult\']")).click();
      driver.close();
    }
    @Test
    public void tEST10GREETACAT() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
      driver.findElement(By.linkText("Greet-A-Cat")).click();
      assertThat(driver.findElement(By.xpath("//h4[contains(.,\'Meow!Meow!Meow!\')]")).getText(), is("Meow!Meow!Meow!"));
      driver.close();
    }
    @Test
    public void tEST11GREETACATWITHNAME() {
      driver.get("http://localhost:8080/greet-a-cat/Jennyanydots");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
      driver.findElement(By.xpath("//h4[contains(.,\'Meow! from Jennyanydots.\')]")).click();
    }
    @Test

    public void tEST1LINKS() {
  
      driver.get("http://localhost:8080/");
  
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
  
      {
  
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Reset\')]"));
  
        String attribute = element.getAttribute("href");
  
        vars.put("href", attribute);
  
      }
  
      assertEquals("http://localhost:8080/reset", vars.get("href").toString());
  
    }
    @Test
    public void tEST3CATALOG() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
      driver.findElement(By.linkText("Catalog")).click();
      {
        WebElement element = driver.findElement(By.xpath("//img[@alt=\'Old Deuteronomy\']"));
        String attribute = element.getAttribute("src");
        vars.put("img_src", attribute);
      }
      assertEquals("http://localhost:8080/images/cat2.jpg", vars.get("img_src").toString());
    }
    @Test
    public void tEST5RENTACAT() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
      driver.findElement(By.linkText("Rent-A-Cat")).click();
      {
        List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Rent\')]"));
        assert(elements.size() > 0);
      }
      {
        List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Return\')]"));
        assert(elements.size() > 0);
      }
    }
    @Test
    public void tEST7RETURN() {
      driver.get("http://localhost:8080/");
      js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
      driver.findElement(By.linkText("Rent-A-Cat")).click();
      driver.findElement(By.id("returnID")).click();
      driver.findElement(By.id("returnID")).sendKeys("2");
      driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 1. Jennyanydots\')]")).getText(), is("ID 1. Jennyanydots"));
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 2. Old Deuteronomy\')]")).getText(), is("ID 2. Old Deuteronomy"));
      assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 3. Mistoffelees\')]")).getText(), is("ID 3. Mistoffelees"));
      assertThat(driver.findElement(By.xpath("//div[@id=\'returnResult\']")).getText(), is("Success!"));
    }
  }
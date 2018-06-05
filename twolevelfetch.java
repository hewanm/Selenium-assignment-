package Fetch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class twowayfetch {
    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver =new ChromeDriver() ;
        driver.get("https://www.google.com");

        List<WebElement> links= driver.findElements(By.tagName("a"));

        for (WebElement ele:links){
            String lin=ele.getAttribute("href");
            System.out.println(lin);

            WebDriver d =new ChromeDriver() ;
            List<WebElement> links2= d.findElements(By.tagName("a"));
            d.get(lin);

            for (WebElement elem:links2){

                System.out.println(elem.getAttribute("href"));
            }

        }


    }
}

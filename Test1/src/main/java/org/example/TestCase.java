package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCase {




    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        browser.manage().window().maximize();
        browser.get("https://www.booking.com");

        browser.findElement(By.cssSelector(".f4552b6561")).click();
        //Gasi promo reklamu
        //browser.findElement(By.cssSelector("[name='ss']")).sendKeys("Kopaonik");

        browser.findElement(By.cssSelector(".eb46370fe1")).sendKeys("Kopaonik");



        //Click za date
        browser.findElement(By.cssSelector(".fe211c0731")).click();

        browser.findElement(By.cssSelector("[data-date='2023-09-19']")).click();

        browser.findElement(By.cssSelector("[data-date='2023-09-22']")).click();

        browser.findElement(By.cssSelector("[data-testid='occupancy-config']")).click();

        browser.findElement(By.cssSelector(".f4d78af12a")).click();
        //Povecava broj odraslih osoba

        browser.findElements(By.cssSelector(".f4d78af12a")).get(1).click();

        //Odabir broja dece
        browser.findElement(By.cssSelector("[name=\"age\"]")).click();
        //Broj godina deteta
        browser.findElement(By.cssSelector("[data-key=\"3\"]")).click();
        //Klik Done
        browser.findElement(By.cssSelector(".d285d0ebe9")).click();
        //Klik na Search
        browser.findElement(By.cssSelector("[type=\"submit\"]")).click();

        browser.quit();





        //WebDriver datePicker = (WebDriver) browser.findElement(By.cssSelector(".c5d667353d efea941f13"));
        //datePicker.close();

        //browser.findElement(By.cssSelector(".2023-07-20")).click();







        //browser.switchTo().frame("e5aa33035e");
        //browser.findElements(By.cssSelector("button.ae1678b153")).













    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jenkins {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/login.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Security Project']")).click();


        driver.quit();
    }
}

package ru.test.selenium.testfilms;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFilmTitle1 extends ru.test.selenium.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testCreateFilmTitle1() throws Exception {
    driver.findElement(By.cssSelector("img[alt=\"Add movie\"]")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Title1");
    driver.findElement(By.name("year")).clear();
    driver.findElement(By.name("year")).sendKeys("2000");
    driver.findElement(By.name("duration")).clear();
    driver.findElement(By.name("duration")).sendKeys("1");
    driver.findElement(By.name("rating")).clear();
    driver.findElement(By.name("rating")).sendKeys("1");
    driver.findElement(By.name("notes")).clear();
    driver.findElement(By.name("notes")).sendKeys("notes");
    driver.findElement(By.name("taglines")).clear();
    driver.findElement(By.name("taglines")).sendKeys("taglines");
    driver.findElement(By.name("plotoutline")).clear();
    driver.findElement(By.name("plotoutline")).sendKeys("plot");
    driver.findElement(By.name("plots")).clear();
    driver.findElement(By.name("plots")).sendKeys("plots");
    driver.findElement(By.id("text_languages_0")).clear();
    driver.findElement(By.id("text_languages_0")).sendKeys("lang");
    driver.findElement(By.name("subtitles")).clear();
    driver.findElement(By.name("subtitles")).sendKeys("sub");
    driver.findElement(By.name("audio")).clear();
    driver.findElement(By.name("audio")).sendKeys("audio");
    driver.findElement(By.name("video")).clear();
    driver.findElement(By.name("video")).sendKeys("video");
    driver.findElement(By.name("country")).clear();
    driver.findElement(By.name("country")).sendKeys("country");
    driver.findElement(By.name("genres")).clear();
    driver.findElement(By.name("genres")).sendKeys("genres");
    driver.findElement(By.name("director")).clear();
    driver.findElement(By.name("director")).sendKeys("director");
    driver.findElement(By.name("writer")).clear();
    driver.findElement(By.name("writer")).sendKeys("writer");
    driver.findElement(By.name("producer")).clear();
    driver.findElement(By.name("producer")).sendKeys("producer");
    driver.findElement(By.name("music")).clear();
    driver.findElement(By.name("music")).sendKeys("music");
    driver.findElement(By.name("cast")).clear();
    driver.findElement(By.name("cast")).sendKeys("cast");
    driver.findElement(By.id("submit")).click();
	driver.findElement(By.cssSelector("h1")).click();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

package utils;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.epam.healenium.SelfHealingDriver;
import com.google.common.io.Files;

//import io.cucumber.core.api.Scenario;
import io.cucumber.java.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SharedResource {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.out.println("******* - Start of Scenario - *******");
		WebDriverManager.chromedriver().setup();

		WebDriver chromedriver = new ChromeDriver();
		// declare delegate
		// create Self-healing driver
		driver = SelfHealingDriver.create(chromedriver);

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(40000);
		System.out.println("Before Click");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		Thread.sleep(20000);
		System.out.println("After Click");

		System.out.println("*******--End of Scenario--*******");

		driver.quit();

	}
}
package com.projectBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectBaseMethod {

	public ChromeDriver driver;
	public static Properties properties;
	
	@BeforeMethod
	public void preCondition() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		properties = new Properties();
		FileInputStream fs = new FileInputStream("./src/main/resources/config.properties");
		properties.load(fs);
		
		driver.get(properties.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}

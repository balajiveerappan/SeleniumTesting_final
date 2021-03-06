package com.cglean.cloudnative.demo.server;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class SeleniumTesting_ZDD {
	
	
	
	@Test
	public  void SeleniumTesting() throws InterruptedException {
			
			{
				//System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Jenkins/workspace/ZDD_selenium/chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				//WebDriver driver = new RemoteWebDriver(new URL("http://jenkins.mydomain:4444/wd/hub"), capability);
				//DesiredCapabilities capability = DesiredCapabilities.firefox();
				//capability.setCapability("jenkins.label","redhat5 && amd64");
				//capability.setCapability("jenkins.nodeName","(master)");
				
				
				//WebDriver driver = new RemoteWebDriver(new URL("http://54.83.156.141:8080/wd/hub"), capability);
			//	System.setProperty("webdriver.gecko.driver", "C:/Program Files (x86)/Jenkins/workspace/ZDD_selenium/geckodriver.exe");
			//	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			//	capabilities.setCapability("marionette", true);
			//	WebDriver driver = new FirefoxDriver(capabilities);
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				WebDriver driver = new RemoteWebDriver(capabilities);
			
	
			
				//WebDriver driver = new FirefoxDriver();
				driver.navigate().to("http://shows-cglean.cglean.com/");
				driver.manage().window().maximize();
				Thread.sleep(1000);

				driver.findElement(
						By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li/a"))
						.click();

				driver.findElement(By.id("loadButton")).click();
				Thread.sleep(10000);

				driver.findElement(By.id("loadButton")).click();

				driver.findElement(
						By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[2]/a"))
						.click();
				Thread.sleep(10000);

				driver.findElement(
						By.cssSelector("div[id$='bs-example-navbar-collapse-1']>ul>li:nth-child(3)>a"))
						.click();
				Thread.sleep(1000);

				driver.findElement(By.xpath("//a[text()[contains(.,'Refresh')]]"))
						.click();
				Thread.sleep(10000);

				driver.findElement(By.id("loadButton")).click();
				Thread.sleep(10000);

				driver.findElement(
						By.xpath("//a[text()[contains(.,'Stop Simulation')]]"))
						.click();
				Thread.sleep(1000);

				WebElement shows = driver.findElement(By
						.cssSelector("div[id$='bluegreenBlock']>p"));


				String showcount = shows.getText();

				System.out.print(showcount);
				
				String[] splitStr = showcount.split("\\s+");
				
				String results = "";
				if(Integer.parseInt(splitStr[2])>5){
					results = "PASS";
				}else{
					results = "FAIL";
				}


				System.out.println(results);
				driver.close();
				
				
			}
		}

}

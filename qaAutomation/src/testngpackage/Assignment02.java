package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment02 {
	WebDriver browserObject;
	// 4. Use @Test to generate the test report
	 @Test
	    public void performLogin() throws InterruptedException {
	        System.out.println("Performing Login and wait for 2 seconds");
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    	// 3. Initialize WebDriver object through ChromeDriver class.
	            browserObject = new ChromeDriver();
	        browserObject .get( "http://demo.itlearn360.com/");
	        browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        WebElement button=browserObject.findElement(By.className("lg_button"));
	        button.click();
		   // 6. Get reference of Email input box by locate the id method.
	        WebElement username = browserObject .findElement(By.id("user_login"));
		    // 7. Get reference of Password input box by locate the id method.
	        WebElement password = browserObject .findElement(By.id("user_pass"));
		    // 8. Get reference of login button by locate the classname method.
	        WebElement submitBtn = browserObject .findElement(By.name("wp-submit"));
	     // 9. Clear the Email input box.
	       
		    // 10. Provide/Enter the correct email to email input box through reference.
	        username.sendKeys("Demo12");
		    // 11. Clear the Password input box.
	       
		    // 12. Provide/Enter the correct password to password input box through reference.
	        password.sendKeys("Test123456$");
		    // 13. Submit the button.
	        submitBtn.click();
	        System.out.println("End Result: Form submitted");
	        Thread.sleep(2000);
	 }
	        @BeforeTest
	        public void beforeTest() throws InterruptedException {
	            System.out.println("--@beforeTest, set the browser, maximise the window");
	    	// 2. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
	            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	            browserObject = new ChromeDriver();
	            
	    	// 3. Initialize Webdriver object through ChromeDriver class.
	            browserObject.manage().window().maximize();
	            browserObject .get( "http://demo.itlearn360.com/");
		        browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		        WebElement button=browserObject.findElement(By.className("lg_button"));
		        button.click();
			   // 6. Get reference of Email input box by locate the id method.
		        WebElement username = browserObject .findElement(By.id("user_login"));
			    // 7. Get reference of Password input box by locate the id method.
		        WebElement password = browserObject .findElement(By.id("user_pass"));
			    // 8. Get reference of login button by locate the classname method.
		        WebElement submitBtn = browserObject .findElement(By.name("wp-submit"));
		     // 9. Clear the Email input box.
		       
			    // 10. Provide/Enter the correct email to email input box through reference.
		        username.sendKeys("Demo12");
			    // 11. Clear the Password input box.
		       
			    // 12. Provide/Enter the correct password to password input box through reference.
		        password.sendKeys("Test123456$");
			    // 13. Submit the button.
		        submitBtn.click();
		        System.out.println("End Result: Form submitted");
		        Thread.sleep(2000);
		        browserObject.findElement(By.name("search_course")).sendKeys("Courses ");
				// 5. Locate the search button and perform click
				browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).submit();
				// 6. close the browser
				browserObject.close();
				WebElement button1=browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a"));
				button1.click();
	        }
	        
	    }
	
	    


		
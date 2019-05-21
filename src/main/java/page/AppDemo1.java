package page;


import io.appium.java_client.AppiumDriver;
import io.appium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;

public class AppDemo1 {
    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "com.qianmi.bolt-master-584-dinghuo-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        //capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("deviceName","f54cf48d");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.qianmi.bolt");
        //capabilities.setCapability("appActivity", ".ContactManager");
        capabilities.setCapability("appActivity", "com.qianmi.blot");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void Etbtest1(){

      //  driver.resetApp();
        waitAction(50000);
     /*   List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        System.out.println(textFieldsList);
        waitAction(30000);
    	textFieldsList.get(0).clear();
    	waitAction(5000);
    	textFieldsList.get(1).clear();
    	waitAction(5000);
    	textFieldsList.get(0).sendKeys("finaltest4@etb.com");
    	waitAction(5000);
    	textFieldsList.get(1).sendKeys("test1234567");
    	waitAction(5000);
    	driver.findElementByClassName("android.widget.Button").click();
    	waitAction(5000);*/


        //    WebElement el = driver.findElementById("com.huawei.etb:id/edt_loginname");
      //  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //   WebElement el = driver.findElement(By.id("com.huawei.etb:id/edt_loginname"));
       // WebElement username = driver.findElementByName("Correo Electr��nico");
        //	WebElement el = driver.findElementByXPath("//RelativeLayout/LinearLayout[1]/EditText[1]");
      /*  username.click();
        waitAction(3000);
        username.sendKeys("finaltest4@etb.com");
        WebElement passwd = driver.findElement(By.id("com.huawei.etb:id/edt_loginpsw"));
        passwd.click();
        waitAction(3000);
        passwd.sendKeys("test1234567");
        waitAction(3000);
        driver.hideKeyboard();
        waitAction(3000);
        WebElement loginBT = driver.findElementByClassName("android.widget.Button");
        waitAction(3000);
        loginBT.click();
        waitAction(10000);
        System.out.println(driver.findElementByName("ETB Play").isDisplayed());
        Assert.assertTrue(driver.findElementByName("ETB Play").isDisplayed());


        //	driver.findElementById("com.huawei.etb:id/btn_toggle").click();
        driver.findElementById("com.huawei.etb:id/iv_more").click();
        waitAction(3000);
        driver.findElementByName("Log Out").click();
        waitAction(3000);
        driver.findElementByName("Confirm").click();
        System.out.println(driver.findElementById("com.huawei.etb:id/edt_loginpsw").isDisplayed());
        System.out.println(driver.findElementByName("Log In").isDisplayed());

        Assert.assertTrue(driver.findElementById("com.huawei.etb:id/edt_loginpsw").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Log In").isDisplayed());

        /*
         driver.launchApp();
         driver.resetApp();
          String test1=driver.currentActivity();
    	waitAction(5000);
    	System.out.println(test1);

         */

   /*     WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        waitAction(5000);
        List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        waitAction(5000);
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();  */
    }

    private void waitAction(int i) {
        // TODO Auto-generated method stub

    }
}
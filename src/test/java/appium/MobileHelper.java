package appium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.appium.java_client.MobileBy;

import static appium.AppiumSetup.driver;
import static appium.AppiumSetup.locateElements;

public class MobileHelper {
    public static void scrollToWithHelper(String text, String uiselector){
        driver.findElement(MobileBy.AndroidUIAutomator ("new UiScrollable(new UiSelector().resourceId(\""+uiselector+"\")).scrollIntoView("
                + "new UiSelector().text(\""+text+"\"));"));

    }

    public static void scrollToHelper(String text){
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollTextIntoView(\""+text+"\")")));
    }
}

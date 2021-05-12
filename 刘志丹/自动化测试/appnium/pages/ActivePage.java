package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class ActivePage {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;

//		���췽��
	public  ActivePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
//	����
	public AndroidElement action_dz() {
		return driver.findElement(By.id("com.example.shoujiedemo:id/follow_heart_btn_like"));
	}
//	ɾ������
	public AndroidElement action_article() {
		return driver.findElementByAccessibilityId("����");
	}
	public AndroidElement action_articleId() {
		return driver.findElement(By.id("com.example.shoujiedemo:id/follow_heart_tv_cotent"));
	}
	public AndroidElement action_menu() {
		return driver.findElement(By.id("com.example.shoujiedemo:id/btn_menu"));
	}
	public AndroidElement action_sc() {
		return driver.findElement(By.id("com.example.shoujiedemo:id/comment_tv_delete"));
	}
	public void delete_comment() throws InterruptedException {
		action.click(action_article());
		Thread.sleep(2000);
		action.click(action_articleId());
		Thread.sleep(2000);
		action.click(action_menu());
		Thread.sleep(2000);
		action.click(action_sc());
	}

}

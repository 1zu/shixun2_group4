package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class CollectPage {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;

//		���췽��
	public  CollectPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

//		ҳ�����
	public AndroidElement action_space() {
		return driver.findElementById("com.example.shoujiedemo:id/myCenter_mySpace");
	}
	public AndroidElement action_wj() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
				+ "/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager"
				+ "/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout"
				+ "/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout"
				+ "/android.widget.RelativeLayout/android.widget.ImageView");
	}
//	�ղ�
	public AndroidElement action_col() {
		return driver.findElementById( "com.example.shoujiedemo:id/follow_article_btn_collection");
	}
	public AndroidElement action_list() {
		return driver.findElementById("com.example.shoujiedemo:id/set_rl");
	}
	public AndroidElement action_bcol() {
		return driver.findElementById("com.example.shoujiedemo:id/item_btn_collect");
	}
//	��ע
	public AndroidElement action_gz() {
		return driver.findElementById("com.example.shoujiedemo:id/follow_article_btn_follow");
	}
//	����
	public AndroidElement action_dz(){
		return driver.findElementById("com.example.shoujiedemo:id/follow_article_btn_like");
	}
//�޸ĸ�����Ϣ
	public AndroidElement action_personInfo() {
		return driver.findElementById("com.example.shoujiedemo:id/myCenter_userInfo");
	}
	public AndroidElement action_update() {
		return driver.findElementById("com.example.shoujiedemo:id/myCenter_PersonalInfo_change");
	}
	public AndroidElement action_insert() {
		return driver.findElement(By.id("com.example.shoujiedemo:id/userInfoChange_sign"));
	}
	public AndroidElement action_confirm() {
		return driver.findElement(By.id("com.example.shoujiedemo:id/userInfoChange_enter"));
	}
	public AndroidElement action_sex() {
		return driver.findElement(By.id("com.example.shoujiedemo:id/userInfoChange_woman"));
	}
	public AndroidElement action_return() {
		return driver.findElement(By.id("com.example.shoujiedemo:id/myCenter_PersonalInfo_return"));
	}
//	ҳ���������
	public void insert(String key) {
		action.type(action_insert(), key);
	}
}

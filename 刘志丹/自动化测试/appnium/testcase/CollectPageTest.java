package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseDriver;
import datasProvider.ExcelDataProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.reactivex.functions.Action;
import pages.CollectPage;
import pages.LoginPage;
import pages.MainPage;
import utils.BaseAction;

public class CollectPageTest extends BaseDriver {
	CollectPage coPage;
	MainPage mainPage;

	@DataProvider(name = "s2")
	public Object[][] getFromExcel() throws IOException {
		return ExcelDataProvider.getData("data/personInfo.xlsx");
	}

	@BeforeClass
	public void test_initPage() {
		LoginPage loginPage = new LoginPage(driver);
		mainPage = loginPage.login("xs", "xs");
		coPage = mainPage.changeActivity();
	}

// �޸ĸ�����Ϣ
	@Test(dataProvider = "s2", priority = 1)
	public void test_action_update(String key) throws InterruptedException {
		System.out.println(driver.currentActivity());
		System.out.println("�������޸ĸ�����Ϣ�Ĳ�������");
		Thread.sleep(3000);
	    coPage.action_personInfo().click();
	    Thread.sleep(2000);
	    coPage.action_update().click();
	    Thread.sleep(2000);
	    coPage.action_sex().click();
	    coPage.insert(key);
	    Thread.sleep(1000);
	    coPage.action_confirm().click();
	    Thread.sleep(1000);
	    coPage.action_return().click();
	}

//	��ע
	@Test(priority = 2)
	public void test_action_gz() throws InterruptedException {
		System.out.println("���й�ע�Ĳ�������");
		System.out.println(driver.currentActivity());
		Thread.sleep(3000);
		coPage.action_space().click();
		Thread.sleep(2000);
		coPage.action_wj().click();
		Thread.sleep(2000);
		coPage.action_gz().click();
	}

//	����
	@Test(priority = 3)
	public void test_action_zdz() throws InterruptedException {
		System.out.println("���е��޵Ĳ�������");
		System.out.println(driver.currentActivity());
		Thread.sleep(2000);
		coPage.action_dz().click();
	}

	@Test(priority = 4)
	public void test_action_zdz2() throws InterruptedException {
		System.out.println("���е�������ȡ�����޵Ĳ�������");
		System.out.println(driver.currentActivity());
		Thread.sleep(2000);
		coPage.action_dz().click();
		Thread.sleep(2000);
		coPage.action_dz().click();
	}

//	�ղ�
	@Test(priority = 5)
	public void test_action_zsc() throws InterruptedException {
		System.out.println(driver.currentActivity());
		System.out.println("�������ղصĲ�������");
		Thread.sleep(3000);
		coPage.action_col().click();
		Thread.sleep(2000);
		coPage.action_list().click();
		Thread.sleep(1000);
		coPage.action_bcol().click();
	}

}

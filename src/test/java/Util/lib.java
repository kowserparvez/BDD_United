package Util;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class lib {public static void sleep (WebDriver driver, int sec) throws InterruptedException {
	Thread.sleep(sec * 1000);
}

public static WebElement findelement (WebDriver driver, String xpath) {
	WebElement a=driver.findElement(By.xpath(xpath));
	return a;
}
public static String readproperties(WebDriver driver, String key) throws IOException {
	InputStream fs = new FileInputStream("locator.properties");
	Properties pro= new Properties();
	pro.load(fs);
	String value= pro.getProperty(key);
	return value;
}

//public static void takescreenshot(WebDriver driver) throws IOException {
//	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(src, new File("C:\\Users\\Ayesha\\eclipse-workspace\\FacebookBDD\\Screenshots"));
//}

//public static String readexcel(WebDriver driver, int rownum, int colnum) throws IOException {
//	FileInputStream fit= new FileInputStream("C:\\Users\\Ayesha\\eclipse-workspace\\FacebookBDD\\facebookdata.xlsx");
//	Workbook wb= new XSSFWorkbook(fit);
//	Sheet sht= wb.getSheetAt(0);
//	Row rw=sht.getRow(rownum);
//	Cell cl=rw.getCell(colnum);
//	String a = cl.getStringCellValue();
//	return a;
//	
//}
}

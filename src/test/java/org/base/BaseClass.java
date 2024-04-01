package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	public static Actions p ;
	public static Robot r;
	public static Alert a;
	public static JavascriptExecutor j;
	public static Select s;
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}public static void firefoxConfig() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	public static void maxBrowser() {
		driver.manage().window().maximize();

	}
	public static void getTheTitle() {
		String title = driver.getTitle();
		System.out.println("PageTitle:"+title);

	}public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}public static void urlLaunch(String URL) {
		driver.get(URL);

	}
	public static void clickTheButton(WebElement element) {
		element.click();

	}
	public static void getTheText(WebElement element) {
		element.getText();

	}
	public static void getTheAttributeName(WebElement element,String name) {
	   String attribute = element.getAttribute(name);  
       System.out.println("GivenAttribute:"+attribute);
	}
	public static void enterTheValue(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void moveTheElememnt(WebElement s) {
	    p= new Actions(driver);
		p.moveToElement(s).perform();	
		
	}public static void contextClick(WebElement c) {
	    p= new Actions(driver);
		p.contextClick(c).perform();
	}
	public static void upKey(WebElement u) {
	    p= new Actions(driver);
		p.keyUp(Keys.SHIFT).perform();
	}
	public static void downKey(WebElement d) {
	    p= new Actions(driver);
		p.keyDown(Keys.SHIFT).perform();
	}
	public static void clickDouble(WebElement a) {
	    p= new Actions(driver);
		p.doubleClick().perform();
	}
	public static void dropAndDrag(WebElement a,WebElement b) {
	  p= new Actions(driver);
	  p.dragAndDrop(a, b).perform();

	}
	public static void AKeyPress() throws AWTException {
		r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
	
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
	}
	public static void XKeyPress() throws AWTException {
		r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_X);
	
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_X);
	}public static void VKeyPress() throws AWTException {
		r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
	
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
	}public static  void tabPress() throws AWTException {
		r= new Robot();
        r.keyPress(KeyEvent.VK_TAB); 
        r.keyRelease(KeyEvent.VK_TAB);
	}
	public static  void cPress() throws AWTException {
		r= new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_C);
	
        r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_C);
	}
	public static  void downArrowPress() throws AWTException {
		r= new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static  void upArrowPress() throws AWTException {
		r= new Robot();
        r.keyPress(KeyEvent.VK_UP);
        r.keyRelease(KeyEvent.VK_UP);
	}
	public static void alertaccept() {
		 a = driver.switchTo().alert();
         a.accept();
	}
	public static void alertdismiss() {
		 a = driver.switchTo().alert();
        a.dismiss();
	}
	public static void alertgetText() {
		 a = driver.switchTo().alert();
        String t = a.getText();
	    System.out.println(t);
	}
	public static void alertKeysSend(String n) {
		 a = driver.switchTo().alert();
        a.sendKeys(n);
	}
	public static void screenShot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\prabu\\eclipse-workspace\\Maven\\ScreenShots\\"+fileName+".png");
		FileUtils.copyFile(s, d);
	}
	public static void javaClick(WebElement e) {
		j =(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click", e);
	}
	public static void javaScriptSend(WebElement e,String value) {
		j =(JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('value','"+value+"')",e);	
	}
	public static void javaScriptScroll(WebElement e) {
		j =(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView()", e);
		}
	
	public static void javaScriptAttribute(WebElement e,String value) {
		j =(JavascriptExecutor)driver;
		Object s = j.executeScript("return arguments[0].getAttribute('"+value+"')",e);	
		System.out.println(s);
	}
	
	public static String windowsHandling(int window) {
		Set<String> allWindowId = driver.getWindowHandles();
       List<String> l = new ArrayList();
       l.addAll(allWindowId);
       String c = l.get(window);
       return c;
	}
	public static void indexSelect(WebElement e,int n) {
		s= new Select(e);
		s.selectByIndex(n);
	}
	public static void valueSelect(WebElement e,String n) {
		s= new Select(e);
		s.selectByValue(n);
	}
	public static void visibleValue(WebElement e, String n) {
		s= new Select(e);
		s.deselectByVisibleText(n);
	}
	public static void allOptionGet(WebElement e) {
		s= new Select(e);
		List<WebElement> all = s.getOptions();
		System.out.println(all);
	}
	public static void firstSelectedOptions(WebElement e) {
		s= new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
        System.out.println(firstSelectedOption);
	}
	public static void allSelectOptions(WebElement e) {
		s= new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	    System.out.println(allSelectedOptions);
	}
	public static void deselectoptions(WebElement e) {
		s= new Select(e);
		s.deselectAll();
	}
	public static void deselectvalue(WebElement e,String n) {
		s= new Select(e);
		s.deselectByValue(n);
	}
	public static void deselectindex(WebElement e,int a) {
		s= new Select(e);
		s.deselectByIndex(a);
	}
	public static void deselectvisible(WebElement e,String a) {
		s= new Select(e);
		s.deselectByVisibleText(a);
	}
	public static void multiple(WebElement e) {
		s= new Select(e);
		boolean m = s.isMultiple();
		System.out.println(m);
	}
	public static void dislplayeMethod(WebElement e) {
		boolean d = e.isDisplayed();
		System.out.println(d);
	}
	public static void enabledMethod(WebElement e) {
		boolean enabled = e.isEnabled();
		System.out.println(enabled);
	}
	public static void selectedMetohd(WebElement e) {
		boolean selected = e.isSelected();
		System.out.println(selected);
	}
	public static void toNavigations(String url) {
		driver.navigate().to(url);
	}
	public static void toForward() {
		driver.navigate().forward();
	}
	public static void toBack() {
		driver.navigate().back();
	}
	public static void toRefresh() {
		driver.navigate().refresh();
	}
	public static void waitsMethod() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

	}
	public static void webTableallData(int n ) {
		List<WebElement> allTable = driver.findElements(By.tagName("table"));
         WebElement table = allTable.get(n);
         
        List<WebElement> allRow = table.findElements(By.tagName("tr"));
        for (WebElement row : allRow) {
        	
        	 List<WebElement> allHeading = row.findElements(By.tagName("th"));
             for (WebElement heading : allHeading) {
            	 System.out.println(heading.getText());
            	 
            	 List<WebElement> allData = row.findElements(By.tagName("td"));
                 for (WebElement data : allData) {	
                System.out.println(data.getText());	 
		}	
		}
        }
		} 
	
    public static void webTableParticularData(int n,int r,int d) {
	   
    	List<WebElement> allTable = driver.findElements(By.tagName("table"));
        WebElement table = allTable.get(n);
        
       List<WebElement> allRow = table.findElements(By.tagName("tr"));
       WebElement row = allRow.get(r);
       
       	// List<WebElement> allHeading = row.findElements(By.tagName("th"));
          // 	 WebElement heading = allHeading.get(h);
           	 
           	 List<WebElement> allData = row.findElements(By.tagName("td"));
             WebElement data = allData.get(d);
             System.out.println(data.getText());
             
		}	
	public static String dataDrivenMethod(String loc,String sheet,int row,int cell) throws IOException {
		File s = new File(loc);
		
		FileInputStream f = new FileInputStream(s);
		
		
		Workbook b = new XSSFWorkbook(f);
		
		Sheet sh = b.getSheet(sheet);
		String name =" ";
		int pr = sh.getPhysicalNumberOfRows();
		Row r = sh.getRow(row);
			
		int pc = r.getPhysicalNumberOfCells();	
		Cell c = r.getCell(cell);	
		
		int t =c.getCellType();
		
		if (t==1) {
			 name = c.getStringCellValue();
	        
	        
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dc = c.getDateCellValue();
			
			SimpleDateFormat si = new SimpleDateFormat("MM-dd-yyy");
			 name = si.format(dc);
			
		}
		
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			name = String.valueOf(l);
			
		}return name;
	}

	public static void writedata(String loc,String sheet,int row,int cell,String value) throws IOException {
		
		File s = new File(loc);
		
		Workbook b = new XSSFWorkbook();
		
		Sheet cs = b.createSheet(sheet);
		
		Row cr = cs.createRow(row);
		//Row cr1 = cs.createRow(row);h
		
		Cell c = cr.createCell(cell);
		//Cell c1 = cr.createCell(cell);
        //Cell cc = cr1.createCell(cell);
		
		c.setCellValue(value);
		
		FileOutputStream f = new FileOutputStream(s);
		b.write(f);
		
	}
	
	public static void readandwrite(String loc,String sheet,int row,int cell,String value) throws IOException {
	 
		File s = new File(loc);
		
        FileInputStream fs = new FileInputStream(s);
		
		Workbook b = new XSSFWorkbook(fs);
		
		Sheet cs = b.getSheet(sheet);
		
		Row cr = cs.createRow(row);
		
		
		Cell c = cr.createCell(cell);
		
        c.setCellValue(value);
		
		FileOutputStream f = new FileOutputStream(s);
		b.write(f);

	}
	
	public static void closeTheBrowser() {
		driver.quit();
          
	}
	
	public static void dateAndTimeBefore() {
		Date d = new Date();
        System.out.println("BeforeTime:"+d);
	}
	
	public static void dateAndTimeAfter() {
		Date d = new Date();
        System.out.println("AfterTime:"+d);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

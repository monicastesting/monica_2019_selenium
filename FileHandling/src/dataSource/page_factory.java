package dataSource;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class page_factory {
	
	public static WebDriver driver;
	
	@FindBy(xpath=".//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")
	 public static WebElement name1;	// full name 
	
	@FindBy(xpath=".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")
	static WebElement loginName1; 	// choose login id on rediff
	
	@FindBy(xpath=".//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")
	static WebElement password1; 	// password field
	
	@FindBy(xpath=".//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")
	static WebElement altpassword1;  	// retype password
	@FindBy(xpath=".//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")
	static WebElement altEmail_id; 	// retype email id
	
	@FindBy(xpath=".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")
	static WebElement  Chk_availability;  
	
	@FindBy (id="Register")
	static WebElement createacc;
	
	// button Check availability" Check availability" name="btnchkavail63105fd8"
		
		public page_factory()
		{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	   }
	
		public static void initz()
		{
			System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\FileHandling\\src\\support_file\\chromedriver.exe");
	        driver=new ChromeDriver();
	      
		//WebDriver driver=new FirefoxDriver();
	       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		
		public static void dataPass(String name_n,String loginName1_n,String password1_n,String altpassword1_n,String altEmail_id_n)
		{
			name1.sendKeys(name_n);
			loginName1.sendKeys(loginName1_n); //sendkeys(driver, loginName1, 20, "monica_sdetplus04");
			
			Chk_availability.click();
			password1.sendKeys(password1_n);        //sendkeys(driver, password1, 5, "seed12345");
			altpassword1.sendKeys(altpassword1_n);      //sendkeys(driver, altpassword1, 15, "seed12345");
			altEmail_id.sendKeys(altEmail_id_n); 
			createacc.click();
			
		}
		
	public static void main(String name1) 
	{
		 //page_factory pagefactory; = null;
		 
		 initz(); 
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		 dataPass("moica","monica_sdetplus04","seed12345","seed12345","seed@seed.com");	
		
	}}


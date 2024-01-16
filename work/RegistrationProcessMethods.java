package com.Manabadi.main.RegistrationProcess;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.relevantcodes.extentreports.LogStatus;
import com.support.libraries.JavaFunctions;
import com.support.libraries.SeleniumFunctions;
import com.support.libraries.SuiteConstants;

public class RegistrationProcessMethods {
	public WebDriver driver;
	RegistrationProcessObjects registrationProcessObjects;
	
	SeleniumFunctions seleniumObj;
	JavaFunctions javaobj;
	public static ChromeOptions options;
	static String strUserDir = System.getProperty("user.dir");

	public RegistrationProcessMethods()
	{
		registrationProcessObjects=PageFactory.initElements(SeleniumFunctions.driver, RegistrationProcessObjects.class);
		seleniumObj = new SeleniumFunctions();
		javaobj = new JavaFunctions();
		options = new ChromeOptions();

	}



	public void clickRegistrationbutton() throws Exception 
	{
		//seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.btnNewStudentRegistration, true, 2);
		registrationProcessObjects.btnNewStudentRegistration.click();
		SuiteConstants.test.log(LogStatus.PASS, "New Registration", "clicked on New Registration");
	}
	public void ParentInfo(HashMap<String,String> map) throws Exception 
	{
		//seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.txtparentOneFirstName, true, 2);	
		
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnparentOneTitle, map.get("parentOneTitle"));
		registrationProcessObjects.txtparentOneFirstName.sendKeys(map.get("parentOneFirstName"));
		registrationProcessObjects.txtparentOneMiddleName.sendKeys(map.get("parentOneMiddleName"));
		registrationProcessObjects.txtparentOneLastName.sendKeys(map.get("parentOneLastName"));
		registrationProcessObjects.txtparentOneEmail.sendKeys(map.get("parentOneEmail"));
		registrationProcessObjects.numparentOneContact.sendKeys(map.get("parentOneContact"));
		registrationProcessObjects.txtparentOneProfession.sendKeys(map.get("parentOneProfession"));
		registrationProcessObjects.txtparentOneCompany.sendKeys(map.get("parentOneCompany"));
		registrationProcessObjects.txthomeAddress.sendKeys(map.get("homeAddress"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txthomeAddress.sendKeys(Keys.ARROW_DOWN);
		registrationProcessObjects.txthomeAddress.sendKeys(Keys.ENTER);
		//seleniumObj.pressShiftTabKey();
		registrationProcessObjects.txtaptSuit.sendKeys(map.get("aptSuit"));
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnvolunteer, map.get("volunteer"));
		seleniumObj.pressShiftTabKey();
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnhearAboutUs, map.get("hearAboutUs"));
		seleniumObj.pressShiftTabKey();
		registrationProcessObjects.chkboxSpeak.click();
		registrationProcessObjects.chkboxRead.click();		  



		SuiteConstants.test.log(LogStatus.PASS, "enter parentinfo", "Sucessfully entered parentinfo");


	}
	public void ParentInfoMandatory(HashMap<String,String> map) throws Exception 
	{
		seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.txtparentOneFirstName, true, 2);		
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnparentOneTitle, map.get("parentOneTitle"));
		registrationProcessObjects.txtparentOneFirstName.sendKeys(map.get("parentOneFirstName"));		
		//registrationProcessObjects.txtparentOneMiddleName.sendKeys(map.get("parentOneMiddleName"));
		registrationProcessObjects.txtparentOneLastName.sendKeys(map.get("parentOneLastName"));
		registrationProcessObjects.txtparentOneEmail.sendKeys(map.get("parentOneEmail"));
		registrationProcessObjects.numparentOneContact.sendKeys(map.get("parentOneContact"));
		registrationProcessObjects.txtparentOneProfession.sendKeys(map.get("parentOneProfession"));
		registrationProcessObjects.txtparentOneCompany.sendKeys(map.get("parentOneCompany"));
		registrationProcessObjects.txthomeAddress.sendKeys(map.get("homeAddress"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txthomeAddress.sendKeys(Keys.ARROW_DOWN);
		registrationProcessObjects.txthomeAddress.sendKeys(Keys.ENTER);
		//seleniumObj.pressShiftTabKey();
		//registrationProcessObjects.txtaptSuit.sendKeys(map.get("aptSuit"));
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnvolunteer, map.get("volunteer"));
		seleniumObj.pressShiftTabKey();
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnhearAboutUs, map.get("hearAboutUs"));
		seleniumObj.pressShiftTabKey();
		//registrationProcessObjects.chkboxSpeak.click();
		//registrationProcessObjects.chkboxRead.click();		  



		SuiteConstants.test.log(LogStatus.PASS, "enter parentinfo", "Sucessfully entered parentinfo");


	}
	public void ParentInfoInvaliddatavalidation(HashMap<String,String> map) throws Exception 
	{
		seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.txtparentOneFirstName, true, 5);		
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnparentOneTitle, map.get("parentOneTitle"));
		registrationProcessObjects.txtparentOneFirstName.sendKeys(map.get("parentOneFirstName"));		
		registrationProcessObjects.txtparentOneMiddleName.sendKeys(map.get("parentOneMiddleName"));
		registrationProcessObjects.txtparentOneLastName.sendKeys(map.get("parentOneLastName"));
		registrationProcessObjects.txtparentOneEmail.sendKeys(map.get("parentOneEmail"));
		registrationProcessObjects.numparentOneContact.sendKeys(map.get("parentOneContact"));
		registrationProcessObjects.txtparentOneProfession.sendKeys(map.get("parentOneProfession"));
		registrationProcessObjects.txtparentOneCompany.sendKeys(map.get("parentOneCompany"));
		registrationProcessObjects.txthomeAddress.sendKeys(map.get("homeAddress"));
		javaobj.waitForSeconds(2);
		seleniumObj.pressShiftTabKey();
		//registrationProcessObjects.txthomeAddress.sendKeys(Keys.ARROW_DOWN);
		//registrationProcessObjects.txthomeAddress.sendKeys(Keys.ENTER);
		//seleniumObj.pressShiftTabKey();
		registrationProcessObjects.txtaptSuit.sendKeys(map.get("aptSuit"));
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnvolunteer, map.get("volunteer"));
		seleniumObj.pressShiftTabKey();
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnhearAboutUs, map.get("hearAboutUs"));
		seleniumObj.pressShiftTabKey();
		registrationProcessObjects.chkboxSpeak.click();
		registrationProcessObjects.chkboxRead.click();		  



		SuiteConstants.test.log(LogStatus.PASS, "enter parentinfo", "Sucessfully entered parentinfo");


	}
	public void clickParentInfoSaveandcontinue() throws Exception {
		javaobj.waitForSeconds(1);
		registrationProcessObjects.btnSaveandcontinue.click();
	}

	public void StudentInfo(HashMap<String,String> map) throws Exception {
		//String filename=strUserDir+File.separator+"src"+"test"+File.separator+"resources"+File.separator+"sample.png";
		String filename="C:\\Users\\Admin\\Downloads\\baby photo.jpg";
		//String filename="C:\\Users\\Deepu\\eclipse-workspace\\Manabadi-Web-Automation\\src\\test\\resources\\sample.png";

		//seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.imgprofilePic, true, 40);
		javaobj.waitForSeconds(2);

		seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.txtstudentFirstName, true, 2);
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudentFirstName.sendKeys(map.get("studentFirstName"));		
		registrationProcessObjects.txtstudentMiddleName.sendKeys(map.get("studentMiddleName"));
		registrationProcessObjects.txtstudentLastName.sendKeys(map.get("studentLastName"));

		registrationProcessObjects.numdateOfBirth.sendKeys(Keys.CONTROL,"a");
		registrationProcessObjects.numdateOfBirth.sendKeys(Keys.BACK_SPACE);

		registrationProcessObjects.numdateOfBirth.sendKeys(map.get("dateOfBirth"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwngender, map.get("gender"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwntShirtSize, map.get("tShirtSize"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnGrade, map.get("grade"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.uploadprofilePic.sendKeys(filename);
		javaobj.waitForSeconds(2);
		registrationProcessObjects.Updatephoto.click();
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(map.get("studenacademiSchool"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(Keys.ARROW_DOWN);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(Keys.ENTER);
		javaobj.waitForSeconds(2);
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnchooseManabadiLocation, map.get("Manabadilocation"));
		javaobj.waitForSeconds(2);
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnclassLevel, map.get("classLevel"));
		javaobj.waitForSeconds(2);
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnextraCurricularActivities, map.get("extraCurricularActivities"));
		javaobj.waitForSeconds(2);
		seleniumObj.pressShiftTabKey();

		SuiteConstants.test.log(LogStatus.PASS, "enter parentinfo", "Sucessfully entered StudentInfo");
	}
	public void StudentInfoMandatory(HashMap<String,String> map) throws Exception {
		//String filename=strUserDir+File.separator+"src"+"test"+File.separator+"resources"+File.separator+"sample.png";
		String filename="C:\\Users\\Admin\\Downloads\\baby photo.jpg";
		//String filename="C:\\Users\\Deepu\\eclipse-workspace\\Manabadi-Web-Automation\\src\\test\\resources\\sample.png";

		//seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.imgprofilePic, true, 40);
		javaobj.waitForSeconds(2);

		seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.txtstudentFirstName, true, 2);
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudentFirstName.sendKeys(map.get("studentFirstName"));		
		//registrationProcessObjects.txtstudentMiddleName.sendKeys(map.get("studentMiddleName"));
		registrationProcessObjects.txtstudentLastName.sendKeys(map.get("studentLastName"));

		registrationProcessObjects.numdateOfBirth.sendKeys(Keys.CONTROL,"a");
		registrationProcessObjects.numdateOfBirth.sendKeys(Keys.BACK_SPACE);

		registrationProcessObjects.numdateOfBirth.sendKeys(map.get("dateOfBirth"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwngender, map.get("gender"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwntShirtSize, map.get("tShirtSize"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnGrade, map.get("grade"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.uploadprofilePic.sendKeys(filename);
		javaobj.waitForSeconds(2);
		registrationProcessObjects.Updatephoto.click();
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(map.get("studenacademiSchool"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(Keys.ARROW_DOWN);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(Keys.ENTER);
		javaobj.waitForSeconds(2);
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnchooseManabadiLocation, map.get("Manabadilocation"));
		javaobj.waitForSeconds(2);
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnclassLevel, map.get("classLevel"));
		javaobj.waitForSeconds(2);
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnextraCurricularActivities, map.get("extraCurricularActivities"));
		javaobj.waitForSeconds(2);
		seleniumObj.pressShiftTabKey();

		SuiteConstants.test.log(LogStatus.PASS, "enter parentinfo", "Sucessfully entered StudentInfo");
	}
	public void StudentInfoInvalidataValidation(HashMap<String,String> map) throws Exception {
		//String filename=strUserDir+File.separator+"src"+"test"+File.separator+"resources"+File.separator+"sample.png";
		String filename="C:\\Users\\Admin\\Downloads\\baby photo.jpg";
		//String filename="C:\\Users\\Deepu\\eclipse-workspace\\Manabadi-Web-Automation\\src\\test\\resources\\sample.png";

		//seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.imgprofilePic, true, 40);
		javaobj.waitForSeconds(2);

		seleniumObj.waitForElementAppearDisappear(registrationProcessObjects.txtstudentFirstName, true, 2);
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudentFirstName.sendKeys(map.get("studentFirstName"));		
		registrationProcessObjects.txtstudentMiddleName.sendKeys(map.get("studentMiddleName"));
		registrationProcessObjects.txtstudentLastName.sendKeys(map.get("studentLastName"));

		registrationProcessObjects.numdateOfBirth.sendKeys(Keys.CONTROL,"a");
		registrationProcessObjects.numdateOfBirth.sendKeys(Keys.BACK_SPACE);

		registrationProcessObjects.numdateOfBirth.sendKeys(map.get("dateOfBirth"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwngender, map.get("gender"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwntShirtSize, map.get("tShirtSize"));
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnGrade, map.get("grade"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.uploadprofilePic.sendKeys(filename);
		javaobj.waitForSeconds(2);
		registrationProcessObjects.Updatephoto.click();
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(map.get("studenacademiSchool"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(Keys.ARROW_DOWN);
		registrationProcessObjects.txtstudenacademiSchool.sendKeys(Keys.ENTER);
		javaobj.waitForSeconds(2);
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnchooseManabadiLocation, map.get("Manabadilocation"));
		javaobj.waitForSeconds(2);
		//seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwnclassLevel, map.get("classLevel"));
		//javaobj.waitForSeconds(3);
		seleniumObj.selectDropDownByNum(registrationProcessObjects.drpdwnextraCurricularActivities, map.get("extraCurricularActivities"));
		javaobj.waitForSeconds(2);
		seleniumObj.pressShiftTabKey();

		SuiteConstants.test.log(LogStatus.PASS, "enter parentinfo", "Sucessfully entered StudentInfo");
	}
	public void clickpreviewButton() throws Exception 
	{
		registrationProcessObjects.previewButton.click();
		javaobj.waitForSeconds(2);
		SuiteConstants.test.log(LogStatus.PASS, "Previre button clicked", "Sucessfully clicked Previre Button ");
	}

	public void clickstudentInfoSaveandContinue() throws Exception 
	{
		registrationProcessObjects.btnSaveandContinue.click();
		javaobj.waitForSeconds(2);
		SuiteConstants.test.log(LogStatus.PASS, "Student info save and continue button clicked", "Sucessfully clicked Save and continue");
	}


	public void PaymentInfo(HashMap<String,String> map) throws Exception 
	{
		javaobj.waitForSeconds(2);
		registrationProcessObjects.btnProceed.click();
		javaobj.waitForSeconds(2);
		registrationProcessObjects.termsAndConditionsCheckBox.click();
		javaobj.waitForSeconds(1);
		registrationProcessObjects.btncontinueToPayment.click();
		javaobj.waitForSeconds(5);
		registrationProcessObjects.txtpayPaluserName.sendKeys(map.get("payPaluserName"));
		javaobj.waitForSeconds(2);
		registrationProcessObjects.btnNext.click();
		javaobj.waitForSeconds(3);
		registrationProcessObjects.txtpayPalpassword.sendKeys(map.get("payPalpassword"));
		javaobj.waitForSeconds(1);
		registrationProcessObjects.btnPaypalLogin.click();
		javaobj.waitForSeconds(3);
		registrationProcessObjects.cardSelection.click();
		javaobj.waitForSeconds(2);
		seleniumObj.scrollToBottom();
		javaobj.waitForSeconds(2);
		registrationProcessObjects.btnPaynow.click();
		javaobj.waitForSeconds(4);

		SuiteConstants.test.log(LogStatus.PASS, "enter parentinfo", "Sucessfully entered PaymentInfo");

	}

	public void ParentTwoInfo(HashMap<String, String> map) {
		
		seleniumObj.selectDropDownByText(registrationProcessObjects.titleselectionparenttwo, map.get("parentTwoTitle"));
		registrationProcessObjects.txtparentTwoFirstName.sendKeys(map.get("parentTwoFirstName"));
		registrationProcessObjects.txtparentTwoMiddleFirstName.sendKeys(map.get("parentTwoMiddleName"));
		registrationProcessObjects.txtparentTwoLastName.sendKeys(map.get("parentTwoLastName"));
		registrationProcessObjects.txtparentTwoEmail.sendKeys(map.get("parentTwoEmail"));
		registrationProcessObjects.txtparentTwoPhonenumber.sendKeys(map.get("parentTwoContact"));
		registrationProcessObjects.txtparentTwoProfession.sendKeys(map.get("parentTwoProfession"));
		registrationProcessObjects.txtparentTwoNameOfCompany.sendKeys(map.get("parentTwoCompany"));
		SuiteConstants.test.log(LogStatus.PASS, "enter parentTwoinfo", "Sucessfully entered PaymentTwoInfo");
	}
	public void selectparentTwoTitle(HashMap<String, String> map) {
		seleniumObj.selectDropDownByText(registrationProcessObjects.titleselectionparenttwo, map.get("parentTwoTitle"));
		SuiteConstants.test.log(LogStatus.PASS, "Parent Two Tile drop down selected", "Sucessfully Selected The Title for Parent Two info");
	}


	public void clickaddSibiling() {
		// TODO Auto-generated method stub
		registrationProcessObjects.btnSiblings.click();
		SuiteConstants.test.log(LogStatus.PASS, "Add Sibling button clicked", "Sucessfully clicked Add Sibling Button");
	}
	public void SibilingInfoInvaliddata(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		javaobj.waitForSeconds(2);
		//String filename="C:\\Users\\Admin\\Downloads\\baby photo.jpg";
		//registrationProcessObjects.profileImg.sendKeys(filename);
		javaobj.waitForSeconds(1);
		registrationProcessObjects.txtSiblingsFirstName.sendKeys(map.get("siblingFirstName"));
		registrationProcessObjects.txtSiblingsMiddleName.sendKeys(map.get("siblingMiddleName"));
		registrationProcessObjects.txtSiblingsLastName.sendKeys(map.get("siblingLastName"));
		//registrationProcessObjects.numdateOfBirth.click();
		javaobj.waitForSeconds(1);
		registrationProcessObjects.txtSiblingsDOB.sendKeys(Keys.CONTROL,"a");
		registrationProcessObjects.txtSiblingsDOB.sendKeys(Keys.BACK_SPACE);
		javaobj.waitForSeconds(1);
		registrationProcessObjects.txtSiblingsDOB.sendKeys(map.get("siblingDOB"));
		
		  seleniumObj.selectDropDownByText(registrationProcessObjects.drpSiblingsGender,map.get("siblinggender"));
			/*
			 * seleniumObj.selectDropDownByText(registrationProcessObjects.drpSiblingsTshirt
			 * ,map.get("tShirtSize"));
			 * seleniumObj.selectDropDownByText(registrationProcessObjects.drpSiblingsGrade,
			 * map.get("grade")); javaobj.waitForSeconds(1);
			 * registrationProcessObjects.Updatephoto.click();
			 * registrationProcessObjects.txtSiblingsAchademicSchool.sendKeys(map.get(
			 * "studenacademiSchool")); javaobj.waitForSeconds(1);
			 * registrationProcessObjects.txtSiblingsAchademicSchool.sendKeys(Keys.
			 * ARROW_DOWN);
			 * registrationProcessObjects.txtSiblingsAchademicSchool.sendKeys(Keys.ENTER);
			 * javaobj.waitForSeconds(1);
			 * seleniumObj.selectDropDownByText(registrationProcessObjects.
			 * drpSiblingsManabadiLocation, map.get("Manabadilocation"));
			 * javaobj.waitForSeconds(1);
			 * seleniumObj.selectDropDownByText(registrationProcessObjects.
			 * drpSiblingsClassLevel,map.get("classLevel")); javaobj.waitForSeconds(1);
			 * seleniumObj.selectDropDownByNum(registrationProcessObjects.
			 * drpSiblingsExtraCurricularActivities, map.get("extraCurricularActivities"));
			 * javaobj.waitForSeconds(1); seleniumObj.pressShiftTabKey();
			 */
		 
		SuiteConstants.test.log(LogStatus.PASS, "enter SibilingInfo", "Sucessfully entered SibilingInfo");
	}
	public void ClickingPreviewbtn() {
		
		registrationProcessObjects.btnSiblingsPreview.click();
	}

	public void ClickingSaveandcontinuebtn() {
		
		registrationProcessObjects.btnSiblingsSaveAndContinue.click();

	}
	public void ClikingParentInfoSaveandContinue() {
		
		registrationProcessObjects.btnSiblingsSaveAndContinue.click();

	}
	public void SibilingInfo(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		javaobj.waitForSeconds(2);
		
		registrationProcessObjects.txtSiblingsFirstName.sendKeys(map.get("SiblingFirstName"));
		registrationProcessObjects.txtSiblingsMiddleName.sendKeys(map.get("SiblingMiddleName"));
		registrationProcessObjects.txtSiblingsLastName.sendKeys(map.get("SiblingLastName"));
		//registrationProcessObjects.numdateOfBirth.click();
		javaobj.waitForSeconds(1);
		registrationProcessObjects.txtSiblingsDOB.sendKeys(Keys.CONTROL,"a");
		registrationProcessObjects.txtSiblingsDOB.sendKeys(Keys.BACK_SPACE);
		javaobj.waitForSeconds(1);
		registrationProcessObjects.txtSiblingsDOB.sendKeys(map.get("SiblingDOB"));
		javaobj.waitForSeconds(1);
		  seleniumObj.selectDropDownByText(registrationProcessObjects.drpSiblingsGender,map.get("SiblingGender"));
		  javaobj.waitForSeconds(1);
			  seleniumObj.selectDropDownByText(registrationProcessObjects.drpSiblingsTshirt,map.get("SiblingTShirt"));
			  javaobj.waitForSeconds(1);
			  seleniumObj.selectDropDownByText(registrationProcessObjects.drpSiblingsGrade,map.get("SiblingGrade"));
			  javaobj.waitForSeconds(3);
			  String filename="C:\\Users\\Admin\\Downloads\\baby photo.jpg";
				registrationProcessObjects.profileImg.sendKeys(filename);
				javaobj.waitForSeconds(2);
			  registrationProcessObjects.Updatephoto.click();
			  javaobj.waitForSeconds(1);
			  registrationProcessObjects.txtSiblingsAchademicSchool.sendKeys(map.get("SiblingAchadamicSchoo"));
			  javaobj.waitForSeconds(1);
			  registrationProcessObjects.txtSiblingsAchademicSchool.sendKeys(Keys.ARROW_DOWN);
			  registrationProcessObjects.txtSiblingsAchademicSchool.sendKeys(Keys.ENTER);
			  javaobj.waitForSeconds(1);
			  seleniumObj.selectDropDownByText(registrationProcessObjects.drpSiblingsManabadiLocation, map.get("SiblingManabadiLocation"));
			  javaobj.waitForSeconds(1);
			 
			  seleniumObj.selectDropDownByText(registrationProcessObjects. drpSiblingsClassLevel,map.get("SiblingClassLevel"));
			  javaobj.waitForSeconds(1);
			  seleniumObj.selectDropDownByNum(registrationProcessObjects.
			  drpSiblingsExtraCurricularActivities, map.get("Siblingactivities"));
			  javaobj.waitForSeconds(1);
			  seleniumObj.pressShiftTabKey();
			 
		 
		SuiteConstants.test.log(LogStatus.PASS, "enter SibilingInfo", "Sucessfully entered SibilingInfo");
	}
	

	

	public void ContributionSelection(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		seleniumObj.selectDropDownByText(registrationProcessObjects.drpdwncontribution, map.get("Contribution"));
		registrationProcessObjects.txtcontributionamount.sendKeys(Keys.CONTROL,"a");
		registrationProcessObjects.txtcontributionamount.sendKeys(Keys.BACK_SPACE);
		registrationProcessObjects.txtcontributionamount.sendKeys(map.get("ContributionAmount"));
		SuiteConstants.test.log(LogStatus.PASS, "Contribution selection", "Sucessfully Selected Contribution");
	}

	

	//AdminPanel_Usecase11_ Test case
	
	public void adminpanelusecases(HashMap<String, String> map) throws InterruptedException {
		seleniumObj.click(registrationProcessObjects.signinbutton);
		Thread.sleep(5000);
		//seleniumObj.click(registrationProcessObjects.useanotheraccount);
		
		seleniumObj.switchtonewtab();
		Thread.sleep(3000);
		registrationProcessObjects.emailinputvalue.sendKeys(map.get("Username"));
		Thread.sleep(2000);
		seleniumObj.click(registrationProcessObjects.nextbutton);
		Thread.sleep(3000);
		registrationProcessObjects.pwdinput.sendKeys(map.get("Password"));
		
		seleniumObj.click(registrationProcessObjects.nextbutton);
		Thread.sleep(2000);
		seleniumObj.switchtoparenttab();
		Thread.sleep(15000);
		
		seleniumObj.click(registrationProcessObjects.stdbutton);
		Thread.sleep(5000);
		seleniumObj.isElementPresent(registrationProcessObjects.gridview);
		Thread.sleep(3000);
		/*
		 * seleniumObj.click(registrationProcessObjects.gridview);
		 * seleniumObj.click(registrationProcessObjects.listview);
		 * seleniumObj.click(registrationProcessObjects.flyoutoption);
		 * seleniumObj.isElementPresent(registrationProcessObjects.flyoutmenuoption1);
		 * seleniumObj.isElementPresent(registrationProcessObjects.flyoutmenuoption2);
		 * seleniumObj.isElementPresent(registrationProcessObjects.flyoutmenuoption3);
		 * seleniumObj.isElementPresent(registrationProcessObjects.flyoutmenuoption4);
		 * seleniumObj.isElementPresent(registrationProcessObjects.flyoutmenuoption5);
		 * seleniumObj.isElementPresent(registrationProcessObjects.flyoutmenuoption6);
		 * seleniumObj.isElementPresent(registrationProcessObjects.flyoutmenuoption7);
		 * seleniumObj.isElementPresent(registrationProcessObjects.totalrows);
		 */
		
		
		
		
		
	}

























}



















































































package com.Manabadi.main.RegistrationProcess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.support.libraries.JavaFunctions;
import com.support.libraries.SeleniumFunctions;
import com.support.libraries.SuiteConstants;

public class RegistrationProcessAsserts {
	RegistrationProcessObjects registrationobjects;
	RegistrationProcessMethods Registrationmethods;
	SeleniumFunctions seleniumObj;
	JavaFunctions javaobj;
	HashMap<String,String> errMsgs;

	public RegistrationProcessAsserts() {
		registrationobjects=PageFactory.initElements(SeleniumFunctions.driver, RegistrationProcessObjects.class);
		seleniumObj = new SeleniumFunctions();
		SuiteConstants.iTIME_OUT_S = 5000;
		javaobj = new JavaFunctions();	
	}

	public void assertLabelNamesParentInfo() throws InterruptedException{


		javaobj.waitForSeconds(2);
		seleniumObj.waitForElementAppearDisappear(registrationobjects.lblRegistration, true, 40);
		javaobj.waitForSeconds(2);
		Assert.assertTrue(registrationobjects.lblRegistration.getText().trim().contains("Registration"), "Regstration name is proper");
		Assert.assertTrue(registrationobjects.lblRegistrationquote.getText().trim().contentEquals("Complete the registration in three simple steps"), "Regstrationquote name is proper");
		javaobj.waitForSeconds(2);
		Assert.assertTrue(registrationobjects.lblParentInformation.getText().trim().contentEquals("Parent Information"), "Parent Information name is proper");
		javaobj.waitForSeconds(2);
		Assert.assertTrue(registrationobjects.lblParent1.getText().trim().contentEquals("Parent 1"), "Parent 1 name is proper");
		javaobj.waitForSeconds(2);
		Assert.assertTrue(registrationobjects.lblParent2.getText().trim().contentEquals("Parent 2"), "Parent 2 name is proper");
		javaobj.waitForSeconds(2);
		Assert.assertTrue(registrationobjects.lblAdditionalInformation.getText().trim().contentEquals("Additional Information"), "Additional Information name is proper");

		SuiteConstants.test.log(LogStatus.PASS, "Labels verification for ParentInfo","Sucessfully verified ParentInfo Labels");

	}
	public void assertLabelNamesStudentInfo() throws InterruptedException{

		javaobj.waitForSeconds(2);
		seleniumObj.waitForElementAppearDisappear(registrationobjects.lblStudentInformation, true, 40);
		javaobj.waitForSeconds(2);
		Assert.assertTrue(registrationobjects.lblStudentInformation.getText().trim().contains("Student Information"), "Student Information name is proper");
		Assert.assertTrue(registrationobjects.lblStudentDetails.getText().trim().contentEquals("Student Details"), "Student Details name is proper");

		SuiteConstants.test.log(LogStatus.PASS, "Labels verification for StudentInfo","Sucessfully verified StudentInfo Labels");

	}

	public void assertLabelNamesPaymentInfo() throws InterruptedException{

		javaobj.waitForSeconds(2);
		seleniumObj.waitForElementAppearDisappear(registrationobjects.lblPaymentInformation, true, 40);
		javaobj.waitForSeconds(2);
		Assert.assertTrue(registrationobjects.lblPaymentInformation.getText().trim().contains("Payment Information"), "Payment Information name is proper");
		Assert.assertTrue(registrationobjects.lblFeeDetails.getText().trim().contains("Fee Details"), "Fee Details name is proper"); 
		Assert.assertTrue(registrationobjects.colStudentName.getText().trim().contains("Student Name"), "Student Name name is proper"); 
		Assert.assertTrue(registrationobjects.colClassName.getText().trim().contains("Class"), "Class name is proper");
		Assert.assertTrue(registrationobjects.colCourseFeeName.getText().trim().contains("Course Fee"), "Course Fee name is proper");
		Assert.assertTrue(registrationobjects.colRegistrationFeeName.getText().trim().contains("Registration Fee"), "Registration Fee name is proper");
		Assert.assertTrue(registrationobjects.colPSTUFeeName.getText().trim().contains("PSTU Fee"), "PSTU Fee name is proper");
		Assert.assertTrue(registrationobjects.colDiscountName.getText().trim().contains("Discount"), "Discount name is proper");
		Assert.assertTrue(registrationobjects.colTotalFeeName.getText().trim().contains("Total Fee"), "Total Fee name is proper");



		SuiteConstants.test.log(LogStatus.PASS, "Labels verification for PaymentInfo","Sucessfully verified PaymentInfo Labels");
	}

	/*
	 * public void assertParentInfoMandatoryFields(HashMap<String,String> map)
	 * throws InterruptedException{
	 * Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.
	 * colTotalFeeName),"Error message for Fee name is Displayed");
	 * 
	 * Assert.assertTrue(registrationobjects.colTotalFeeName.getText().trim().
	 * contains("Total Fee"), "Total Fee name is proper");
	 * 
	 * Assert.assertTrue(registrationobjects.colTotalFeeName.getAttribute("value").
	 * trim().contentEquals(map.get("TotalFeeName")), "Total Fee name is proper");
	 * 
	 * compareExpandActDropDownValue(map.get("TotalFeeName"),registrationobjects.
	 * colTotalFeeName);
	 * 
	 * }
	 */

	private void compareExpandActDropDownValue(String fieldValue, WebElement fieldElement) throws InterruptedException {

		List<String> expectedValues = new ArrayList<String>();
		List<String> actualValues = new ArrayList<String>();
		expectedValues = javaobj.stringToList(fieldValue);
		fieldElement.click();
		actualValues = seleniumObj.getDropDownValues();
		Assert.assertTrue(expectedValues.containsAll(actualValues),fieldValue+"dropDown Values are proper");




	}

	public void assertParentInfoMandatoryFields(HashMap<String,String> map) throws InterruptedException{
		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parentoneerrmesTitleRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parentoneerrmesTitleRequired.getText().trim().contains("Title Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parentoneerrmesFirstNameRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parentoneerrmesFirstNameRequired.getText().trim().contains("First Name Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parentoneerrmesLastNameRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parentoneerrmesLastNameRequired.getText().trim().contains("Last Name Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parentoneerrmesEmailRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parentoneerrmesEmailRequired.getText().trim().contains("Email Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parentoneerrmesPhoneNumberRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parentoneerrmesPhoneNumberRequired.getText().trim().contains("Phone Number Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parentoneerrmesProfessionRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parentoneerrmesProfessionRequired.getText().trim().contains("Profession Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parentoneerrmesNameofCompanyRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parentoneerrmesNameofCompanyRequired.getText().trim().contains("Name of Company Required"), "Total Fee name is proper");

		//seleniumObj.selectDropDownByText(registrationobjects.parenttwoTitleselection, map.get("parentTwoTitle"));
		
		registrationobjects.btnSaveandcontinue.click();
		javaobj.waitForSeconds(1);

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parenttwoerrmesFirstNameRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parenttwoerrmesFirstNameRequired.getText().trim().contains("First Name Required"), "Total Fee name is proper");


		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parenttwoerrmesLastNameRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parenttwoerrmesLastNameRequired.getText().trim().contains("Last Name Required"), "Total Fee name is proper");


		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parenttwoerrmesEmailRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parenttwoerrmesEmailRequired.getText().trim().contains("Email Required"), "Total Fee name is proper");


		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parenttwoerrmesPhoneNumberRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parenttwoerrmesPhoneNumberRequired.getText().trim().contains("Phone Number Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parenttwoerrmesProfessionRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parenttwoerrmesProfessionRequired.getText().trim().contains("Profession Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.parenttwoerrmesNameofCompanyRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.parenttwoerrmesNameofCompanyRequired.getText().trim().contains("Name of Company Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.addInforerrmesHomeAddressRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.addInforerrmesHomeAddressRequired.getText().trim().contains("Home Address Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.volunteererrmessrequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.volunteererrmessrequired.getText().trim().contains("This field is required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.aboutUserrmesRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.aboutUserrmesRequired.getText().trim().contains("This field is required"), "Total Fee name is proper");

	}


	public void assertStudentInfoMandatoryFields(HashMap<String,String> map) throws InterruptedException{
		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesImagerequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesImagerequired.getText().trim().contains("Image Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesFirstNamerequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesFirstNamerequired.getText().trim().contains("First Name Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesLastNamerequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesLastNamerequired.getText().trim().contains("Last Name Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesTshirtrequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesTshirtrequired.getText().trim().contains("T-Shirt Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesAcademicGraderequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesAcademicGraderequired.getText().trim().contains("Academic Grade Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesAcademicSchoolrequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesAcademicSchoolrequired.getText().trim().contains("Academic School Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesManabadiLocationrequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesManabadiLocationrequired.getText().trim().contains("ManaBadi Location Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesClassLevelrequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesClassLevelrequired.getText().trim().contains("Class Level Required"), "Total Fee name is proper");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.StuInfoerrmesExtracurricularActivitiesrequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.StuInfoerrmesExtracurricularActivitiesrequired.getText().trim().contains("Extracurricular Activities Required"), "Total Fee name is proper");
	}
	public void assertSiblingsInfoMandatoryFields(HashMap<String,String> map) throws InterruptedException{
		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesImageRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesImageRequired.getText().trim().contains("Image Required"), "Image err mess is displyed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesFirstNameRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesFirstNameRequired.getText().trim().contains("First Name Required"), "First name err mes is displayed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesLastNameRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesLastNameRequired.getText().trim().contains("Last Name Required"), "Last Name err mes is displayed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesGenderRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesGenderRequired.getText().trim().contains("Gender Required"), "Gender field err mes is displayed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesTshirtRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesTshirtRequired.getText().trim().contains("T-Shirt Required"), "T-Shirt err mess is displayed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesAcademicGradeRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesAcademicGradeRequired.getText().trim().contains("Academic Grade Required"), "Grade field err mes is displayed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesAcademicSchoolRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesAcademicSchoolRequired.getText().trim().contains("Academic School Required"), "Academic school field err mes displayed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesManabadiLocationRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesManabadiLocationRequired.getText().trim().contains("ManaBadi Location Required"), "ManaBadi Location err mess is displayed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesClassLevelRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesClassLevelRequired.getText().trim().contains("Class Level Required"), "Class Level field err mes is displayed");

		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.siblingerrmesExtracurricularActivitiesRequired),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.siblingerrmesExtracurricularActivitiesRequired.getText().trim().contains("Extracurricular Activities Required"), "Extracurricular Activities err mes id displayed");
	}
	public void assertPaymentInfoMandatoryFields(HashMap<String,String> map) throws InterruptedException{
		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.paymentInfoerrmesContributionAmount),"Error message for Fee name is Displayed");
		Assert.assertTrue(registrationobjects.paymentInfoerrmesContributionAmount.getText().trim().contains("Contribution Amount Should be greater than 0"), "Contribution field err mess is displayed");

	}



	/*
	 * public void assertFeeDetails(HashMap<String, String> map) {
	 * Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().
	 * contains("$ 300.00"), "Course Fee name is Proper");
	 * 
	 * }
	 */

	/*
	 * public void assertSibilingFeeDetails(HashMap<String, String> map) {
	 * Assert.assertTrue(registrationobjects.SibilingFeeDetails.getText().trim().
	 * contains("$ 300.00"), "Sibiling Course Fee name is Proper");
	 * 
	 * }
	 */

	public void assertParentInfoInvalidData(HashMap<String, String> map) {
		Assert.assertTrue(registrationobjects.InvalidDataforFirstName.getText().trim().contains("Please Enter Valid First Name"), "First Name Invalid error mes is displayed");		
		Assert.assertTrue(registrationobjects.InvalidDataforLasttName.getText().trim().contains("Please Enter Valid Last Name"), "Last Name Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvalidDataforEmailt.getText().trim().contains("Invalid email"), "Email Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvalidDataforPhoneNumber.getText().trim().contains("Invalid Phone Number"), "Phone Number Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvaDtaforParenttwoFirstName.getText().trim().contains("Please Enter Valid First Name"), "Parent two first name Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvaDtaforParenttwoLastName.getText().trim().contains("Please Enter Valid Last Name"), "Parent two Last name Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvaDtaforParenttwoEmail.getText().trim().contains("Invalid email"), "Parent two Email Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvaDtaforParenttwoPhoneNumber.getText().trim().contains("Invalid Phone Number"), "Parent two Phone Number Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvaDtaforHomeAddress.getText().trim().contains("Invalid Address"), "Parent two Home Address Invalid error mes is displayed");
	}

	public void assertStudentInfoInvalidData(HashMap<String, String> map) {
		Assert.assertTrue(registrationobjects.InvaDtaStudentFirstName.getText().trim().contains("Please Enter Valid First Name"), "Student info First Name Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvaDtaStudentLastName.getText().trim().contains("Please Enter Valid Last Name"), "Student info Last Name Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvaDtaStudentDOB.getText().trim().contains("Please Enter Valid Date"), "Student info DOB Invalid error mes is displayed");

	}
	public void assertSiblingInfoInvalidData(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		Assert.assertTrue(registrationobjects.InvDtaSiblingFirstName.getText().trim().contains("Please Enter Valid First Name"), "Sibling First Name Invalid error mes is displayed");	
		Assert.assertTrue(registrationobjects.InvDtaSiblingLastName.getText().trim().contains("Please Enter Valid Last Name"), "Sibling Last Name Invalid error mes is displayed");
		Assert.assertTrue(registrationobjects.InvDtaSiblingDOB.getText().trim().contains("Please Enter Valid Date"), "Sibling Date of Birth Invalid error mes is displayed");
	}

	public void assertContribution(HashMap<String, String> map) {
		Assert.assertTrue(registrationobjects.InvDtaContribution.getText().trim().contains("Contribution Amount Should be greater than 0"), "Contribution Invalid error mes is displayed");		
	}
	public void assertSibilingHeader() {
		Assert.assertTrue(registrationobjects.SiblingHeaderName.getText().trim().contains("StudentSibling"), "Sibling Header Name is displayed");		

	}
	public void assertEmailvalidation() throws InterruptedException {
		javaobj.waitForSeconds(3);
		Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.errmsgemailalreadyexists),"Error message for email already exists is Displayed");
		Assert.assertTrue(registrationobjects.errmsgemailalreadyexists.getText().trim().contains("This email already exists"), "This email already exists message displaying properly");

	}
	

	

	/*
	 * public void assertEmailvalidation() {
	 * Assert.assertTrue(seleniumObj.isElementPresent(registrationobjects.
	 * errmsgemailalreadyexists)
	 * ,"Error message for email already exists is Displayed");
	 * Assert.assertTrue(registrationobjects.errmsgemailalreadyexists.getText().trim
	 * ().contains("This email already exists"),
	 * "This email already exists message displaying properly");
	 * 
	 * }
	 */

	public void assertClassLevelValidation(HashMap<String, String> map) {
Assert.assertTrue(registrationobjects.drpdwnclassLevel.getText().trim().contains(map.get("classLevel")), "Class Level displaying properly");
		
	}
	public void assertFeeDetails(HashMap<String, String> map) {
		switch (map.get("Region")) {

		case "USA" :	

			switch (map.get("classLevel")) {

			case "BalaBadi - I" :
				Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().contains("$ 300.00"), "Course Fee name is Proper");
				//Assert.assertTrue(registrationobjects.TotalFee.getText().trim().contains("$ 300.00"), "Total Fee name is Proper");
				break;
			case "Pravesam" :			
				Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().contains("$ 375.00"), "Course Fee name is Proper");			
				Assert.assertTrue(registrationobjects.studentRegistrationFee.getText().trim().contains("+ $ 50.00"), "Course Fee name is Proper");
				//Assert.assertTrue(registrationobjects.TotalFee.getText().trim().contains("$ 425.00"), "Total Fee name is Proper");
				break;
				
			}
			break;
		case "CANADA":
			switch (map.get("classLevel")) {
			case "BalaBadi - I" :
				Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().contains("$ 250.00"), "Course Fee name is Proper");
				//Assert.assertTrue(registrationobjects.TotalFee.getText().trim().contains("$ 250.00"), "Total Fee name is Proper");
				break;
			case "Pravesam" :
				Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().contains("$ 300.00"), "Course Fee name is Proper");		
				//Assert.assertTrue(registrationobjects.TotalFee.getText().trim().contains("$ 300.00"), "Total Fee name is Proper");
				break;
				
			}
			break;
		}
	}

	public void assertSibilingFeeDetails(HashMap<String, String> map) {
		switch (map.get("Region")) {

		case "USA" :	

			switch (map.get("classLevel")) {

			case "BalaBadi - I" :
				Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().contains("$ 300.00"), "Course Fee name is Proper");
				Assert.assertTrue(registrationobjects.siblingCourseFee.getText().trim().contains("$ 375.00"), "Course Fee name is Proper");
				Assert.assertTrue(registrationobjects.siblingDiscount.getText().trim().contains("- $ 75.00"), "Course Fee name is Proper");
				//Assert.assertTrue(registrationobjects.TotalFee.getText().trim().contains("$ 600.00"), "Total Fee name is Proper");
				break;
			case "Pravesam" :			
				Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().contains("$ 375.00"), "Course Fee name is Proper");			
				Assert.assertTrue(registrationobjects.studentRegistrationFee.getText().trim().contains("+ $ 50.00"), "Course Fee name is Proper");
				Assert.assertTrue(registrationobjects.siblingCourseFee.getText().trim().contains("$ 300.00"), "Course Fee name is Proper");			
				//Assert.assertTrue(registrationobjects.siblingRegistrationFee.getText().trim().contains("+ $ 50.00"), "Course Fee name is Proper");
				Assert.assertTrue(registrationobjects.siblingDiscount.getText().trim().contains("- $ 75.00"), "Course Fee name is Proper");
				//Assert.assertTrue(registrationobjects.TotalFee.getText().trim().contains("$ 650.00"), "Total Fee name is Proper");
				break;
				
			}
			break;
		case "CANADA":

			switch (map.get("classLevel")) {		
			case "BalaBadi - I" :			
				Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().contains("$ 250.00"), "Course Fee name is Proper");
				Assert.assertTrue(registrationobjects.siblingCourseFee.getText().trim().contains("$ 300.00"), "Course Fee name is Proper");
				//Assert.assertTrue(registrationobjects.TotalFee.getText().trim().contains("$ 550.00"), "Total Fee name is Proper");
				break;
			case "Pravesam" :
				Assert.assertTrue(registrationobjects.studentCourseFee.getText().trim().contains("$ 300.00"), "Course Fee name is Proper");
				Assert.assertTrue(registrationobjects.siblingCourseFee.getText().trim().contains("$ 250.00"), "sibling Course Fee name is Proper");
				//Assert.assertTrue(registrationobjects.TotalFee.getText().trim().contains("$ 550.00"), "Total Fee name is Proper");
				break;
				//Assert.assertTrue(false);
			}
			break;
		}
	}			
	

	



	

	

	













}
















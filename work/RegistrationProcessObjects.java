package com.Manabadi.main.RegistrationProcess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationProcessObjects {

	@FindBy (xpath="//*[contains(text(),'New Student Registration')]")
	public WebElement btnNewStudentRegistration;
		
	@FindBy (xpath="//div[@id='parentOneTitle']")
	public WebElement drpdwnparentOneTitle;
	
	@FindBy (xpath="//input[@id='parentOneFirstName']")
	public WebElement txtparentOneFirstName;
	
	@FindBy (xpath="//input[@id='parentOneMiddleName']")
	public WebElement txtparentOneMiddleName;
	
	@FindBy (xpath="//input[@id='parentOneLastName']")
	public WebElement txtparentOneLastName;
	
	@FindBy (xpath="//input[@name='parentOneEmail']")
	public WebElement txtparentOneEmail;
	
	@FindBy (xpath="//input[@data-testid='parentOneContact']")
	public WebElement numparentOneContact;
	
	@FindBy (xpath="//input[@name='parentOneProfession']")
	public WebElement txtparentOneProfession;
	
	@FindBy (xpath="//input[@id='parentOneCompany']")
	public WebElement txtparentOneCompany;
	
	@FindBy (xpath="//input[@placeholder='Home Address *']") 
    public WebElement  txthomeAddress;
	
	@FindBy(xpath="//input[@placeholder='Apt/Suite ']")
	public WebElement txtaptSuit;
		
	@FindBy(xpath="(//div[@id='demo-multiple-checkbox'])[1]")
	public WebElement drpdwnvolunteer;
	 	 
	@FindBy(xpath="(//div[@id='demo-multiple-checkbox'])[2]")
	public WebElement drpdwnhearAboutUs;
	 		 	
	@FindBy (xpath="(//input[@name='gilad'])[1]")
	public WebElement chkboxSpeak;
	
	@FindBy (xpath="(//input[@name='gilad'])[2]")
	public WebElement chkboxRead;
	
	
	@FindBy (xpath="//button[text()='Save and continue']")
	public WebElement btnSaveandcontinue;
	
	
	
	@FindBy(xpath="//input[@placeholder='First Name *']")
	public WebElement txtstudentFirstName;
	
	@FindBy(xpath="//input[@id='middleName']")
	public WebElement txtstudentMiddleName;
	
	@FindBy(xpath="//input[@placeholder='Last Name *'] ")
	public WebElement txtstudentLastName;
	
	@FindBy(xpath="//input[@placeholder='Academic School *'] ")
	public WebElement txtstudenacademiSchool;
	
	@FindBy(xpath="//div[@id='tShirt']")
	public WebElement drpdwntShirtSize;
	
	@FindBy(xpath="//input[@placeholder='mm/dd/yyyy']")
	public WebElement numdateOfBirth;
	
	@FindBy(xpath="//div[@id='gender']")
	public WebElement drpdwngender;
	
	@FindBy(xpath="//div[@id='grade']")
	public WebElement drpdwnGrade;
	
	@FindBy(xpath="//div[@id='sortedNearest']")
	public WebElement drpdwnchooseManabadiLocation;
	
	@FindBy(xpath="//div[@id='classLevel']")
	public WebElement drpdwnclassLevel;
	
	@FindBy(xpath="//div[@id='demo-multiple-checkbox']")
	public WebElement drpdwnextraCurricularActivities;
	
	@FindBy(xpath="//p[text()='This email already exists']")
	public WebElement errmsgemailalreadyexists;
	
	@FindBy (xpath="//input[@name='profileImage']")
		public WebElement uploadprofilePic;
	
	@FindBy(xpath="//button[text()='Update photo']")
	public WebElement Updatephoto;
					
	@FindBy(xpath="//button[text()='Preview']")
	public WebElement previewButton;
	
	@FindBy(xpath="//button[text()='Save and continue']")
	public WebElement Saveandcontinue;
	
	@FindBy(xpath="//button[text()='Proceed']")
	public WebElement Proceed;
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement termsAndConditionsCheckBox;
	
	@FindBy(xpath="//button[text()='Continue to payment']")
	public WebElement continuToPayment;
	
	
	
	@FindBy(xpath="//button[text()='Save and continue']")
	public WebElement btnSaveandContinue;
	
	@FindBy(xpath="//button[text()='Proceed']")
	public WebElement btnProceed;
	
	
	
	
	@FindBy(xpath="//button[text()='Continue to payment']")
	public WebElement btncontinueToPayment;
	
	@FindBy(xpath="//input[@id='parentTwoCompany']")
	public WebElement enter;
	
	@FindBy(xpath="//input[@placeholder='Email or mobile number']")
	public WebElement txtpayPaluserName;
	
	@FindBy(xpath="//button[@id='btnNext']")
	public WebElement btnNext;
		
	@FindBy(xpath="//input[@id='password']")
	public WebElement txtpayPalpassword;
	
	@FindBy(xpath="//button[@id='btnLogin']")
	public WebElement btnPaypalLogin;
	
	@FindBy(xpath="(//span[text()='Visa'])[1]")
	public WebElement cardSelection;
	
	@FindBy(xpath="//button[text()='Pay Now']")
	public WebElement btnPaynow;
	
	
	@FindBy(xpath="//div[text()='Registration']")
	public WebElement lblRegistration;
	
	@FindBy(xpath="//div[text()='Registration']/div")
	public WebElement lblRegistrationquote;
	
	@FindBy(xpath="//div[text()='Parent Information']")
	public WebElement lblParentInformation;
	
	@FindBy(xpath="//div[text()='Parent 1']")
	public WebElement lblParent1;
	
	@FindBy(xpath="//div[text()='Parent 2']")
	public WebElement lblParent2;
	
	@FindBy(xpath="//div[text()='Additional Information']")
	public WebElement lblAdditionalInformation;
	
	@FindBy(xpath="//div[text()='Student Information']")
	public WebElement lblStudentInformation;
	
		@FindBy(xpath="//div[text()='Student Details']")
	public WebElement lblStudentDetails;
	
		@FindBy(xpath="//div[text()='Payment Information']")
		public WebElement lblPaymentInformation;
		@FindBy(xpath="//div[text()='Fee Details']")
		public WebElement lblFeeDetails;
	
		@FindBy(xpath="//div[text()='Student Name']")
		public WebElement colStudentName;
	
		@FindBy(xpath="//div[text()='Class']")
		public WebElement colClassName;
	
		@FindBy(xpath="//div[text()='Course Fee']")
		public WebElement colCourseFeeName;
	
		@FindBy(xpath="//div[text()='Registration Fee']")
		public WebElement colRegistrationFeeName;
	
		@FindBy(xpath="//div[text()='PSTU Fee']")
		public WebElement colPSTUFeeName;
		
		@FindBy(xpath="//div[text()='Discount']")
		public WebElement colDiscountName;
		
		@FindBy(xpath="//div[text()='Total Fee']")
		public WebElement colTotalFeeName;
	
	
	
//Validating Mandatory fields for ParentInfo
		
		@FindBy(xpath="//span[text()='Title Required']")
		public WebElement errmsgparentoneTitleRequired;
		
		@FindBy(xpath="//p[text()='First Name Required']")
		public WebElement errmsgparentoneFirstNameRequired;
		
		@FindBy(xpath="//p[text()='Last Name Required']")
		public WebElement errmsgparentoneLastNameRequired;
		
		@FindBy(xpath="//p[text()='Email Required']")
		public WebElement errmsgparentoneEmailRequired;
		
		@FindBy(xpath="//span[text()='Phone Number Required']")
		public WebElement errmsgparentonePhoneNumberRequired;
		
		
		@FindBy(xpath="//p[text()='Profession Required']")
		public WebElement errmsgparentoneProfessionRequired;
		
		@FindBy(xpath="//p[text()='Name of Company Required']")
		public WebElement errmsgparentoneNameofCompanyRequired;
		
		@FindBy(xpath="//div[@id='parentTwoTitle']")
		public WebElement errmsgparenttwoTitleselection;
		
		@FindBy(xpath="(//p[text()='First Name Required'])[2]")
		public WebElement errmsgparenttwoFirstNameRequired;
		
		@FindBy(xpath="(//p[text()='Last Name Required'])[2]")
		public WebElement errmsgparenttwoLastNameRequired;
		
		
		@FindBy(xpath="(//p[text()='Email Required'])[2]")
		public WebElement errmsgparenttwoEmailRequired;
		
		
		@FindBy(xpath="(//span[text()='Phone Number Required'])[2]")
		public WebElement errmsgparenttwoPhoneNumberRequired;
		
		
		@FindBy(xpath="(//p[text()='Profession Required'])[2]")
		public WebElement errmsgparenttwoProfessionRequired;
				
		
		@FindBy(xpath="(//p[text()='Name of Company Required'])[2]")
		public WebElement errmsgparenttwoNameofCompanyRequired;
		
		
		@FindBy(xpath="//span[text()='Home Address Required']")
		public WebElement errmsgaddInforerrmesHomeAddressRequired;
		
		@FindBy(xpath="(//span[text()='This field is required'])[1]")
		public WebElement errmsgvolunteerrequired;
		
		@FindBy(xpath="(//span[text()='This field is required'])[2]")
		public WebElement errmsgaboutUsRequired;
		
		
		//Validating Mandatory fields for StudentInfo
		
		@FindBy(xpath="//span[text()='Image Required']")
		public WebElement errmsgStuInfoerrmesImagerequired;
		
		@FindBy(xpath="//span[text()='First Name Required']")
		public WebElement errmsgStuInfoerrmesFirstNamerequired;
				
		@FindBy(xpath="//span[text()='Last Name Required']")
		public WebElement errmsgStuInfoerrmesLastNamerequired;
		
		@FindBy(xpath="//span[text()='Gender Required']")
		public WebElement errmsgStuInfoerrmesGenderrequired;
		
		@FindBy(xpath="//span[text()='T-Shirt Required']")
		public WebElement errmsgStuInfoerrmesTshirtrequired;
		
		@FindBy(xpath="//span[text()='Academic Grade Required']")
		public WebElement errmsgStuInfoerrmesAcademicGraderequired;
		
		@FindBy(xpath="//span[text()='Academic School Required']")
		public WebElement errmsgStuInfoerrmesAcademicSchoolrequired;;
		
		@FindBy(xpath="//span[text()='ManaBadi Location Required']")
		public WebElement errmsgStuInfoerrmesManabadiLocationrequired;
		
		@FindBy(xpath="//span[text()='Class Level Required']")
		public WebElement errmsgStuInfoerrmesClassLevelrequired;
		
		@FindBy(xpath="//span[text()='Extracurricular Activities Required']")
		public WebElement errmsgStuInfoerrmesExtracurricularActivitiesrequired;
		
		
		//Validating Mandatory fields for Siblings
		
		@FindBy(xpath="//span[text()='Image Required']")
		public WebElement errmsgsiblingImageRequired;
		
		@FindBy(xpath="//span[text()='First Name Required']")
		public WebElement errmsgsiblingFirstNameRequired;
		
		@FindBy(xpath="//span[text()='Last Name Required']")
		public WebElement errmsgsiblingLastNameRequired;
		
		@FindBy(xpath="//span[text()='Gender Required']")
		public WebElement errmsgsiblingGenderRequired;
		
		@FindBy(xpath="//span[text()='T-Shirt Required']")
		public WebElement errmsgsiblingTshirtRequired;
		
		@FindBy(xpath="//span[text()='Academic Grade Required']")
		public WebElement errmsgsiblingAcademicGradeRequired;
		
		@FindBy(xpath="//span[text()='Academic School Required']")
		public WebElement errmsgsiblingAcademicSchoolRequired;
		
		@FindBy(xpath="//span[text()='ManaBadi Location Required']")
		public WebElement errmsgsiblingManabadiLocationRequired;
		
		@FindBy(xpath="//span[text()='Class Level Required']")
		public WebElement errmsgsiblingClassLevelRequired;
		
		@FindBy(xpath="//span[text()='Extracurricular Activities Required']")
		public WebElement errmsgsiblingExtracurricularActivitiesRequired;
		
		
		

//Validating Mandatory fields for ParentInfo
		
		@FindBy(xpath="//span[text()='Title Required']")
		public WebElement parentoneerrmesTitleRequired;
		
		@FindBy(xpath="//p[text()='First Name Required']")
		public WebElement parentoneerrmesFirstNameRequired;
		
		@FindBy(xpath="//p[text()='Last Name Required']")
		public WebElement parentoneerrmesLastNameRequired;
		
		@FindBy(xpath="//p[text()='Email Required']")
		public WebElement parentoneerrmesEmailRequired;
		
		@FindBy(xpath="//span[text()='Phone Number Required']")
		public WebElement parentoneerrmesPhoneNumberRequired;
		
		
		@FindBy(xpath="//p[text()='Profession Required']")
		public WebElement parentoneerrmesProfessionRequired;
		
		@FindBy(xpath="//p[text()='Name of Company Required']")
		public WebElement parentoneerrmesNameofCompanyRequired;
		
		@FindBy(xpath="//div[@id='parentTwoTitle']")
		public WebElement parenttwoTitleselection;
		
		@FindBy(xpath="(//p[text()='First Name Required'])[2]")
		public WebElement parenttwoerrmesFirstNameRequired;
		
		@FindBy(xpath="(//p[text()='Last Name Required'])[2]")
		public WebElement parenttwoerrmesLastNameRequired;
		
		
		@FindBy(xpath="(//p[text()='Email Required'])[2]")
		public WebElement parenttwoerrmesEmailRequired;
		
		
		@FindBy(xpath="(//span[text()='Phone Number Required'])[2]")
		public WebElement parenttwoerrmesPhoneNumberRequired;
		
		
		@FindBy(xpath="(//p[text()='Profession Required'])[2]")
		public WebElement parenttwoerrmesProfessionRequired;
				
		
		@FindBy(xpath="(//p[text()='Name of Company Required'])[2]")
		public WebElement parenttwoerrmesNameofCompanyRequired;
		
		
		@FindBy(xpath="//span[text()='Home Address Required']")
		public WebElement addInforerrmesHomeAddressRequired;
		
		@FindBy(xpath="(//span[text()='This field is required'])[1]")
		public WebElement volunteererrmessrequired;
		
		@FindBy(xpath="(//span[text()='This field is required'])[2]")
		public WebElement aboutUserrmesRequired;
		
		
		//Validating Mandatory fields for StudentInfo
		
		@FindBy(xpath="//span[text()='Image Required']")
		public WebElement StuInfoerrmesImagerequired;
		
		@FindBy(xpath="//span[text()='First Name Required']")
		public WebElement StuInfoerrmesFirstNamerequired;
				
		@FindBy(xpath="//span[text()='Last Name Required']")
		public WebElement StuInfoerrmesLastNamerequired;
		
		@FindBy(xpath="//span[text()='Gender Required']")
		public WebElement StuInfoerrmesGenderrequired;
		
		@FindBy(xpath="//span[text()='T-Shirt Required']")
		public WebElement StuInfoerrmesTshirtrequired;
		
		@FindBy(xpath="//span[text()='Academic Grade Required']")
		public WebElement StuInfoerrmesAcademicGraderequired;
		
		@FindBy(xpath="//span[text()='Academic School Required']")
		public WebElement StuInfoerrmesAcademicSchoolrequired;;
		
		@FindBy(xpath="//span[text()='ManaBadi Location Required']")
		public WebElement StuInfoerrmesManabadiLocationrequired;
		
		@FindBy(xpath="//span[text()='Class Level Required']")
		public WebElement StuInfoerrmesClassLevelrequired;
		
		@FindBy(xpath="//span[text()='Extracurricular Activities Required']")
		public WebElement StuInfoerrmesExtracurricularActivitiesrequired;
		
		
		//Validating Mandatory fields for Siblings
		
		@FindBy(xpath="//span[text()='Image Required']")
		public WebElement siblingerrmesImageRequired;
		
		@FindBy(xpath="//span[text()='First Name Required']")
		public WebElement siblingerrmesFirstNameRequired;
		
		@FindBy(xpath="//span[text()='Last Name Required']")
		public WebElement siblingerrmesLastNameRequired;
		
		@FindBy(xpath="//span[text()='Gender Required']")
		public WebElement siblingerrmesGenderRequired;
		
		@FindBy(xpath="//span[text()='T-Shirt Required']")
		public WebElement siblingerrmesTshirtRequired;
		
		@FindBy(xpath="//span[text()='Academic Grade Required']")
		public WebElement siblingerrmesAcademicGradeRequired;
		
		@FindBy(xpath="//span[text()='Academic School Required']")
		public WebElement siblingerrmesAcademicSchoolRequired;
		
		@FindBy(xpath="//span[text()='ManaBadi Location Required']")
		public WebElement siblingerrmesManabadiLocationRequired;
		
		@FindBy(xpath="//span[text()='Class Level Required']")
		public WebElement siblingerrmesClassLevelRequired;
		
		@FindBy(xpath="//span[text()='Extracurricular Activities Required']")
		public WebElement siblingerrmesExtracurricularActivitiesRequired;
		
		
		//Validating Mandatory fields for PaymentInformation
		
		@FindBy(xpath="//span[text()='Contribution Amount Should be greater than 0']")
		public WebElement paymentInfoerrmesContributionAmount;
		
		
		//Parentinfo2 details filling
		@FindBy(xpath="//div[@id='parentTwoTitle']")
		public WebElement titleselectionparenttwo;
		
		
		@FindBy(xpath="//input[@id='parentTwoFirstName']")
		public WebElement txtparentTwoFirstName;
		
		@FindBy(xpath="//input[@id='parentTwoMiddleName']")
		public WebElement txtparentTwoMiddleFirstName;
		
		@FindBy(xpath="//input[@id='parentTwoLastName']")
		public WebElement txtparentTwoLastName;
		
		@FindBy(xpath="//input[@id='parentTwoEmail']")
		public WebElement txtparentTwoEmail;
		
		@FindBy(xpath="//input[@data-testid='parentTwoContact']")
		public WebElement txtparentTwoPhonenumber;
		
		@FindBy(xpath="//input[@id='parentTwoProfession']")
		public WebElement txtparentTwoProfession;
		
		@FindBy(xpath="//input[@id='parentTwoCompany']")
		public WebElement txtparentTwoNameOfCompany;
		
		//Filling siblings details
		@FindBy(xpath="//button[text()='Add Sibling']")
		public WebElement btnSiblings;
		
		@FindBy(xpath="(//input[@name='profileImage'])[2]")
		public WebElement profileImg;
		
		@FindBy(xpath="(//input[@placeholder='First Name *'])[2]")
		public WebElement txtSiblingsFirstName;
		
		@FindBy(xpath="(//input[@placeholder='Middle Name'])[2]")
		public WebElement txtSiblingsMiddleName;
		
		@FindBy(xpath="(//input[@placeholder='Last Name *'])[2]")
		public WebElement txtSiblingsLastName;
		
		
		@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[2]")
		public WebElement txtSiblingsDOB;
		
		@FindBy(xpath="(//div[@id='gender'])[2]")
		public WebElement drpSiblingsGender;
					
		@FindBy(xpath="(//div[@id='tShirt'])[2]")
		public WebElement drpSiblingsTshirt;
		
		@FindBy(xpath="(//div[@id='grade'])[2]")
		public WebElement drpSiblingsGrade;
		
		@FindBy(xpath="(//input[@placeholder='Academic School *'])[2]")
		public WebElement txtSiblingsAchademicSchool;
		
		@FindBy(xpath="(//div[@id='sortedNearest'])[2]")
		public WebElement drpSiblingsManabadiLocation;
		
		@FindBy(xpath="(//div[@id='classLevel'])[2]")
		public WebElement drpSiblingsClassLevel;
		
		@FindBy(xpath="(//div[@id='demo-multiple-checkbox'])[2]")
		public WebElement drpSiblingsExtraCurricularActivities;
		
		@FindBy(xpath="//span[@class='jss326']")
		public WebElement btnSiblingsPreview;
				
		@FindBy(xpath="//span[@class='jss564']")
		public WebElement btnSiblingsSaveAndContinue;
		
		
		//Validating assertFeeDetails
		
		@FindBy(xpath="(((//div[@class='MuiDataGrid-virtualScrollerContent css-0']//div)[1]//div)[1]//div)[6]")
		public WebElement studentCourseFee;
		
		//Validating assertSibilingFeeDetails
		@FindBy(xpath="(//div[@class='MuiDataGrid-cellContent'])[10]")
		public WebElement SibilingFeeDetails;
		
		
		//Validating Invalid data for Parent information
		@FindBy(xpath="//p[text()='Please Enter Valid First Name ']")
		public WebElement InvalidDataforFirstName;
		
		@FindBy(xpath="//p[text()='Please Enter Valid Last Name ']")
		public WebElement InvalidDataforLasttName;
		
		@FindBy(xpath="//p[text()='Invalid email']")
		public WebElement InvalidDataforEmailt;
		
		@FindBy(xpath="(//span[text()='Invalid Phone Number'])[1]")
		public WebElement InvaDtaforParenttwoPhoneNumber;
		
		@FindBy(xpath="(//p[text()='Please Enter Valid First Name '])[2]")
		public WebElement InvaDtaforParenttwoFirstName;
		
		@FindBy(xpath="(//p[text()='Please Enter Valid Last Name '])[2]")
		public WebElement InvaDtaforParenttwoLastName;
		
		@FindBy(xpath="(//p[text()='Invalid email'])[2]")
		public WebElement InvaDtaforParenttwoEmail;
		
		@FindBy(xpath="(//span[text()='Invalid Phone Number'])[2]")
		public WebElement InvalidDataforPhoneNumber;
				
		@FindBy(xpath="//span[text()='Invalid Address']")
		public WebElement InvaDtaforHomeAddress;
	
		
		//Validating Invalid data for Student information
		@FindBy(xpath="//span[text()='Please Enter Valid First Name ']")
		public WebElement InvaDtaStudentFirstName;
		
		@FindBy(xpath="//span[text()='Please Enter Valid Last Name ']")
		public WebElement InvaDtaStudentLastName;
		
		@FindBy(xpath="//span[text()='Please Enter Valid Date ']")
		public WebElement InvaDtaStudentDOB;
		
		//Validating Invalid data for Siblings information
		@FindBy(xpath="//span[text()='Please Enter Valid First Name ']")
		public WebElement InvDtaSiblingFirstName;
		
		@FindBy(xpath="//span[text()='Please Enter Valid Last Name ']")
		public WebElement InvDtaSiblingLastName;
		
		@FindBy(xpath="//span[text()='Please Enter Valid Date ']")
		public WebElement InvDtaSiblingDOB;
		
		
		//Validating Invalid Data for Contribution
		@FindBy(xpath="//span[text()='Contribution Amount Should be greater than 0']")
		public WebElement InvDtaContribution;
		
		//Validating Sibling Header name
		@FindBy(xpath="(//div[@class='jss1419'])[2]")
		public WebElement SiblingHeaderName;
		@FindBy(xpath="//div[@data-testid='contributionCause']/div")
		public WebElement drpdwncontribution;

		@FindBy(xpath="//input[@id='contributionAmount']")
		public WebElement txtcontributionamount;
		
		@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4 MuiGrid-grid-md-4 MuiGrid-grid-lg-2 jss2419 css-lw5neh'])[1]")
		public WebElement TotalFee;

		@FindBy(xpath="(//div[@class='MuiDataGrid-cellContent'])[4]")
		public WebElement studentRegistrationFee;

		@FindBy(xpath="(//div[@class='MuiDataGrid-cellContent'])[11]")
		public WebElement siblingRegistrationFee;
		
		@FindBy(xpath="(//div[@class='MuiDataGrid-cellContent'])[10]")
		public WebElement siblingCourseFee;
	
		@FindBy(xpath="(//div[@class='MuiDataGrid-cellContent'])[13]")
		public WebElement siblingDiscount;
		
	
		//AdminPanel_Usecase11_ Test case
		
		@FindBy (xpath="//button[@type='button']//span[contains(text(),  'Sign in')]")
		public WebElement signinbutton;	
		@FindBy (xpath="//div[text()='Use another account']")
		public WebElement useanotheraccount;
		@FindBy (xpath="//input[@type='email']")
		public WebElement emailinputvalue;
		@FindBy (xpath="//span[text()='Next']")
		public WebElement nextbutton;
		@FindBy (xpath="//Input[@type='password']")
		public WebElement pwdinput;
		@FindBy (xpath="//p[text()='Super Admin']")
		public WebElement superadmtxt;
		@FindBy (xpath="//button[@type='button']//following::span[text()='Students']")
		public WebElement stdbutton;
		@FindBy (xpath="//button[@aria-pressed='true' and @value='cardView' ]")
		public WebElement gridview;
		@FindBy (xpath="//button[@value='listView']")
		public WebElement listview;
		@FindBy (xpath="(//div[@class='MuiGrid-root css-rfnosa']//button[@type='button' and @aria-label='menu'])[1]")
		public WebElement flyoutoption;
		@FindBy (xpath="(//ul[@role='menu']//li[@role='menuitem'])[1]")
		public WebElement flyoutmenuoption1;
		@FindBy (xpath="(//ul[@role='menu']//li[@role='menuitem'])[2]")
		public WebElement flyoutmenuoption2;
		@FindBy (xpath="(//ul[@role='menu']//li[@role='menuitem'])[3]")
		public WebElement flyoutmenuoption3;
		@FindBy (xpath="(//ul[@role='menu']//li[@role='menuitem'])[4]")
		public WebElement flyoutmenuoption4;
		@FindBy (xpath="(//ul[@role='menu']//li[@role='menuitem'])[5]")
		public WebElement flyoutmenuoption5;
		@FindBy (xpath="(//ul[@role='menu']//li[@role='menuitem'])[6]")
		public WebElement flyoutmenuoption6;
		@FindBy (xpath="(//ul[@role='menu']//li[@role='menuitem'])[7]")
		public WebElement flyoutmenuoption7;
		@FindBy (xpath="//button[text()='Load More']")
		public WebElement loadoption;
		@FindBy (xpath="//span[text()='Total Rows' and '100']")
		public WebElement totalrows;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public String XYZ= "";

	public String logoRefresh;

	public String logoAppLoad;

	public WebElement elementLogoRefresh;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

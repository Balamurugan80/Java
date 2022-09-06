package org.pojoclaass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {

		PageFactory.initElements(driver,this);
	}

		@FindBy(id = "email")
		private WebElement txtEmail;

		@FindBy(id = "pass")
		private WebElement txtPass;

		public WebElement getTxtEmail() {
			return txtEmail;
		}

		public void setTxtEmail(WebElement txtEmail) {
			this.txtEmail = txtEmail;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public void setTxtPass(WebElement txtPass) {
			this.txtPass = txtPass;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}

		public void setLoginbtn(WebElement loginbtn) {
			this.loginbtn = loginbtn;
		}

		@FindBy(id = "loginbutton")
		private WebElement loginbtn;

	}



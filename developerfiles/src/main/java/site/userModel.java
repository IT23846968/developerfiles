package site;

public class userModel {
	private int customerID ;
	private String customerName;
	private String email;
	private String dob;
	private String age;
	private String gender;
	private String phoneNo;
	private String country;
	private String currentPassword;
	
	public userModel(int customerID, String customerName, String email, String dob, String age, String gender,
			String phoneNo, String country, String currentPassword) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.email = email;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.country = country;
		this.currentPassword = currentPassword;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	
	
	
	
}

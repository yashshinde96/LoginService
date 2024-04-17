package com.employee.Responce;

public class EmployeeResponce {

	private int id;
	private int EmployeeId;
	private String Name;
	private String Email;
	private String Mobile_No;
	private AddressResponce AddressResponce;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}
	public AddressResponce getAddressResponce() {
		return AddressResponce;
	}
	public void setAddressResponce(AddressResponce addressResponce) {
		AddressResponce = addressResponce;
	}
	@Override
	public String toString() {
		return "EmployeeResponce [id=" + id + ", EmployeeId=" + EmployeeId + ", Name=" + Name + ", Email=" + Email
				+ ", Mobile_No=" + Mobile_No + ", AddressResponce=" + AddressResponce + "]";
	}
	
}

package com.employee.Responce;

public class AddressResponce {

	int Id;
	String City;
	String State;
	int Empid;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	@Override
	public String toString() {
		return "AddressResponce [Id=" + Id + ", City=" + City + ", State=" + State + ", Empid=" + Empid + "]";
	}
	
}

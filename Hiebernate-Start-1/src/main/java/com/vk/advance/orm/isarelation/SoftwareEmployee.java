package com.vk.advance.orm.isarelation;

public class SoftwareEmployee extends Employee{

	private String softwareTools;
	public SoftwareEmployee(){
		
	}
	public SoftwareEmployee(int empId, String empName, String empDept, String empSalary,String softwareTools) {
		super(empId, empName, empDept, empSalary);
		this.softwareTools = softwareTools;
	}
	public String getSoftwareTools() {
		return softwareTools;
	}
	public void setSoftwareTools(String softwareTools) {
		this.softwareTools = softwareTools;
	}
	@Override
	public String toString() {
		return "SoftwareEmployee [softwareTools=" + softwareTools + "]";
	}
	
	
}

package com.vk.advance.orm.isarelation;

public class HardwareEmployee extends Employee {

	private int workingHours;
	public HardwareEmployee(){
		
	}
	public HardwareEmployee(int empId, String empName, String empDept, String empSalary,int workingHours) {
		super(empId, empName, empDept, empSalary);
		this.workingHours = workingHours;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	@Override
	public String toString() {
		return "HardwareEmployee [workingHours=" + workingHours + "]";
	}
	
	
}

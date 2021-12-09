package mvc.xml_config;

import mvc.validations.CheckEmail;

import java.util.*;


import javax.validation.constraints.*;

public class Employee {

	@Size(min = 2, max=25)
	private String name;
//	@NotEmpty(message = "surname is required field")
	@NotBlank()
	private String surname;
	@Min(value = 500)
	@Max(value = 25001)
	private int salary;
	private String department;
	private Map<String, String> departments;
	private String carBrand;
	private Map<String, String> carBrands;
	private String[] languages;
	private Map<String, String> languageList;

	@Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
	private String phoneNumber;

	@CheckEmail(value = "abs.com", message = "email must ends with abs.com")
	private String email;

	public Employee() {
		departments = new HashMap<>();
		departments.put("IT", "Information Technology");
		departments.put("HR", "Human Resources");
		departments.put("Sales", "Sales");
		departments.put("NewDep", "NewDep");

		carBrands = new HashMap<>();
		carBrands.put("Lada", "Lada");
		carBrands.put("Audi", "Audi");
		carBrands.put("Mercedes", "Merc");

		languageList = new HashMap<>();
		languageList.put("English", "EN");
		languageList.put("Deutch", "DE");
		languageList.put("French", "FR");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Map<String, String> getLanguageList() {
		return languageList;
	}

	public void setLanguageList(Map<String, String> languageList) {
		this.languageList = languageList;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public Map<String, String> getCarBrands() {
		return carBrands;
	}

	public void setCarBrands(Map<String, String> carBrands) {
		this.carBrands = carBrands;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public Map<String, String> getDepartments() {
		return departments;
	}

	public void setDepartments(Map<String, String> departments) {
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", salary=" + salary +
				", department='" + department + '\'' +
				'}';
	}
}

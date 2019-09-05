package com.douzone.di_ex03;

public class Person {

	private String name;
	private String gender;
	private String age;
	private String idNo;

	public Person() {};// constructor default (기본생성자)

	public Person(String strName, String strGender, String strAge, String strIdNo) {
		this.name = strName;
		this.gender = strGender;
		this.age = strAge;
		this.idNo = strIdNo;
	}// construct argument (인자생성자)

	// [region] setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	// [end]

}

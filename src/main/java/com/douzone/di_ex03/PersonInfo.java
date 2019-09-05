package com.douzone.di_ex03;

public class PersonInfo {

	private Person ps;

	PersonInfo(){};// construct default

	public PersonInfo(Person person) {
		this.ps = person;
	}// construct argument

	public void getPerson() {
		if(ps != null) {
			System.out.println("----------------------------");
			System.out.println("이름: " + ps.getName());
			System.out.println("성별: " + ps.getGender());
			System.out.println("나이: " + ps.getAge());
			System.out.println("주민번호: " + ps.getIdNo());
			System.out.println("----------------------------");
		}
	}// getPersonInfo

	public void setPerson(Person person) {
		this.ps = person;
	}
}

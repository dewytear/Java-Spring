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
			System.out.println("�̸�: " + ps.getName());
			System.out.println("����: " + ps.getGender());
			System.out.println("����: " + ps.getAge());
			System.out.println("�ֹι�ȣ: " + ps.getIdNo());
			System.out.println("----------------------------");
		}
	}// getPersonInfo

	public void setPerson(Person person) {
		this.ps = person;
	}
}

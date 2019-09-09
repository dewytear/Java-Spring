package com.douzone.di_ex09;

import java.util.ArrayList;

public class Player {

	private String name;				// 선수명
	private int age;                    // 나이
	private double height;              // 키
	private double weight;              // 몸무게
	private ArrayList<String> position; // 역할

	public Player() {};	// construct default

	public Player(String name, int age, ArrayList<String> posion) {

		this.name = name;
		this.age = age;
		this.position = posion;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getPosition() {
		return position;
	}

	public void setPosition(ArrayList<String> position) {
		this.position = position;
	}
}

package com.douzone.di_ex04;

public class MyBatisService {

	private MyBatisDao myBatisDao;

	// setter
	public void setMyBatisDao(MyBatisDao mbd) {
		this.myBatisDao = mbd;
	}

	public void myBatisTest() {
		System.out.println("------------------");
		myBatisDao.insertDB();
		myBatisDao.updateDB();
		System.out.println("------------------");
	}
}

package com.douzone.di;

public class TestDAOImp implements TestDAO {
	// @Override: jdk5�������� �߰��� annotion�� �ϳ��̴�. ���״�� ���� Ŭ�������� �������̵��� �޼ҵ��� ���� ��Ī
	@Override
	public void printMsg() {
		System.out.println("TestDAO_Imp�� printMsg()�޼ҵ� �Դϴ�.");
	}
}

package com.allen.model;

public class RealImage implements Image {
	private String fileName;//�ļ�����
	
	public RealImage(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ�С�����" + fileName);
	}
	
	private void loadFromDisk(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("�����С�����" + fileName);
	}


}

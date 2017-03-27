package com.allen.model;

public class RealImage implements Image {
	private String fileName;//文件名称
	
	public RealImage(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示中。。。" + fileName);
	}
	
	private void loadFromDisk(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("加载中。。。" + fileName);
	}


}

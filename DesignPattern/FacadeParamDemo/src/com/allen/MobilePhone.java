package com.allen;
/**
 * 手机类
 * @author Allen
 *
 */
public class MobilePhone {
	private Phone mPhone = new PhoneImpl();
	private Camera mCamera = new iPhoneCamera();
	
	public void dail() {
		mPhone.dail();
	}
	
	public void videoChat() {
		System.out.println("视频聊天中。。。");
		mCamera.open();
		mPhone.dail();
	}
	
	public void hangUp() {
		mPhone.hangUp();
	}
	
	public void takePicture() {
		mCamera.open();
		mCamera.takePicture();
	}
	
	public void closeCamera() {
		mCamera.close();
	}
}

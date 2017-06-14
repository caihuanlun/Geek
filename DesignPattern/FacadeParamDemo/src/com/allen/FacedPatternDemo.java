package com.allen;

/**
 * 外观模式
 * @author Allen
 *
 */
public class FacedPatternDemo {
	public static void main(String[] args) {
		MobilePhone iPhone = new MobilePhone();
		
		// 拍照
		iPhone.takePicture();
		
		// 视频聊天
		iPhone.videoChat();
	}
}

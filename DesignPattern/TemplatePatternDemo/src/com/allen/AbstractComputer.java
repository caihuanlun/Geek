package com.allen;

/**
 * 抽象的Computer类
 * @author Allen
 *
 */
public abstract class AbstractComputer {
	protected void powerOn() {
		System.out.println("开启电源");
	}
	
	protected void checkHardware() {
		System.out.println("硬件检查");
	}
	
	protected void loadOS() {
		System.out.println("载入操作系统");
	}
	
	protected void login() {
		System.out.println("Allen的计算机无验证，直接进入系统");
	}
	
	public final void startUp() {
		System.out.println("----------开机 START----------");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("-----------开机 END-----------");
	}
}

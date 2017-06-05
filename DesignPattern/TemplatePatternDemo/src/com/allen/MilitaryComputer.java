package com.allen;

/**
 * 军用计算机
 * @author Allen
 *
 */
public class MilitaryComputer extends AbstractComputer {
	@Override
	protected void checkHardware() {
		// TODO Auto-generated method stub
		super.checkHardware();
		System.out.println("检查防火墙");
	}
	
	@Override
	protected void login() {
		System.out.println("进行指纹识别等复杂验证");
	}
}

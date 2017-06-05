package com.allen;

/**
 * 程序员的计算机
 * @author Allen
 *
 */
public class CoderComputer extends AbstractComputer {
	@Override
	protected void login() {
		System.out.println("程序员只需进行用户和密码验证就可以了");
	}
}

package com.allen;

/**
 * 电话接口实现类
 * @author Allen
 *
 */
public class PhoneImpl implements Phone {

	@Override
	public void dail() {
		// TODO Auto-generated method stub
		System.out.println("打电话");
	}

	@Override
	public void hangUp() {
		// TODO Auto-generated method stub
		System.out.println("挂断");
	}

}

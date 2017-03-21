package com.allen.observer;

import com.allen.subject.Subject;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("二进制字符串： " + Integer.toBinaryString(subject.getState()));
	}

}

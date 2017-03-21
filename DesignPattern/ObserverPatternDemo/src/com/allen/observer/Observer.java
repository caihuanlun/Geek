package com.allen.observer;

import com.allen.subject.Subject;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}

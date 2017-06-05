package com.allen;

/**
 * 模板方法模式
 * @author Allen
 *
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {
		AbstractComputer comp = new CoderComputer();
		comp.startUp();
		
		comp = new MilitaryComputer();
		comp.startUp();
	}

}

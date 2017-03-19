package com.allen.dao.impl;

import com.allen.dao.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();	       
	    setRedBorder(decoratedShape);
	}
	
	 private void setRedBorder(Shape decoratedShape){
	      System.out.println("±ß¿òÑÕÉ«: ºìÉ«");
	   }
}

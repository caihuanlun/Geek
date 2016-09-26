package com.allen.factory.impl;
import com.allen.dao.Color;
import com.allen.dao.Shape;
import com.allen.dao.impl.Circle;
import com.allen.dao.impl.Rectangle;
import com.allen.dao.impl.Square;
import com.allen.factory.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("圆形")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("长方形")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("正方形")){
	         return new Square();
	      }
	      return null;
	   }
	   
	   @Override
	   public Color getColor(String color) {
	      return null;
	   }

}

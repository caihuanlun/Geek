package com.allen.factory.impl;
import com.allen.dao.Color;
import com.allen.dao.Shape;
import com.allen.dao.impl.Blue;
import com.allen.dao.impl.Green;
import com.allen.dao.impl.Red;
import com.allen.factory.AbstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   public Color getColor(String color) {
	      if(color == null){
	         return null;
	      }		
	      if(color.equalsIgnoreCase("��ɫ")){
	         return new Red();
	      } else if(color.equalsIgnoreCase("��ɫ")){
	         return new Green();
	      } else if(color.equalsIgnoreCase("��ɫ")){
	         return new Blue();
	      }
	      return null;
	   }

}

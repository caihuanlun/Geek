package com.allen.factory;
import com.allen.factory.impl.ColorFactory;
import com.allen.factory.impl.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("��״")){
	         return new ShapeFactory();
	      } else if(choice.equalsIgnoreCase("��ɫ")){
	         return new ColorFactory();
	      }
	      return null;
	   }
}

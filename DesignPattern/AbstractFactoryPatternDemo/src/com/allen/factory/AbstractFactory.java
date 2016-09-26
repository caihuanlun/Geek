package com.allen.factory;
import com.allen.dao.Color;
import com.allen.dao.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}

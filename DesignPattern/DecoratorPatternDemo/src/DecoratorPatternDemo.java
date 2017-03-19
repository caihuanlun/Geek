import com.allen.dao.Shape;
import com.allen.dao.impl.Circle;
import com.allen.dao.impl.Rectangle;
import com.allen.dao.impl.RedShapeDecorator;

/**
 * 装饰者的模式的Demo
 * 
 * @author Allen
 *
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("\n圆形——普通边框");
		circle.draw();

		System.out.println("\n圆形——红色边框");
		redCircle.draw();

		System.out.println("\n矩形——红色边框");
		redRectangle.draw();
	}

}

import com.allen.dao.Shape;
import com.allen.dao.impl.Circle;
import com.allen.dao.impl.Rectangle;
import com.allen.dao.impl.RedShapeDecorator;

/**
 * װ���ߵ�ģʽ��Demo
 * 
 * @author Allen
 *
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("\nԲ�Ρ�����ͨ�߿�");
		circle.draw();

		System.out.println("\nԲ�Ρ�����ɫ�߿�");
		redCircle.draw();

		System.out.println("\n���Ρ�����ɫ�߿�");
		redRectangle.draw();
	}

}

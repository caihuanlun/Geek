import com.allen.dao.Shape;
import com.allen.dao.impl.Circle;
import com.allen.dao.impl.Rectangle;
import com.allen.dao.impl.Square;

/**
 * 描述：工厂类
 * @author Allen
 *
 */
public class ShapeFactory {
	
	// 使用 getShape 方法获取形状类型的对象
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("圆形")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("长方形")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("正方形")) {
			return new Square();
		}
		return null;
	}

}

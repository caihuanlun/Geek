import com.allen.dao.Color;
import com.allen.dao.Shape;
import com.allen.factory.AbstractFactory;
import com.allen.factory.FactoryProducer;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {

	      //��ȡ��״����
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("��״");

	      //��ȡ��״Ϊ Circle �Ķ���
	      Shape shape1 = shapeFactory.getShape("Բ��");

	      //���� Circle �� draw ����
	      shape1.draw();

	      //��ȡ��״Ϊ Rectangle �Ķ���
	      Shape shape2 = shapeFactory.getShape("������");

	      //���� Rectangle �� draw ����
	      shape2.draw();
	      
	      //��ȡ��״Ϊ Square �Ķ���
	      Shape shape3 = shapeFactory.getShape("������");

	      //���� Square �� draw ����
	      shape3.draw();

	      //��ȡ��ɫ����
	      AbstractFactory colorFactory = FactoryProducer.getFactory("��ɫ");

	      //��ȡ��ɫΪ Red �Ķ���
	      Color color1 = colorFactory.getColor("��ɫ");

	      //���� Red �� fill ����
	      color1.fill();

	      //��ȡ��ɫΪ Green �Ķ���
	      Color color2 = colorFactory.getColor("��ɫ");

	      //���� Green �� fill ����
	      color2.fill();

	      //��ȡ��ɫΪ Blue �Ķ���
	      Color color3 = colorFactory.getColor("��ɫ");

	      //���� Blue �� fill ����
	      color3.fill();
	   }
}

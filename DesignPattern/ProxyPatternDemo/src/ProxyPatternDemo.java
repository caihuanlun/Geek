import com.allen.model.Image;
import com.allen.model.ProxyImage;

/**
 * ����������ģʽ
 * @author Allen
 *
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test.jpg");

		// ͼ�񽫴Ӵ��̼���
		image.display();
		System.out.println("");
		// ͼ���޷��Ӵ��̼���
		image.display();
	}

}

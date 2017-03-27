import com.allen.model.Image;
import com.allen.model.ProxyImage;

/**
 * 描述：代理模式
 * @author Allen
 *
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test.jpg");

		// 图像将从磁盘加载
		image.display();
		System.out.println("");
		// 图像将无法从磁盘加载
		image.display();
	}

}

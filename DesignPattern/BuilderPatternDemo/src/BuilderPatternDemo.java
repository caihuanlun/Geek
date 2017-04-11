import builder.Builder;
import builder.MacbookBuilder;

/**
 * 建造者模式
 * @author Allen
 *
 */
public class BuilderPatternDemo {
	public static void main(String args[]) {
		// 构造器
		Builder builder = new MacbookBuilder();
		// Diector
		Director pcDirector = new Director(builder);
		// 封装构建过程，4核、内存2GB、Mac 系统
		pcDirector.construct("英特尔主板", "Retina 显示器");
		// 构建计算机，输出相关信息
		System.out.println("Computer Info:" + builder.create().toString());
	}
}

import builder.Builder;
import builder.MacbookBuilder;

/**
 * ������ģʽ
 * @author Allen
 *
 */
public class BuilderPatternDemo {
	public static void main(String args[]) {
		// ������
		Builder builder = new MacbookBuilder();
		// Diector
		Director pcDirector = new Director(builder);
		// ��װ�������̣�4�ˡ��ڴ�2GB��Mac ϵͳ
		pcDirector.construct("Ӣ�ض�����", "Retina ��ʾ��");
		// �������������������Ϣ
		System.out.println("Computer Info:" + builder.create().toString());
	}
}

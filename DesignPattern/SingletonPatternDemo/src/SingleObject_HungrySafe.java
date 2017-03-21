/**
 * ����������ʽ���̰߳�ȫ
 * @author Allen
 *
 */
public class SingleObject_HungrySafe {
	private static SingleObject_HungrySafe instance = new SingleObject_HungrySafe();
	
	private SingleObject_HungrySafe() {}
	
	public static SingleObject_HungrySafe getInstance() {
		return instance;
	}
}

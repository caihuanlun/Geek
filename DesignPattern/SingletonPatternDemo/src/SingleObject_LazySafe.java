/**
 * ����������ģʽ���̰߳�ȫ
 * @author Allen
 *
 */
public class SingleObject_LazySafe {
	private static SingleObject_LazySafe instance;

	private SingleObject_LazySafe() {}

	/**
	 * �������߳� ��ȫ
	 * @return
	 */
	public static synchronized SingleObject_LazySafe getInstance() {
		if (instance == null) {
			instance = new SingleObject_LazySafe();
		}
		return instance;
	}
}

/**
 * 描述：懒汉模式，线程安全
 * @author Allen
 *
 */
public class SingleObject_LazySafe {
	private static SingleObject_LazySafe instance;

	private SingleObject_LazySafe() {}

	/**
	 * 加锁，线程 安全
	 * @return
	 */
	public static synchronized SingleObject_LazySafe getInstance() {
		if (instance == null) {
			instance = new SingleObject_LazySafe();
		}
		return instance;
	}
}

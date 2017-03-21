/**
 * 描述：饿汉式，线程安全
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

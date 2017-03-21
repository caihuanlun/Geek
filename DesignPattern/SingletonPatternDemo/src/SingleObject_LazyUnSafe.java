/**
 * 描述：懒汉模式，非线程安全
 * @author Allen
 *
 */
public class SingleObject_LazyUnSafe {
	private static SingleObject_LazyUnSafe instance;
	
	private SingleObject_LazyUnSafe() {}
	
	public static SingleObject_LazyUnSafe getInstance() {
		if(instance == null){
			instance = new SingleObject_LazyUnSafe();
		}
		return instance;
	}
}

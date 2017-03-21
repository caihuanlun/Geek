/**
 * ÃèÊö£ºË«ÖØĞ£ÑéËø
 * @author Allen
 *
 */
public class SingleObject_DCLSafe {
	private volatile static SingleObject_DCLSafe instance;
	
	private SingleObject_DCLSafe() {}
	
	public static SingleObject_DCLSafe getInstance() {
		if (instance == null) {
			synchronized (SingleObject_DCLSafe.class) {
				if (instance == null) {
					instance = new SingleObject_DCLSafe();
				}
			}
		}
		return instance;
	}
}

/**
 * 描述：登记式，线程安全
 * @author Allen
 *
 */
public class SingleObject_RegisterSafe {
	private static class SingleHolder {
		private static final SingleObject_RegisterSafe INSTANCE = new SingleObject_RegisterSafe();
	}
	
	private SingleObject_RegisterSafe() {}
	
	public static final SingleObject_RegisterSafe getInstance() {
		return SingleHolder.INSTANCE;
	}
}

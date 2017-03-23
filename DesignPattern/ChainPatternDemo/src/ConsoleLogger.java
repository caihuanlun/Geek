
public class ConsoleLogger extends AbstractLogger {
	
	public ConsoleLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("±ê×¼£º£ºLogger£º" + message);
	}

}

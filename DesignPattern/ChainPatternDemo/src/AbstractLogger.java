/**
 * 描述：Logger抽象类
 * 
 * @author Allen
 *
 */
public abstract class AbstractLogger {
	public static int INFO = 1;//级别1：普通信息
	public static int DEBUG = 2;//级别2：debug信息
	public static int ERROR = 3;//级别3：错误信息

	protected int level;

	// 责任链中的下一个元素
	protected AbstractLogger nextLogger;
	
	/**
	 * 设置下一个Logger
	 * @param nextLogger
	 */
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	/**
	 * 分发log信息
	 * @param level
	 * @param message
	 */
	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}

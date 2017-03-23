/**
 * ������Logger������
 * 
 * @author Allen
 *
 */
public abstract class AbstractLogger {
	public static int INFO = 1;//����1����ͨ��Ϣ
	public static int DEBUG = 2;//����2��debug��Ϣ
	public static int ERROR = 3;//����3��������Ϣ

	protected int level;

	// �������е���һ��Ԫ��
	protected AbstractLogger nextLogger;
	
	/**
	 * ������һ��Logger
	 * @param nextLogger
	 */
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	/**
	 * �ַ�log��Ϣ
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

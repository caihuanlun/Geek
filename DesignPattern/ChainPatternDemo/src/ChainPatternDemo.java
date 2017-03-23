/**
 * 描述：责任链模式
 * @author Allen
 *
 */
public class ChainPatternDemo {
	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "这是一个信息");

		loggerChain.logMessage(AbstractLogger.DEBUG, "这是一个debug信息");

		loggerChain.logMessage(AbstractLogger.ERROR, "这是一个错误信息");
	}
}

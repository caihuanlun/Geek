package bean;
/**
 * 计算机抽象类，即Product角色
 * @author Allen
 *
 */
public abstract class Computer {
	protected String mBoard;
	protected String mDisplay;
	protected String mOS;
	
	protected Computer() {
	}

	/**
	 * 设置主板
	 * @param mBoard
	 */
	public void setmBoard(String mBoard) {
		this.mBoard = mBoard;
	}

	/**
	 * 设置显示器
	 * @param mDisplay
	 */
	public void setmDisplay(String mDisplay) {
		this.mDisplay = mDisplay;
	}

	/**
	 * 设置操作系统
	 * @param mOS
	 */
	public abstract void setmOS();

	@Override
	public String toString() {
		return "Computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay + ", mOS=" + mOS + "]";
	}
}

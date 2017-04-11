package bean;
/**
 * ����������࣬��Product��ɫ
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
	 * ��������
	 * @param mBoard
	 */
	public void setmBoard(String mBoard) {
		this.mBoard = mBoard;
	}

	/**
	 * ������ʾ��
	 * @param mDisplay
	 */
	public void setmDisplay(String mDisplay) {
		this.mDisplay = mDisplay;
	}

	/**
	 * ���ò���ϵͳ
	 * @param mOS
	 */
	public abstract void setmOS();

	@Override
	public String toString() {
		return "Computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay + ", mOS=" + mOS + "]";
	}
}

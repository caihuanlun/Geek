package builder;

import bean.Computer;

/**
 * ����Builder
 * @author Allen
 *
 */
public abstract class Builder {
	// ��������
	public abstract void buildBoard(String board);
	// ������ʾ��
	public abstract void buildDisplay(String display);
	// ���ò���ϵͳ
	public abstract void buildOS();
	// ����Computer
	public abstract Computer create();
}

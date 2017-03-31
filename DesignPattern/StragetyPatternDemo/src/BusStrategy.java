/**
 * �������۸�������
 * 
 * @author Allen
 *
 */
public class BusStrategy implements CalculateStrategy {
	
	/**
	 * ʮ��������һԪǮ������ʮ����֮��ÿ����һԪǮ���Գ���5����
	 */
	@Override
	public int calculatePrice(int km) {
		// TODO Auto-generated method stub
		// ����10������ܾ���
		int extraTotal = km - 10;
		// ����ľ�����5����ı���
		int extraFactor = extraTotal / 5;
		// �����ľ����5����ȡ��
		int fraction = extraTotal % 5;
		// �۸����
		int price = 1 + extraFactor * 1;
		return fraction > 0 ? ++price : price;
	}

}

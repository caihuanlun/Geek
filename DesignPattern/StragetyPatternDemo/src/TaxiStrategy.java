/**
 * ��ʿ�۸�������
 * @author Allen
 *
 */
public class TaxiStrategy implements CalculateStrategy {
	/**
	 * �۸��Ϊ������
	 */
	@Override
	public int calculatePrice(int km) {
		// TODO Auto-generated method stub
		
		return km * 2;
	}

}

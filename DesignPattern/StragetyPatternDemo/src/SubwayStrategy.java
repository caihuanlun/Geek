/**
 * �����۸�������
 * 
 * @author Allen
 *
 */
public class SubwayStrategy implements CalculateStrategy {

	/**
	 * 6�������6�������3Ԫ��6~12�������12���4Ԫ��12~22�������22���5Ԫ��22~32�������32���6Ԫ��
	 */
	@Override
	public int calculatePrice(int km) {
		// TODO Auto-generated method stub
		if (km <= 6) {
			return 3;
		} else if(km > 6 && km <= 12) {
			return 4;
		} else if(km > 12 && km <= 22) {
			return 5;
		} else if(km > 22 && km <= 322) {
			return 6;
		}
		// �����������Ϊ7Ԫ
		return 7;
	}

}

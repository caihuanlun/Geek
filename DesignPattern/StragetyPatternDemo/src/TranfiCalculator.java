/**
 * ����ģʽ,�����۸������
 * @author Allen
 *
 */
public class TranfiCalculator {
	CalculateStrategy mCalculateStrategy;
	
	public static void main(String[] args) {
		TranfiCalculator tranfiCalculator = new TranfiCalculator();
		tranfiCalculator.setStrategy(new TaxiStrategy());
		System.out.println("���⳵����16����ļ۸�" + tranfiCalculator.calculatePrice(16));
		tranfiCalculator.setStrategy(new BusStrategy());
		System.out.println("����������16����ļ۸�" + tranfiCalculator.calculatePrice(16));
		tranfiCalculator.setStrategy(new SubwayStrategy());
		System.out.println("��������16����ļ۸�" + tranfiCalculator.calculatePrice(16));
	}
	
	/**
	 * ���ü���������
	 * @param calculateStrategy
	 */
	public void setStrategy(CalculateStrategy calculateStrategy) {
		this.mCalculateStrategy = calculateStrategy;
	}
	
	public int calculatePrice(int km) {
		return mCalculateStrategy.calculatePrice(km);
	}
}

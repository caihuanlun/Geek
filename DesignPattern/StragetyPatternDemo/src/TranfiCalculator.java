/**
 * 策略模式,公交价格计算器
 * @author Allen
 *
 */
public class TranfiCalculator {
	CalculateStrategy mCalculateStrategy;
	
	public static void main(String[] args) {
		TranfiCalculator tranfiCalculator = new TranfiCalculator();
		tranfiCalculator.setStrategy(new TaxiStrategy());
		System.out.println("出租车乘坐16公里的价格：" + tranfiCalculator.calculatePrice(16));
		tranfiCalculator.setStrategy(new BusStrategy());
		System.out.println("公交车乘坐16公里的价格：" + tranfiCalculator.calculatePrice(16));
		tranfiCalculator.setStrategy(new SubwayStrategy());
		System.out.println("地铁乘坐16公里的价格：" + tranfiCalculator.calculatePrice(16));
	}
	
	/**
	 * 设置计算器策略
	 * @param calculateStrategy
	 */
	public void setStrategy(CalculateStrategy calculateStrategy) {
		this.mCalculateStrategy = calculateStrategy;
	}
	
	public int calculatePrice(int km) {
		return mCalculateStrategy.calculatePrice(km);
	}
}

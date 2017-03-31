/**
 * 的士价格计算策略
 * @author Allen
 *
 */
public class TaxiStrategy implements CalculateStrategy {
	/**
	 * 价格简化为公里数
	 */
	@Override
	public int calculatePrice(int km) {
		// TODO Auto-generated method stub
		
		return km * 2;
	}

}

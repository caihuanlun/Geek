/**
 * 地铁价格计算策略
 * 
 * @author Allen
 *
 */
public class SubwayStrategy implements CalculateStrategy {

	/**
	 * 6公里（包含6公里）以内3元；6~12公里（包含12公里）4元；12~22公里（包含22公里）5元；22~32公里（包含32公里）6元。
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
		// 其他的情况简化为7元
		return 7;
	}

}

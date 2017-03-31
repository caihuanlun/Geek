/**
 * 公交车价格计算策略
 * 
 * @author Allen
 *
 */
public class BusStrategy implements CalculateStrategy {
	
	/**
	 * 十公里以内一元钱，超过十公里之后每增加一元钱可以乘坐5公里
	 */
	@Override
	public int calculatePrice(int km) {
		// TODO Auto-generated method stub
		// 超过10公里的总距离
		int extraTotal = km - 10;
		// 查过的距离是5公里的倍数
		int extraFactor = extraTotal / 5;
		// 超过的距离对5公里取余
		int fraction = extraTotal % 5;
		// 价格计算
		int price = 1 + extraFactor * 1;
		return fraction > 0 ? ++price : price;
	}

}

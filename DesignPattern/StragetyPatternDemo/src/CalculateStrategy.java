/**
 * 计算接口
 * @author Allen
 *
 */
public interface CalculateStrategy {
	/**
	 * 按距离计算价格
	 * @param km
	 * @return
	 */
	int calculatePrice(int km);
}

/**
 * 状态模式，客户端
 * @author Allen
 *
 */
public class Client {
	public static void main(String args[]){
		TvController tvController = new TvController();
		
		//设置开机状态
		tvController.powerOn();
		//下一个频道
		tvController.nextChannel();
		//调高音量
		tvController.turnUp();
		//设置开机状态
		tvController.powerOff();
		//调高音量，此时不会生效
		tvController.turnUp();
	}
}

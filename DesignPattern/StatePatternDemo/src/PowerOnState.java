/**
 * 开机状态，此时再触发开机功能不做任何操作
 * @author Allen
 *
 */
public class PowerOnState implements TvState {

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		System.out.println("下一个频道");
	}

	@Override
	public void prevChannel() {
		// TODO Auto-generated method stub
		System.out.println("上一个频道");
	}

	@Override
	public void turnUp() {
		// TODO Auto-generated method stub
		System.out.println("调高音量");
	}

	@Override
	public void turnDown() {
		// TODO Auto-generated method stub
		System.out.println("调低音量");
	}

}

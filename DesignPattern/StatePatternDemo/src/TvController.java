/**
 * ����ң����
 * @author Allen
 *
 */
public class TvController implements PowerController {
	TvState mTvState;
	
	public void setTvState(TvState mTvState) {
		this.mTvState = mTvState;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		setTvState(new  PowerOnState());
		System.out.println("������");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		setTvState(new PowerOffState());
		System.out.println("�ػ���");
	}
	
	public void nextChannel() {
		mTvState.nextChannel();
	}
	
	public void prevChannel() {
		mTvState.prevChannel();
	}
	
	public void turnUp() {
		mTvState.turnUp();
	}
	
	public void turnDown() {
		mTvState.turnDown();
	}
}

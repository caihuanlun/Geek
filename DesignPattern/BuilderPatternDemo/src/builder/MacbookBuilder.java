package builder;

import bean.Computer;
import bean.Macbook;

/**
 * ¾ßÌåµÄBuilder£¬MacBookBuilder
 * @author Allen
 *
 */
public class MacbookBuilder extends Builder {
	private Computer mComputer = new Macbook();

	@Override
	public void buildBoard(String board) {
		// TODO Auto-generated method stub
		mComputer.setmBoard(board);
	}

	@Override
	public void buildDisplay(String display) {
		// TODO Auto-generated method stub
		mComputer.setmDisplay(display);
	}

	@Override
	public void buildOS() {
		// TODO Auto-generated method stub
		mComputer.setmOS();
	}

	@Override
	public Computer create() {
		// TODO Auto-generated method stub
		return mComputer;
	}

}

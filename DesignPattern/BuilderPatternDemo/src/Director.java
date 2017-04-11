

import builder.Builder;

/**
 * Director类，负责构造Computer
 * @author Allen
 *
 */
public class Director {
	Builder mBuilder = null;
	
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.mBuilder = builder;
	}
	
	public void construct(String board, String display) {
		mBuilder.buildBoard(board);
		mBuilder.buildDisplay(display);
		mBuilder.buildOS();
	}
}

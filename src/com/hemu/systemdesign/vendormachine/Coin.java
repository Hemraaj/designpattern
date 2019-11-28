package com.hemu.systemdesign.vendormachine;

/**
 * @author hemchand.mahto
 */
public enum Coin {
	TEN(10), TWENTY(20), FIVE(5), FIFTY(50), HUDRED(100);
	private int value;
	Coin(int v) {
		value = v;
	}
	public int getValue(){
		return value;
	}

}

package com.hemu.systemdesign.vendormachine;

import java.util.List;

/**
 * @author hemchand.mahto
 */
public interface VendorMachine {
	void insertCoin(Coin coin);
	int selectItemAndGetPrice(Item item);
	List<Coin> refund();
	Bucket<Item,List<Coin>> collectItemAndChange();
}

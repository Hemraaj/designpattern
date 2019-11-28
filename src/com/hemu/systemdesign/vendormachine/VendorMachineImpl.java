package com.hemu.systemdesign.vendormachine;

import java.util.List;

/**
 * @author hemchand.mahto
 */
public class VendorMachineImpl implements VendorMachine {
	private Inventory cashInventory = new Inventory();
	private Inventory itemInventory = new Inventory();
	private int totalSale;
	private int currBalance;
private Item currentItem;
	private void initialize() {
		for (Coin c : Coin.values()) {
			cashInventory.put(c, 5);
		}
		for (Item item : Item.values()) {
			itemInventory.put(item, 5);
		}
	}

	@Override
	public void insertCoin(Coin coin) {
		cashInventory.add(coin);
	}

	@Override
	public int selectItemAndGetPrice(Item item) {
		if (itemInventory.hasItem(item)) {
			return item.getPrice();
		}
		throw new RuntimeException("Sold out, Please buy another Item ");
	}

	@Override
	public List<Coin> refund() {
		//ToDo implement this part
		return null;
	}

	@Override
	public Bucket<Item, List<Coin>> collectItemAndChange() {
	//	if(isFullPaid())
//ToDo implement this part
		return null;
	}

	private boolean isFullPaid(){
		return currBalance >=currentItem.getPrice()?true:false;
	}
}

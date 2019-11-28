package com.hemu.systemdesign.vendormachine;

/**
 * @author hemchand.mahto
 */
public enum Item {
	PEPSI("Pepsi", 20),
	SODA("Soda", 25),
	COKE("Coke", 10);
	private String name;
	private int price;

	Item(String name, int price) {
		this.name = name;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

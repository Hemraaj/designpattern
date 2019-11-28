package com.hemu.systemdesign.vendormachine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hemchand.mahto
 */
public class Inventory<T> {
	private Map<T, Integer> inventory = new HashMap<>();

	public void add(T item) {
		int count = inventory.get(item);
		inventory.put(item, count + 1);
	}

	public int getQuantity(T item) {
		Integer count = inventory.get(item);
		return (count == null) ? 0 : count;
	}

	public void deduct(T item) {
		if (hasItem(item)) {
			int count = inventory.get(item);
			inventory.put(item, count - 1);
		}
	}

	public boolean hasItem(T item) {
		return getQuantity(item) > 0;
	}

	public void put(T item, int quantity) {
		inventory.put(item, quantity);
	}

	public void clear() {
		inventory.clear();
	}
}

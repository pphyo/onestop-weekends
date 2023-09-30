package com.jdc.coll.service;

import java.util.ArrayList;
import java.util.List;

import com.jdc.coll.domain.Item;

public class ItemService implements BaseService<Item> {

	private List<Item> storage;

	public ItemService(List<Item> list) {
		storage = list;
	}

	@Override
	public boolean save(Item item) {
		checkItem(item);
		return storage.add(item);
	}

	@Override
	public Item update(int id, Item item) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID must be greater than zero for update.");
		}

		checkItem(item);

		return storage.set(getIndexById(id), item);
	}

	@Override
	public void delete(int id) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID must be greater than for delete.");
		}
		storage.remove(getIndexById(id));
	}

	public void deleteAll(int... ids) {
		if (ids.length <= 0) {
			throw new IllegalArgumentException("Nothing for delete.");
		}

//		for(int id : ids) { // Ok No error
//			int index = getIndexById(id);
//			storage.remove(index);
//		}

		for (int id : ids) {

			var itr = storage.iterator();
			while (itr.hasNext()) {
				var ele = itr.next();

				if (ele.getId() == id)
					itr.remove();
			}
		}
	}

	@Override
	public List<Item> findAll() {
		return new ArrayList<>(storage);
	}

	public List<Item> findByParams(String name, double price) {
		List<Item> result = new ArrayList<>();

		if ((null == name || name.isEmpty() || name.isBlank()) && price <= 0) {
			result.addAll(storage);
		} else {

			for (Item i : storage) {
				if (i.getName().toLowerCase().startsWith(name.toLowerCase()) && i.getPrice() >= price) {
					result.add(i);
				}
			}
		}

		return result;
	}

	private int getIndexById(int id) {
		for (Item i : storage) {
			if (i.getId() == id)
				return storage.indexOf(i);
		}

		return -1;
	}

	public Item getItemById(int id) {
		return storage.get(getIndexById(id));
	}

	private void checkItem(Item item) {
		if (null == item) {
			throw new IllegalArgumentException("Null not accepted.");
		}
	}

}

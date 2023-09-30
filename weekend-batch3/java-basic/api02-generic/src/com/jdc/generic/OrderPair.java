package com.jdc.generic;

public class OrderPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}

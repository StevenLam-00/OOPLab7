package lab7OOP;

import java.util.HashMap;
import java.util.Map;


public class MyMap <K, V>{
	private Map <K,V> map = new HashMap <K,V> ();
	
	public V get (K key) {
		return map.get(key);
	}
	
	public void put (K key, V value) {
		map.put(key, value);
	}

}

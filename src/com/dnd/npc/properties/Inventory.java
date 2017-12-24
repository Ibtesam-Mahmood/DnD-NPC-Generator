package com.dnd.npc.properties;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Inventory {

	Map<Item, Integer> bag =  new HashMap<>();
	
	public void add(Item item) {
		
		for (Iterator i = this.bag.entrySet().iterator(); i.hasNext();) {
			Map.Entry<Item, Integer> index = (Entry<Item, Integer>) i.next();
			
			Item indexKey = index.getKey();
			
			if(indexKey.getName() == item.getName()) {
				index.setValue(index.getValue() + 1);
				return;
			}
		}
		bag.put(item, 1);
	}
	
	public String printInventory() {
		String inv = "";
		
		for (Iterator i = this.bag.entrySet().iterator(); i.hasNext();) {
			
			Map.Entry<Item, Integer> index = (Entry<Item, Integer>) i.next();
			
			inv += index.getKey().getName() + ": " + index.getValue() + "\n";
			
		}
		
		return inv;
	}
	
}

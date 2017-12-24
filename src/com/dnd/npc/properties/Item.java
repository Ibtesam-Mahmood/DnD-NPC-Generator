package com.dnd.npc.properties;

public class Item {

	public enum ItemType{
		
		Weapon,
		Item;
		
	}
	
	protected String name;
	protected ItemType type;
	
	public Item(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public ItemType getItemType() {
		return type;
	}
	
}

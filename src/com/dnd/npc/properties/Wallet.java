package com.dnd.npc.properties;

public class Wallet {

	private int copper = 0; //0.001gp
	private int silver = 0; //0.1gp
	private int gold = 0; //1gp
	private int platnum = 0; //10gp
	
	private float absolutGold;
	
	public Wallet(float gold) {
		gold = (float) (Math.round(gold * 100.0)/100.0);
		this.absolutGold = gold;
		distributeGold(gold);
	}
	
	private void distributeGold(float gold) {
		gold = extractPlatnum(gold);
		gold = extractGold(gold);
		gold = extractSilver(gold);
		gold = extractCopper(gold);
	}
	
	public String coins() {
		String coins = "";
		
		if(this.platnum != 0)
			coins += this.platnum + " pp, ";
		if(this.gold != 0)
			coins += this.gold + " gp, ";
		if(this.silver != 0)
			coins += this.silver + " sp, ";
		if(this.copper != 0)
			coins += this.copper + " cp";
		
		return coins;
	}
	
	
	
	private float extractPlatnum(float gold) {
		
		while(gold - 10 > 0) {
			gold -= 10;
			this.platnum ++;
		}
		
		return gold;
	}
	
	private float extractGold(float gold) {
		
		while(gold - 1 > 0) {
			gold -= 1;
			this.gold ++;
		}
		
		return gold;
	}
	
	private float extractSilver(float gold) {
		
		while(gold - 0.1f > 0) {
			gold -= 0.1f;
			this.silver ++;
		}
		
		return gold;
	}
	
	private float extractCopper(float gold) {
		
		while(gold - 0.01f > 0) {
			gold -= 0.01f;
			this.copper ++;
		}
		
		return gold;
	}
	
}

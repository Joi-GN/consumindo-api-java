package com.github.joicegn;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {
			Villager villager = new VIllagerService().getVillager(i);
			System.out.println(villager);			
		}
		
	}

}

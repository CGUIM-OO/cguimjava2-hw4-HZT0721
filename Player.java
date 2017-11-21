package javahw4;

import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private ArrayList<Card> oneRoundCard;

	public Player(String name, int chips) {
		//Player constructor :name and chips
		this.name = name;
		this.chips = chips;

	}

	public String getName() {

		return name;

	}

	public int makeBet() {
		//set default bet=1 and return
		int bet = 1;
		return bet;

	}

	public void setOneRoundCard(ArrayList cards) {
		//make oneRoundCard point to the same reference of cards
		//in other words :copy cards's reference value to oneRoundCard
		oneRoundCard = cards;

	}

	public boolean hitMe() {
		//create sum to add up all ranks 
		//create get to make the return boolean of the decision that get one more card or not 
		int sum;
		boolean get;
		//add up all ranks 
		sum = getTotalValue();
		//get one more card or not ,decide on sum is bigger than 16 or not 
		if (sum > 16)
			get = false;
		else
			get = true;
		return get;

	}

	public int getTotalValue() {
		//the method that add up all ranks
		int sum = 0;
		for (int i = 0; i < oneRoundCard.size(); i++) {

			Card temp = oneRoundCard.get(i);
			sum += temp.getRank();
		}
		return sum;

	}

	public int getCurrentChips() {

		return chips;

	}

	public void increaseChips(int diff) {

		chips += diff;

	}

	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}

}

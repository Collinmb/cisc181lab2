package PokerEngine;

public class card {
	
	
	
	private eSuit suit;
	private eCardRank rank;
	private boolean bwild;
	
	
	public eSuit getSuit(){
		return suit;
		
	}
	
	
	public eCardValue getRank() {
		return rank;
	}
	
	
	public boolean getWild()
	{
		return this.bwild;
	}
	
/*	public card(eSuit suit, eCardValue rank)
	{
		this.suit = suit;
		this.rank = rank;
	}*/
	
	
	public card(eSuit suit, eCardValue rank, boolean bwild)
	{
		
		this.suit=suit;
		this.rank=rank;
		this.bwild=bwild;
		
	}
}

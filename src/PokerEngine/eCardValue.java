package PokerEngine;

public enum eCardValue {
	
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(14),
	ACE(14),
	JOKER(99);
	
	private int CardValue;
	
	private eCardValue(int value)
	{
		this.cardValue = value;
	}
	
	pblic int getCardValued() {
		return cardValue;
	}

}

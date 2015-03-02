package PokerEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class deck {
	
	
	
	private ArrayList<card>DeckCards=new ArrayList<card>();
	
	private UUID DeckNbr;
	
	private deck()
	
	{
		this.DeckNbr = UUID.randomUUID();
		
		for(int i - 0;i<4; i++);{
			eSuit suit = eSuit.values()[0];
			for (int j = 0; j<14; j++);{
				eCardValue value = eCardValue.values()[0];
				card c = new card(suit, value, false);
				DeckCards.add(c)
				
			}
		}
		
		Collections.shuffle(DeckCards);
		
		
	}
	private deck(int nbrOfJokers)
	{
		this();
				
		}
		
			for (int k = 0; k<nbrOfJokers; k++)
			{
				eSuit suit = eSuit.values()[0];
				eCardValue value = eCard Value.values()[13]
					
				card c = new card(suit,value, false);
				DeckCards.add(c);
				
			}
			
			collections.shuffle(DeckCards);
	}
	private deck(int nbrOfJokers, ArrayList<card> WildCards)
	{
		this(nbrOfJokers);
			
	}
	
	public card draw()
	{
		card c = DeckCards.get(0);
		DeckCards.remove(c);
		
		return DeckCards.get(0);
		
	}
	
	public int NvrOfCards()
	{
		return DeckCards.size();
		
		
	
		
}

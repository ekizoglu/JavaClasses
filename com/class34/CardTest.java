package com.class34;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CardTest {

	public static void main(String[] args) {

		List<Card> list = new LinkedList<>();
		Card card=new AX("Amex");
		Master mc=new Master("Master Card");
		
		list.add(new AX("Amex"));
		list.add(new Visa("Visa"));
		list.add(new Master("Master"));
		list.add(card);
		list.add(mc);
		
		//call both methods of each element
		Iterator<Card> cardIterator=list.iterator();
		while(cardIterator.hasNext()) {
			//code below will give a exception as .next() moves cursor to the 
			//next element
//			cardIterator.next().cahsBack();
//			cardIterator.next().creditLimit();
			System.out.println("---------------------");
			
			Card cc=cardIterator.next();
			cc.cahsBack();
			cc.creditLimit();
		}
	}
}
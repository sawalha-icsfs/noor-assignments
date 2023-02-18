package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

	static List<Card> cardList = new ArrayList<Card>();
	static Player player = new Player() ;
	static Game game = new Game();
	static Player playersNames[] = new Player[4];
	
	public static void cardDistribution() {
		for (int i = 0; i < playersNames.length; i++) {
			List<Card> cardsOfEachPlayer = new ArrayList<Card>();
		
			for (int j = 0; j < 13; j++) {
				cardsOfEachPlayer.add(cardList.get(0));
				cardList.remove(0);
				player.setName(playersNames[i].getName());
				playersNames[i].setCards(cardsOfEachPlayer);
				

			}
			player.setCards(cardsOfEachPlayer);
			
		
			System.out.println("game name :  " + game.getName() + " "+ '\n'+player +'\n');
			
		}
		
	
	}

	public static void shuffleCards() {
		Card card;
		
		for (CardType cardtype : CardType.values())
			for (int j = 1; j <=13; j++) {
				card = new Card(j, cardtype);
			cardList.add(card);
			
			Collections.shuffle(cardList);
			}
		
		
		
	}
		
		
		
		
	

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("please input game name");
		game.setName(scanner.nextLine());
	
		for (int i = 0; i < playersNames.length; i++) {
			System.out.println("please input player " + (i+1) + " name");
			playersNames[i] = new Player(scanner.nextLine());

		}
		shuffleCards();
		
		
		cardDistribution();
		game.setPlayer(playersNames);
		
	
		
		
		
	
	}
	


}

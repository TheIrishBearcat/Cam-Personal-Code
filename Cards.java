import java.util.ArrayList;
import java.util.Random;

public class Cards {
	
	ArrayList<String[]> cards = new ArrayList<String[]>(52);
	ArrayList<String[]> pileOne = new ArrayList<String[]>(100);
	ArrayList<String[]> pileTwo = new ArrayList<String[]>(100);
	ArrayList<String[]> pileThree = new ArrayList<String[]>(100);
	ArrayList<String[]> pileFour = new ArrayList<String[]>(100);
	
	Random r = new Random();
	
	int pickedNumber = r.nextInt(3) + 1;
	int pileOneRandNumber = r.nextInt(9) + 1;
	int pileTwoRandNumber = r.nextInt(15) + 1;
	int pileThreeRandNumber = r.nextInt(15) + 1;
	int i;
	
	String[] deckOfCards = new String[52];
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public void deckOfCardsInit() {
		deckOfCards[0] = ranks[0] + " of " + suits[2];
        deckOfCards[1] = ranks[3] + " of " + suits[3];
        deckOfCards[2] = ranks[6] + " of " + suits[1];
        deckOfCards[3] = ranks[9] + " of " + suits[0];
        deckOfCards[4] = ranks[12] + " of " + suits[2];
        deckOfCards[5] = ranks[2] + " of " + suits[3];
        deckOfCards[6] = ranks[5] + " of " + suits[1];
        deckOfCards[7] = ranks[8] + " of " + suits[0];
        deckOfCards[8] = ranks[11] + " of " + suits[2];
        deckOfCards[9] = ranks[1] + " of " + suits[3];
        deckOfCards[10] = ranks[4] + " of " + suits[1];
        deckOfCards[11] = ranks[7] + " of " + suits[0];
        deckOfCards[12] = ranks[10] + " of " + suits[2];
        deckOfCards[13] = ranks[0] + " of " + suits[3];
        deckOfCards[14] = ranks[3] + " of " + suits[1];
        deckOfCards[15] = ranks[6] + " of " + suits[0];
        deckOfCards[16] = ranks[9] + " of " + suits[2];
        deckOfCards[17] = ranks[12] + " of " + suits[3];
        deckOfCards[18] = ranks[2] + " of " + suits[1];
        deckOfCards[19] = ranks[5] + " of " + suits[0];
        deckOfCards[20] = ranks[8] + " of " + suits[2];
        deckOfCards[21] = ranks[11] + " of " + suits[3];
        deckOfCards[22] = ranks[1] + " of " + suits[1];
        deckOfCards[23] = ranks[4] + " of " + suits[0];
        deckOfCards[24] = ranks[7] + " of " + suits[2];
        deckOfCards[25] = ranks[10] + " of " + suits[3];
        deckOfCards[26] = ranks[0] + " of " + suits[1];
        deckOfCards[27] = ranks[3] + " of " + suits[0];
        deckOfCards[28] = ranks[6] + " of " + suits[2];
        deckOfCards[29] = ranks[9] + " of " + suits[3];
        deckOfCards[30] = ranks[12] + " of " + suits[1];
        deckOfCards[31] = ranks[2] + " of " + suits[0];
        deckOfCards[32] = ranks[5] + " of " + suits[2];
        deckOfCards[33] = ranks[8] + " of " + suits[3];
        deckOfCards[34] = ranks[11] + " of " + suits[1];
        deckOfCards[35] = ranks[1] + " of " + suits[0];
        deckOfCards[36] = ranks[4] + " of " + suits[2];
        deckOfCards[37] = ranks[7] + " of " + suits[3];
        deckOfCards[38] = ranks[10] + " of " + suits[1];
        deckOfCards[39] = ranks[0] + " of " + suits[0];
        deckOfCards[40] = ranks[3] + " of " + suits[2];
        deckOfCards[41] = ranks[6] + " of " + suits[3];
        deckOfCards[42] = ranks[9] + " of " + suits[1];
        deckOfCards[43] = ranks[12] + " of " + suits[0];
        deckOfCards[44] = ranks[2] + " of " + suits[2];
        deckOfCards[45] = ranks[5] + " of " + suits[3];
        deckOfCards[46] = ranks[8] + " of " + suits[1];
        deckOfCards[47] = ranks[11] + " of " + suits[0];
        deckOfCards[48] = ranks[1] + " of " + suits[2];
        deckOfCards[49] = ranks[4] + " of " + suits[3];
        deckOfCards[50] = ranks[7] + " of " + suits[1];
        deckOfCards[51] = ranks[10] + " of " + suits[0];	
	}
	
	public void arrayCode() {
		for (i = 0; i <= 51; i++) {
			cards.add(deckOfCards);
		}
		
		for (i = 0; i <= 2; i++) {
			cards.remove(pickedNumber);
		}
		
		for (i = 0; i <= 9; i++) {
			pileOne.add(cards.get(i));
		}
		
		for (i = 0; i <= 14; i++) {
			pileTwo.add(cards.get(i));
		}
		
		for (i = 0; i <= 14; i++) {
			pileThree.add(cards.get(i));
		}
		
		for (i = 0; i <= 8; i++) {
			pileFour.add(cards.get(i));
		}
		
		cards.clear();
		
		pileTwo.addAll(pileOneRandNumber, pileOne);
		pileOne.remove(pileOneRandNumber);
		
		pileThree.addAll(pileTwoRandNumber, pileTwo);
		pileTwo.remove(pileTwoRandNumber);
		
		pileFour.addAll(pileThreeRandNumber, pileThree);
		pileThree.remove(pileThreeRandNumber);
		
		System.out.println(pileOne.size());
		System.out.println(pileTwo.size());
		System.out.println(pileThree.size());
		System.out.println(pileFour.size());
	}
	
	public static void main(String[] args) {
		Cards c = new Cards();
		c.deckOfCardsInit();
		c.arrayCode();
	}
}
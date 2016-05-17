package mystudy.marble;

import java.util.Scanner;

public class Player {	
	
	private String name;
	private char symbol;
	private int turn;
	private int money;
	private int escapeCard;
	private int specialDiscountCard;
	private static int mans;
	private static char[] symbols = {'●', '■', '★', '▲', '▼', '♠', '♥', '♣', '◆'};
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getEscapeCard() {
		return escapeCard;
	}

	public void setEscapeCard(int escapeCard) {
		this.escapeCard = escapeCard;
	}

	public int getSpecialDiscountCard() {
		return specialDiscountCard;
	}

	public void setSpecialDiscountCard(int specialDiscountCard) {
		this.specialDiscountCard = specialDiscountCard;
	}

	public static int getMans() {
		return mans;
	}

	public static void setMans(int mans) {
		Player.mans = mans;
	}

	public Player() {
		turn = 1;
		money = 500;
		escapeCard = 0;
		specialDiscountCard = 0;
		
	}


	public void setPlayer() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("플레이어 수 입력 > ");
		
		mans = scan.nextInt();
	}
	
	public void input(int i) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("%d 번째 플레이어의 이름 > ", i);
		name = scan.nextLine();
		System.out.printf("%d 번째 플레이어의 심볼 \n", i);
		System.out.printf("1. %c   2. %c   3. %c   4. %c   5. %c   6. %c   7. %c   8. %c   9. %c", symbols[0], symbols[1], symbols[2], symbols[3], symbols[4], symbols[5], symbols[6], symbols[7], symbols[8]);
		int sym = scan.nextInt();
		symbol = symbols[sym];
		symbols[sym] = '　';


		
	}
}

package mystudy.marble;

import java.util.Scanner;

public class Board {

	
	private Player[] players;
	private int[] dice;

	
	public Board() {
		
	}
	
	public void print() {
		System.out.printf("┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐\n");
		System.out.printf("│　　 K T X　　│　　청　주　　│　　충　주　　│　　제　천　　│　사주　팔자　│　　강화도　　│　　인　천　　│　　서　울　　│　　수　원　　│　남　이　섬　│\n");
		System.out.printf("├─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┤\n");
		System.out.printf("│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│\n");
		System.out.printf("├─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│\n");	
		System.out.printf("├─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│\n");
		System.out.printf("├─────┴─┼─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┼─────┴─┤\n");
		System.out.printf("│　사주　팔자　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　사주　팔자　│\n");
		System.out.printf("├─┬─┬─┬─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┬─┬─┬─┤\n");
		System.out.printf("│　│　│　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　│　│　│　│\n");
		System.out.printf("├─┴─┴─┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┴─┴─┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│\n");
		System.out.printf("├─────┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─────┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│\n");	
		System.out.printf("├─────┴─┼───────┬───────┐　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　┌───────┬───────┼─────┴─┤\n");
		System.out.printf("│　　천　안　　│　　세　종　　│　　대　전　　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　춘　천　　│　　원　주　　│　　강　릉　　│\n");
		System.out.printf("├─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┤\n");
		System.out.printf("│　│　│　│　│　│　│　│　│　│　│　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　│　│　│　│　│　│　│　│　│　│　│　│\n");
		System.out.printf("├─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│　　　　　│　│　　　　　│　│\n");
		System.out.printf("├─────┼─┼─────┼─┼─────┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─────┼─┼─────┼─┼─────┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│　　　　　│　│　　　　　│　│\n");
		System.out.printf("└─────┴─┴─────┴─┼─────┴─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─────┴─┼─────┴─┴─────┴─┘\n");
		System.out.printf("　　　　　　　　　　　　　　　　│　　안면도　　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　울릉도　　│\n");
		System.out.printf("　　　　　　　　　　　　　　　　├─┬─┬─┬─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┬─┬─┬─┤\n");
		System.out.printf("　　　　　　　　　　　　　　　　│　│　│　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　│　│　│　│\n");
		System.out.printf("　　　　　　　　　　　　　　　　├─┴─┴─┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┴─┴─┼─┤\n");
		System.out.printf("　　　　　　　　　　　　　　　　│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│\n");
		System.out.printf("　　　　　　　　　　　　　　　　├─────┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─────┼─┤\n");
		System.out.printf("　　　　　　　　　　　　　　　　│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│\n");
		System.out.printf("┌───────┬───────┼─────┴─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─────┴─┼───────┬───────┐\n");
		System.out.printf("│　　군　산　　│　　익　산　　│　　전　주　　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　안　동　　│　　대　구　　│　　포　항　　│\n");
		System.out.printf("├─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┤\n");
		System.out.printf("│　│　│　│　│　│　│　│　│　│　│　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　│　│　│　│　│　│　│　│　│　│　│　│\n");
		System.out.printf("├─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│　　　　　│　│　　　　　│　│\n");
		System.out.printf("├─────┼─┼─────┼─┼─────┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─────┼─┼─────┼─┼─────┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│　　　　　│　│　　　　　│　│\n");
		System.out.printf("├─────┴─┼─────┴─┴─────┴─┘　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　└─────┴─┴─────┴─┼─────┴─┤\n");
		System.out.printf("│　사주　팔자　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　비자금　　│\n");
		System.out.printf("├─┬─┬─┬─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┬─┬─┬─┤\n");
		System.out.printf("│　│　│　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　│　│　│　│\n");
		System.out.printf("├─┴─┴─┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─┴─┴─┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│\n");
		System.out.printf("├─────┼─┤　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　├─────┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　│　　　　　│　│\n");
		System.out.printf("├─────┴─┼───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┼─────┴─┤\n");
		System.out.printf("│　비자금획득　│　　목　포　　│　　광　주　　│　　여　수　　│　　제주도　　│　사주　팔자　│　　김　해　　│　　부　산　　│　　울　산　　│　　월급날　　│\n");
		System.out.printf("├─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┼─┬─┬─┬─┤\n");
		System.out.printf("│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│　│\n");
		System.out.printf("├─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┼─┴─┴─┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│\n");	
		System.out.printf("├─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┼─────┼─┤\n");
		System.out.printf("│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│　　　　　│　│\n");
		System.out.printf("└─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┴─────┴─┘\n");		
	}



	

	
}
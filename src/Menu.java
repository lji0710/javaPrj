
public class Menu {

	public static void main(String[] args) {
		
		String menu[] = {"a","b","c","d","e"};
		int i = (int)(Math.random()*(menu.length));
		System.out.println("오늘의 메뉴"+ menu[i]);
	}

}

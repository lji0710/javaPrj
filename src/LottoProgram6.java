import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;


// 함수로 모듈분리 하는 로또 프로그램

public class LottoProgram6 {

	public static void main(String[] args)	{
		
		// 메인 메뉴 입력
		int menu = ;
		
		switch(inputMainMenu())
		{
		case 1:
			// 로또 자동 생성
			createLotto();
			
			break;
		case 2:
			// 로또 수동 생성
			
			break;
		case 3:
			// 내 로또 번호 보기
			break;
			
		case 4:
			// 종료
			break;
			
		}
		
	}

	private static int inputMainMenu() {
		// TODO Auto-generated method stub
		return 0;
	}
}
import java.util.Scanner;

public class Exammmm {

   public static void main(String[] args) {
      // 투표염

      Scanner scan = new Scanner(System.in);
      int n,num,num2;
      int nj=0;
      int ny=0;
      int no=0;
      
      System .out.println("< 투표하기 >\n");
      System .out.print("투표할 인원수를 입력하세요: ");
      n = scan.nextInt();
         
      out: while(true){
         nj=0; ny=0; no=0; //누적투표결과 초기화
         for(int i=0;i<n;i++){
            
            System .out.println("★투표★ ");
            System .out.println("1. 김나정  2. 김나영  3. 기권 ");
            System .out.print("선택: ");
            num=scan.nextInt();
            
            if(num==1)
               nj += 1;
            else if(num==2)
               ny += 1;
            else
               no += 1;
                     }
         System .out.println("투표가 종료되었습니다.");
         
         System .out.println("투표 결과");
         System .out.printf("1. 김나정:%d표 \n",nj);
         System .out.printf("2. 김나영:%d표 \n",ny);
         System .out.printf("3. 기권/무효표:%d표\n\n ",no);
         if(nj>ny){
            System .out.print("김나정이 당선되었습니다!");
            break;
         }
         else if(nj<ny){
            System .out.print("김나영이 당선되었습니다!");
            break;
         }
         else{
            System .out.print("동률입니다.재투표하시겠습니까?");
            System .out.print("1.재투표  2.종료");
            num2=scan.nextInt();
            if(num2==1)
               continue out;
            else{
               System.out.println("종료합니다");
               break;
            }
               
            }   
         
         }
         
      }   

}


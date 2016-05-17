// http://linuxism.tistory.com/1433  => 제일 도움 된 사이트 
// http://lueseypid.tistory.com/42  => 이해를 돕기위해 추가로 찾아본 사이트 1
// http://hyeonstorage.tistory.com/180 =>=> 이해를 돕기위해 추가로 찾아본 사이트 2
// http://cafe.naver.com/standardjava/558 => 객체 직렬화 강의 동영상



// 위 사이트에 있는 실행문 예제
import java.io.*;
public class ObjectStream {
    public static void main(String[] args) throws Exception {
/* 파일을 열어서 그곳에 객체를 직렬화 시켜서 저장한다. */
// 파일 출력 스트림을 연다. 
    FileOutputStream fos = new FileOutputStream("_imsi.txt");
// 객체 스트림을 열고, 객체스트림을 통해 객체를 파일에 저장
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(new SerializableClass("Serialize Test Program", 1004));
// 스트림을 닫는다. 
    oos.close();
/* 직렬화 된 객체가 저장된 파일로 부터 객체를 해제시켜 원래의 객체를 복원*/
// 파일 입력 스트림으로부터 객체 입력 스트림을 연다.
    FileInputStream fis = new FileInputStream("_imsi.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
// 객체 입력 스트림으로부터 객체를 읽어온다.
    SerializableClass sc = (SerializableClass)ois.readObject();
// 스트림을 닫는다. 
    ois.close();
/* 스트림으로부터 읽어들인 객체의 내용을 출력 원래 생성되었던 객체와 같은 값을 갖는다는 것을 알수가 있다. */
    System.out.println("String : " + sc.mString);
    System.out.println("Integer : " + sc.mInt);
   }
}
/* 하나의 문자열과 정수를 저장하고있는 클래스
Serializable을 implements 함으로써 스트림을 통해 직렬화되고 해제되어질수 있다. */
class SerializableClass implements Serializable{
    public String mString;
    public int mInt;
// 생성자 
    public SerializableClass(String s, int i) {
        this.mString = s;
        this.mInt = i;
    }
}

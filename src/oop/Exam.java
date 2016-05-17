package oop;

public class Exam {

	private int kor;
	private int eng;
	private int math;
	int current = -1;
		
	public Exam() {
		this(0, 0, 0);
	}
	
	
	public Exam(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	public int getKor()
	{
		return kor;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}
	public int getEng()
	{
		return eng;
	}
	public void setMath(int math)
	{
		this.math = math;
	}
	public int getMath()
	{
		return math;
	}

	public int total()
	{
		int total = 0;
		total = kor + eng + math;
		return total;
	}
	
	public float avg()
	{
		float avg = 0;		
		avg = (kor + eng + math)/3;
		return avg;
		
	}

	

}

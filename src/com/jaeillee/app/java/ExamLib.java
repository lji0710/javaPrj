package com.jaeillee.app.java;
public class ExamLib {
	public static int total(Exam exam) {
		
		return total(exam.kor, exam.eng, exam.math);
	}

	public static int total(int kor, int eng, int math) {
		 
		return kor+eng+math;
	}
}

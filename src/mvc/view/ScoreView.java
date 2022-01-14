package mvc.view;

import java.util.ArrayList;

import mvc.vo.StudentVO;

public class ScoreView {
	
	private ArrayList<StudentVO> studentArrList;
	
	public ScoreView(ArrayList<StudentVO> studentArrList) {
		this.studentArrList = studentArrList;
	}
	
	public void print() {
		System.out.println("===== ��ü �л� ���� ���� ��� =====");
		for(int i=0; i<studentArrList.size(); i++) {
			StudentVO s = studentArrList.get(i);	
			int sum =clacSum(s);
			double avg=calcAvg(sum);
			System.out.printf("* %d  %s  ���� : %d  ���� : %d  ���� : %d  ���� : %d  ���� : %d  �հ� : %d  ��� : %.2f\n", 
								s.getStuID(), s.getName(), s.getKor(), s.getMath(), s.getEng(), s.getScience(), s.getHistory(), 
								sum, avg);
		}
	}
	
	public int clacSum(StudentVO s) {
		return s.getKor()+s.getMath()+s.getEng()+s.getScience()+s.getHistory();
	}
	
	public double calcAvg(int sum) {
		return sum/5.0;
	}
}

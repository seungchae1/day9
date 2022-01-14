package mvc.view;

import java.util.ArrayList;

import mvc.vo.StudentVO;

public class ScoreView {
	
	private ArrayList<StudentVO> studentArrList;
	
	public ScoreView(ArrayList<StudentVO> studentArrList) {
		this.studentArrList = studentArrList;
	}
	
	public void print() {
		System.out.println("===== 전체 학생 성적 정보 출력 =====");
		for(int i=0; i<studentArrList.size(); i++) {
			StudentVO s = studentArrList.get(i);	
			int sum =clacSum(s);
			double avg=calcAvg(sum);
			System.out.printf("* %d  %s  국어 : %d  수학 : %d  영어 : %d  과학 : %d  역사 : %d  합계 : %d  평균 : %.2f\n", 
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

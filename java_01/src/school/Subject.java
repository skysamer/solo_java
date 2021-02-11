package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {
	private String subjectName;  //과목이름
	private int subjectId;       // 과목 고유 번호
	private int gradeType;      // 학점 평가 정책
	
	private ArrayList<Student> studentList=new ArrayList<Student>();

	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType=Define.AB_TYPE;
	}
	
	//게터 세터 메서드
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	//수강 신청 메서드
	public void register(Student student) {
		studentList.add(student);
	}
	
	
	
	
	

}

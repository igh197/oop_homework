package oop_homework;

import java.util.List;

public class Course {
	
	private List<String> students;
	
	public List<String> getStudents() {
		return this.students;
	}
	public void setStudents(List<String> students) {
		this.students =students;
	}


	public Course(List<String> students) {
		
		this.students=students;
	}
	public List<String> dropStudent(String student) {
		for(int i=0; i<students.size();i++) {
			if(this.students.contains(student)) {

				students.remove(student);
				}
			
		}
		return this.students;
	}
	public void clear() {
		this.students.removeAll(students);
	}
}

import java.util.*;

class Student implements Comparable<Student> {

	int rollNo;
	String name;
	
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public int compareTo(Student s){
		return this.rollNo - s.rollNo;
	}
}

void main(){
	var lst = new ArrayList<Student>();
	lst.add(new Student(13, "John"));
	lst.add(new Student(2, "Bob"));
	lst.add(new Student(3, "Alice"));

	Collections.sort(lst);

	for(Student s: lst){
		IO.println(s.rollNo);
	}
}

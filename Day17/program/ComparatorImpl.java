import java.util.*;

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

class RollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}

class MarksComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2){
		return (Double.compare(s1.mark, s2.mark) * -1);
	}

}

class Student {
    int rollNo;
    int age;
    double mark;

    Student(int rollNo, int age, double mark) {
        this.rollNo = rollNo;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "RollNo: " + this.rollNo + ", Age: " + this.age + ", Mark: " + this.mark;
    }
}

void main() {
    List<Student> lst = new ArrayList<>();
    lst.add(new Student(15, 15, 23.2));
    lst.add(new Student(5, 34, 23.34));
    lst.add(new Student(34, 12, 79.3));

    List<Comparator<Student>> sortTypes = List.of(
    	new AgeComparator(),
   	new RollNoComparator(),
    	new MarksComparator()
    );

    for(Comparator<Student> st: sortTypes){
	    Collections.sort(lst, st);

	    for (Student s: lst){
		    IO.print(s + " ");
	    }

	    IO.println();
    }
}

package helloworld;

class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dorpStudent(String student) {
		for (int i = 0; i < getNumberOfStudents(); i++) {
			if (students[i] == student) {
				for (int j = i; j < getNumberOfStudents() - 1; j++) {
					students[j] = students[j + 1];
				}
				students[getNumberOfStudents() - 1] = null;
				numberOfStudents--;
			}
		}
	}

	public Object clone() {
		Course courseClone;
		try {
			courseClone = (Course) super.clone();
			courseClone.students = students.clone();
			return courseClone;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}

public class HW3_04 {
	public static void main(String[] args) {
		Course a = new Course("course01");
		a.addStudent("stu01");
		a.addStudent("stu02");
		a.addStudent("stu03");
		a.addStudent("stu04");
		a.addStudent("stu05");
		System.out.print("课程a里的学生有：");
		for (int i = 0; i < a.getNumberOfStudents(); i++)
			System.out.print(a.getStudents()[i] + ", ");
		System.out.println();
		System.out.print("课程a里的学生人数为：");
		System.out.println(a.getNumberOfStudents());

		Course b = (Course) a.clone(); //深度复制a
		
		System.out.println("a与b的学生列表是否相等："+ (a.getStudents() == b.getStudents()));
	}

}

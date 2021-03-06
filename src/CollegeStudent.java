
public class CollegeStudent {
	
	private String name;
	private int age;
	private String college;
	private int numAssignments;
	
	public CollegeStudent(String studentName, int studentAge, String collegeName) {
		name = studentName;
		age = studentAge;
		college = collegeName;
		numAssignments = (int) (Math.random()*3+1);
	}
	
	public void doAssignment() {
		if(numAssignments > 0) {
			int timeSpent = (int) (Math.random()*30+15);
			System.out.println(name + " finished an assignment in " + timeSpent + " minutes.");
			numAssignments--;
		}
		else {
			System.out.println(name + " has no more assignments to do!");
		}
	}
	
	public void doGroupAssignment(CollegeStudent partner) {
		int timeSpent = (int) (Math.random()*60+15);
		System.out.println(name + " worked with " + partner.getName() + " on a group project for " + timeSpent + " minutes.");
	}
	
	public void goToLecture() {
		if(Math.random()*2 > 1) {
			System.out.println(name + " went to a 50 minute lecture at " + college + ".");
		}
		else {
			System.out.println(name + " went to a 75 minute lecture at " + college + ".");
		}
	}
	
	public void goToLecture(Lecture lecture) {
		System.out.println(name + " went to a " + lecture.getLength() + " minute " + lecture.getName() + " lecture at " + college + ".");
	}
	
	public void eatLunch() {
		System.out.println(name + " ate lunch for 60 minutes.");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + ", " + age + ", student at " + college;
	}
}

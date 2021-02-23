import java.util.Scanner;

public class CollegeStudentDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scan.nextLine();
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		System.out.println("Enter your college:");
		scan.nextLine();
		String college = scan.nextLine();
		
		CollegeStudent user = new CollegeStudent(name, age, college);
		
		CollegeStudent jim = new CollegeStudent("Jim", 20, college);
		CollegeStudent steve = new CollegeStudent("Steve", 19, college);
		CollegeStudent brian = new CollegeStudent("Brian", 21, college);
		
		Lecture math = new Lecture("Calculus I", 75);
		Lecture chem = new Lecture("Chemistry", 75);
		Lecture bio = new Lecture("Biology", 50);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Welcome to " + college + ", " + name + "!");
		System.out.println("Your fellow students are " + jim.getName() + ", " + steve.getName() + ", and " + brian.getName() + ".");
		System.out.println("You are taking " + math.getName() + " and " + chem.getName() + ".");
		
		System.out.println("-------------------------------------------");
		
		for(int i = 1; i <= 4; i++) {
			System.out.println("Day " + i);
			user.goToLecture(math);
			jim.goToLecture(math);
			steve.goToLecture(bio);
			user.eatLunch();
			user.goToLecture(chem);
			brian.goToLecture(chem);
			if (i % 2 == 0) {
				user.doGroupAssignment(brian);
			}
			else {
				jim.doGroupAssignment(steve);
			}
			System.out.println("-------------------------------------------");
		}
	}
}

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
		
		CollegeStudent jim = new CollegeStudent("Jim", 20, "Quinnipiac");
		CollegeStudent steve = new CollegeStudent("Steve", 19, "Quinnipiac");
		CollegeStudent brian = new CollegeStudent("Brian", 21, "Quinnipiac");
		
		Lecture math = new Lecture("Calculus I", 75);
		
		System.out.println("-------------------------------------------");
		
		for(int i = 1; i <= 4; i++) {
			System.out.println("Day " + i);
			user.goToLecture();
			jim.goToLecture();
			steve.goToLecture();
			user.eatLunch();
			user.goToLecture();
			brian.goToLecture();
			user.doAssignment();
			System.out.println("-------------------------------------------");
		}
	}
}

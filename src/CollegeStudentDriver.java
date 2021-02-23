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
		user.goToLecture();
		
//		CollegeStudent michael = new CollegeStudent("Michael", 19, "Quinnipiac");
//		System.out.println(michael);
//		System.out.println("-------------------------------------------");
//		
//		for(int i = 1; i <= 4; i++) {
//			System.out.println("Day " + i);
//			michael.goToLecture();
//			michael.goToLecture();
//			michael.eatLunch();
//			michael.goToLecture();
//			michael.doAssignment();
//			System.out.println("-------------------------------------------");
//		}
	}
}

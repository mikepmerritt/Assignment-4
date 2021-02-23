
public class CollegeStudentDriver {

	public static void main(String[] args) {
		
		CollegeStudent michael = new CollegeStudent("Michael", 19, "Quinnipiac");
		System.out.println(michael);
		System.out.println("-------------------------------------------");
		
		for(int i = 1; i <= 4; i++) {
			System.out.println("Day " + i);
			michael.goToLecture();
			michael.goToLecture();
			michael.eatLunch();
			michael.goToLecture();
			michael.doAssignment();
			System.out.println("-------------------------------------------");
		}
	}
}

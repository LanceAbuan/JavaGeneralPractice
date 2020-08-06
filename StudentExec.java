package beginning;
import java.util.*;
import beginning.Student;

public class StudentExec {
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		
				Scanner LanceAbuan = new Scanner(System.in);
				
				System.out.println("How many students would you like to enter into the data base?");
				int student_count = LanceAbuan.nextInt();
				Student[] list_of_students = new Student[student_count];
				
				for (int i = 0; i < student_count; i++) {
					System.out.println("What is the name of student "+(i+1)+"?");
					LanceAbuan.nextLine();
					String name = LanceAbuan.nextLine();
					System.out.println();
					System.out.print("What is "+name+"'s Student id?\n");
					int student_id = LanceAbuan.nextInt();
					System.out.println();
					System.out.println("What is "+name+"'s GPA?");
					double GPA = LanceAbuan.nextDouble();
					System.out.println();
					System.out.println("What is your favorite subject?");
					LanceAbuan.nextLine();
					String fav_sub = LanceAbuan.nextLine();
					
					list_of_students[i] = new Student(name,student_id,GPA,fav_sub);
					
				}
				
				for (int i = 0; i<list_of_students.length;i++) {
					
					list_of_students[i].selfIntroduction();
					
				}
	}
	
}

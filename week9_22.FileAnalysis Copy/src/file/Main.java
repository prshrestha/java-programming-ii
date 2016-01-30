package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        // test your code here

	
						
		File file = new File("test/student_records_10.csv");
		
		Student test1 = new Student(file);
		
		System.out.println(Arrays.deepToString(test1.studentClassesSemester()));
		
		System.out.println("Test");
    }
}

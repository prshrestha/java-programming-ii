/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Student {
	private final File file;

	// number of students
	private final int Ns = 10;
	// number of classes offered in total
	private final int Nc = 18;
	// total number of semester
	private final int Nsem = 12;

	// 3d array for student, course and semester
	int Ap[][][] = new int[Ns][Nc][Nsem];

	public Student(File file) throws Exception {
		this.file = file;
	}

	//returns the 3d array of student, class and semester
	public int [][][] studentClassesSemester () {

		Scanner r = readFile();
		//skip header
		r.next();

		while (r.hasNextLine()) {
			
			//read the next line
			
			String s = r.nextLine();
			
			//split at the comma
			
			String [] s1 = s.split(",");
			
			/*add the student number, course id and semester id to 
			 * the 3 d array and assign value of 1 for the class is 
			 * being taken*/
			
			int i = Integer.parseInt(s1[0]); //student
			int j = Integer.parseInt(s1[1]); //course id
			int k = Integer.parseInt(s1[2]); //semester id
						
			Ap[i][j][k] = 1;
			
		}
		r.close();
		return Ap;
	}

	// this method reads the file and returns the content in it
	private Scanner readFile() {
		try {
			Scanner reader = new Scanner(this.file);
			return reader;
		} catch (FileNotFoundException ex) {
			return null;
		}
	}

}

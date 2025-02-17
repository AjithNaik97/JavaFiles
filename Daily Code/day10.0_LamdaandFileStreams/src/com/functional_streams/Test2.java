package com.functional_streams;

import java.util.List;
import static utils.StudentCollectionUtils.*;

import com.app.core.Student;
import com.app.core.Subject;
import com.app.core.Student;

public class Test2 {

	public static void main(String[] args) {
		List<Student> list=populateList();
		
		//display complete student list
		System.out.println("All students");
		list.forEach(s->System.out.println(s));
		//accept subject from user (scanner)
		System.out.println();
		Subject sub=Subject.JAVA; 
		//display all student details from specified subject
		//src(list) --filter(intermediate op.) -- firEach(terminal app)
		list.stream() //Stream<Student> : all students
		.filter(s->s.getSubject()==sub) //Stream<Student> :java students
		.forEach(s->System.out.println(s));

	}

}

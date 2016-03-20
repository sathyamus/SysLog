package com;

import java.util.ArrayList;
import java.util.List;

import com.snsystems.Student;

public class MemoryTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		long count = 1l;
		while (1 < 2) {
			list.add(new Student(count, "Student: " + count,
					"OutOfMemoryError soon"));
			System.out.println("Count: " + ++count);
		}
	}

}

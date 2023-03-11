package schoolmanagement.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Student {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String name;
	private int age;
	
	
}

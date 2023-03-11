package schoolmanagement.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolmanagement.com.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

package net.example.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.example.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

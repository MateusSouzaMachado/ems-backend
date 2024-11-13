package net.fernandosalas.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.fernandosalas.ems.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

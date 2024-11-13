package net.fernandosalas.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.fernandosalas.ems.Model.Department;


public interface DepartmentRepository extends JpaRepository<Department, Long> {

}

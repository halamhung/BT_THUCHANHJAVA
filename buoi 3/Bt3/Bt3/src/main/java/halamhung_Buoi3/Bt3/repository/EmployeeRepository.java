package halamhung_Buoi3.Bt3.repository;

import halamhung_Buoi3.Bt3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

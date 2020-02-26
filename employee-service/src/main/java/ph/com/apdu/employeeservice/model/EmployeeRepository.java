package ph.com.apdu.employeeservice.model;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Collection<Employee> findByFirstName(@Param("firstName") String firstName);

	Collection<Employee> findByLastName(@Param("lastName") String lastName);

	Collection<Employee> findByGender(@Param("gender") String gender);

	Collection<Employee> findByAge(@Param("age") int age);

}

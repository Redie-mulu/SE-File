package edu.mum.cs425.wallymarty.repository;

import edu.mum.cs425.wallymarty.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

//    public static Specification<Customer> hasDescriptionLike(String desc) {
//        return (root, query, builder) -> builder.like(root.get("description"), "%" + desc + "%");
//    }


//    @Query("SELECT c FROM Customer c WHERE c.dept = :dept AND "
////            + "(SELECT COUNT(DISTINCT e2.salary) FROM Employee e2 "
////            + "WHERE e.salary < e2.salary AND e2.dept = :dept) < :topSalNum "
////            + "ORDER BY e.salary DESC")

//    @Query("SELECT e FROM Customer e WHERE e.country =:country AND e.dateOfBirth >=:dateOfBirth ORDER BY e.name")
//List<Customer> findCustomerByCoutryandDateOfBirthGreaterThan(@Param("country")String country, @Param("dateOfBirth") LocalDate dateOfBirth);





    @Query("SELECT e FROM Customer e WHERE e.dateOfBirth >=?1 ORDER BY e.name")
    List< Customer> findCustomerByCoutryandDateOfBirthGreaterThan(@Param("dateOfBirth") LocalDate dateOfBirth);


}

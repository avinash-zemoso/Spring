package demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by zemoso on 1/8/17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
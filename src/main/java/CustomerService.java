import com.example.acciokartservice.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    public Customer addCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
import com.example.acciokartservice.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
        private final CustomerService customerService;

        @Autowired
        public CustomerController(CustomerService customerService) {
            this.customerService = customerService;
        }

        @PostMapping("/add")
        public Customer addCustomer(@RequestBody Customer customer){
            return customerService.addCustomer(customer);
        }

        @GetMapping("/get")
        public List<Customer> getAllCustomers(){
            return customerService.getAllCustomers();
        }


}


package org.sid.billingservice.web;

import org.sid.billingservice.entities.Bill;
import org.sid.billingservice.feign.CustomerRestClient;
import org.sid.billingservice.feign.ProductItemRestClient;
import org.sid.billingservice.model.Customer;
import org.sid.billingservice.model.Product;
import org.sid.billingservice.repository.BillRepository;
import org.sid.billingservice.repository.ProductItemRepsitory;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingRestController {
   private BillRepository billRepository;
   private ProductItemRepsitory productItemRepsitory;
   private CustomerRestClient customerRestClient;
   private ProductItemRestClient productItemRestClient;

    public BillingRestController(BillRepository billRepository, ProductItemRepsitory productItemRepsitory, CustomerRestClient customerRestClient, ProductItemRestClient productItemRestClient) {
        this.billRepository = billRepository;
        this.productItemRepsitory = productItemRepsitory;
        this.customerRestClient = customerRestClient;
        this.productItemRestClient = productItemRestClient;
    }
/*Recuperer la facture a partir de la base de donnee*/
    @GetMapping(path ="/fullBill/{id}" )
    public Bill getBill(@PathVariable (name = "id" )Long id ) {
    Bill bill=billRepository.findById(id).get();
    Customer customer=customerRestClient.getCustomerById(bill.getCustomerID());
    bill.setCustomer(customer);
       bill.getProductItems().forEach(pi->{
           Product product=productItemRestClient.getProductById(pi.getProductID());
           ///pi.setProduct(product);
pi.setProductName(product.getName());
               }
               );
        return  bill;
    }
}

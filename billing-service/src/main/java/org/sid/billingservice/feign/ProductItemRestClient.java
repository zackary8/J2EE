package org.sid.billingservice.feign;

import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "PRODUCTS-SERVICE")
public interface ProductItemRestClient {
    /*Pagination */
    @GetMapping(path = "/products")
    PagedModel<Product> pageProducts();
/*Recuppurer un produit */
    @GetMapping(path ="/products/{id}")
    Product getProductById (@PathVariable Long id);
}

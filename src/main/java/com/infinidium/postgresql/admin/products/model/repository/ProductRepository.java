package com.infinidium.postgresql.admin.products.model.repository;

import com.infinidium.postgresql.admin.products.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
    // SELECT * FROM PRODUCTS WHERE PRICE > ?;
    List<Product> findByPriceGreaterThan(Double limit);

    // SELECT * FROM PRODUCTS WHERE PRICE >= ?;
    List<Product> findByPriceGreaterThanEqual(Double limit);
}

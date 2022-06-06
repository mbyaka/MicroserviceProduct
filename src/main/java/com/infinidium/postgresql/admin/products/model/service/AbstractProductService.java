package com.infinidium.postgresql.admin.products.model.service;

import com.infinidium.postgresql.admin.products.model.entity.Product;
import com.infinidium.postgresql.admin.products.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractProductService implements EntityService<Product, Integer>
{
    @Autowired
    protected ProductRepository repository;

    protected abstract List<Product> findByPriceGreaterThan(Double limit);

    protected abstract List<Product> findByPriceGreaterThanEqual(Double limit);
}

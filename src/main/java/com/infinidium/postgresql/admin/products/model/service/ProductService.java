package com.infinidium.postgresql.admin.products.model.service;

import com.infinidium.postgresql.admin.products.model.entity.Product;
import com.infinidium.postgresql.admin.products.utility.ExceptionMessageType;
import com.infinidium.postgresql.admin.products.utility.Util;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends AbstractProductService
{
    @Override
    protected List<Product> findByPriceGreaterThan(Double limit)
    {
        return repository.findByPriceGreaterThan(limit);
    }

    @Override
    protected List<Product> findByPriceGreaterThanEqual(Double limit)
    {
        return repository.findByPriceGreaterThanEqual(limit);
    }

    @Override
    public Product findByID(Integer id)
    {
        try
        {
            return repository.findById(id)
                    .orElseThrow( () -> new RuntimeException(ExceptionMessageType.FIND_BY_ID.getValue() ) );
        }
        catch (RuntimeException e)
        {
            Util.showExceptionMessage(e);
            return null;
        }
    }

    @Override
    public List<Product> getAll()
    {
        return repository.findAll();
    }

    @Override
    public Product save(Product entity)
    {
        try
        {
            return repository.save(entity);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionMessage(e);
            return null;
        }
    }

    @Override
    public void deleteByID(Integer id)
    {
        try
        {
            repository.deleteById(id);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionMessage(e);
        }
    }
}

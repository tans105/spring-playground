package com.tanmay.product.dao.impl;

import com.tanmay.product.dao.ProductDao;
import com.tanmay.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Product product) {
        Integer result = (Integer) hibernateTemplate.save(product);
        return result;
    }

    @Override
    @Transactional
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    public Product read(int id) {
        return hibernateTemplate.get(Product.class, id);
    }

    @Override
    public List<Product> read() {
        return hibernateTemplate.loadAll(Product.class);
    }
}

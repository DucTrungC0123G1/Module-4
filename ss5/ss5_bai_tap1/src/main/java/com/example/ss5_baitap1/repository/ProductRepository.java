package com.example.ss5_baitap1.repository;

import com.example.ss5_baitap1.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> display() {
        TypedQuery<Product> typedQuery = entityManager.createQuery("from Product", Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public Product findById(int id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    @Transactional
    @Override
    public void save(Product product) {
        try {
            entityManager.persist(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Transactional
    @Override
    public void remove(int id) {
        Product product = findById(id);
        entityManager.remove(product);
    }

    @Transactional
    @Override
    public void update(int id, Product product) {
        Product product1 = findById(id);
        product1.setName(product.getName());
        product1.setPrice(product.getPrice());
        product1.setDescription(product.getDescription());
        product1.setProducer(product.getProducer());
        entityManager.merge(product1);
    }

    @Override
    public List<Product> search(String keyWord) {
        keyWord = "%"+keyWord+"%";
        TypedQuery<Product> typedQuery = entityManager.createQuery("select s from Product s where s.name like: keyWord", Product.class);
              typedQuery.setParameter("keyWord",keyWord);
        return typedQuery.getResultList();
    }


}

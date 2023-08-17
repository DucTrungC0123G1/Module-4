package com.example.ss4_baitap1.repository;

import com.example.ss4_baitap1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository{
    private static List<Product> productList = new ArrayList<>();
    static {
    productList.add(new Product(1,"Dell",20000,"Máy Ngon","DellCompany"));
    productList.add(new Product(2,"Asus",30000,"Máy Ok","AsusCompany"));
    productList.add(new Product(3,"Acer",40000,"Máy BT","AcerCompany"));
    productList.add(new Product(4,"HP",50000,"Máy Tốt","HPCompany"));
    }

    @Override
    public List<Product> display() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        for (Product c: productList) {
            if (c.getId()==id)
                return c;
        }
        return null;
    }

    @Override
    public void save(Product product) {
    productList.add(product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        productList.add(id,product);
    }

}

package com.example.ss2_bai1.repository;

import com.example.ss2_bai1.model.Condiment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CondimentRepository implements ICondimentRepository {

    private static List<Condiment> condimentList = new ArrayList<>();
    static {
    condimentList.add(new Condiment(1,"Lettuce"));
    condimentList.add(new Condiment(2,"Tomato"));
    condimentList.add(new Condiment(3,"Mustard"));
    condimentList.add(new Condiment(4,"Sprouts"));
    }

    @Override
    public List<Condiment> display() {
        return condimentList;
    }
}

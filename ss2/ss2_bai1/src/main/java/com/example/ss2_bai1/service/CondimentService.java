package com.example.ss2_bai1.service;

import com.example.ss2_bai1.model.Condiment;
import com.example.ss2_bai1.repository.ICondimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondimentService implements ICondimentService{
    @Autowired
    private ICondimentRepository condimentRepository;
    @Override
    public List<Condiment> display() {
        return condimentRepository.display();
    }
}

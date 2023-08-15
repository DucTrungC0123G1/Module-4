package com.example.ss2_bai2.service;

import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multi(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double div(double num1, double num2) {
        return num1/num2;
    }
}

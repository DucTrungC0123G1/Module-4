package com.example.s1.service;

import org.springframework.stereotype.Service;

@Service
public class ConvertMoneyService implements IConvertMoneyService {
    @Override
    public double convertMoney(double usd, double rate) {
        return usd*rate;
    }
}

package com.example.s1_bai2.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository{
    private static Map<String,String> stringMap = new HashMap<>();
    static {
        stringMap.put("blue","xanh da trời");
        stringMap.put("yellow","vàng");
        stringMap.put("red","đỏ");
        stringMap.put("green","xanh lá cây");
        stringMap.put("banana","chuối");
        stringMap.put("school","trường học");
    }
    @Override
    public String convertVietNamese(String english) {
        return stringMap.get(english);
    }
}

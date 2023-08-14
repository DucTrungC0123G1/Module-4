package com.example.s1_bai2.service;

import com.example.s1_bai2.repository.IDictionaryRepository;
import org.springframework.beans.factory.access.el.SpringBeanELResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService{
    @Autowired
    private IDictionaryRepository dictionaryRepository;
    @Override
    public String convert(String english) {
        String vietnamese = dictionaryRepository.convertVietNamese(english);
        if (vietnamese!=null){
            return vietnamese;
        }
        return "Không có trong từ điển";
    }
}

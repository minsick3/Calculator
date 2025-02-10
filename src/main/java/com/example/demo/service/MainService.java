package com.example.demo.service;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public int sum(int a, int b){
        return a+b;
    }
}

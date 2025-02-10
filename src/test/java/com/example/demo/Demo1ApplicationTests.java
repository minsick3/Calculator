package com.example.demo;

import com.example.demo.service.MainService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Demo1ApplicationTests {
    MainService mainService=new MainService();

    @Test
    void contextLoads(){
        assertEquals(3,mainService.sum(1,2));
    }

}

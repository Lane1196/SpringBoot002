package com.controller;

import com.util.Randoms;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        System.out.println(System.getProperties());
        for (int i = 0; i < 10; i++) {
            // int nextInt = r.nextInt(5) + 10;
            int nextInt = Randoms.getInt(5, 10);
            System.out.println(i + "-->" + nextInt);
        }
    }
}

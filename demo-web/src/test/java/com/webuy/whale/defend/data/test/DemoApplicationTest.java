package com.webuy.whale.defend.data.test;

import com.example.demo.DemoApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@Rollback
class DemoApplicationTest {

    /**
     * 测试执行开始时间
     */
    private long executeStart = 0;

    @Before
    public void before() {
        System.out.println("测试执行开始");
        executeStart = System.currentTimeMillis();
    }


    @Test
    public void test() {
        System.out.println("单测测试");
    }

    @After
    public void after() {
        System.out.println("测试执行完成，执行时间：" + (System.currentTimeMillis() - executeStart) / 1000.0 + "s");
    }


}

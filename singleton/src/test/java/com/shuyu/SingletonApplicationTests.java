package com.shuyu;

import com.shuyu.singleton.Singleton1;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SingletonApplicationTests {

	@Test
	public void contextLoads() {
		Singleton1 singleton1=Singleton1.getInstance();
		Singleton1 singleton2=Singleton1.getInstance();
		if (singleton1==singleton2){
             log.info("两个对象时相同的实例");
		}
	}

}

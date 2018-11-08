package com.shuyu;

import com.shuyu.strategy.Context;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyApplicationTests {

	@Test
	public void contextLoads() {
		Context context=new Context("add");

		System.out.println(context.operation(10,5));
	}

}

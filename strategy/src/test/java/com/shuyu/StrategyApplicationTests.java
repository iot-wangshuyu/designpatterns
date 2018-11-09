package com.shuyu;

import com.shuyu.strategy.Context;
import com.shuyu.strategy.OperationAdd;
import com.shuyu.strategy.OperationSub;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyApplicationTests {

	@Test
	public void contextLoads() {
		Context context=new Context(new OperationAdd());
		System.out.println(context.operation(10,5));
		context=new Context(new OperationSub());
		System.out.println(context.operation(10,5));
	}

}

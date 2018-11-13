package com.shuyu;

import com.shuyu.factory.AddFactory;
import com.shuyu.factory.IFactory;
import com.shuyu.operation.Operation;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FactoryApplicationTests {

	@Test
	public void contextLoads() {

		IFactory factory=new AddFactory();
		Operation operation=factory.createOperation();
		log.info("执行结果==="+operation.getResult(10,2));
	}

}

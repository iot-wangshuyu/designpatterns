package com.shuyu;

import com.shuyu.factory.OpreationFactory;
import com.shuyu.operation.Operation;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SimplefactoryApplicationTests {


    
    /**
     * @author:shuyu.wang
     * @description:简单工厂模式
     * @date: 2018/11/7 14:42
     * @param: 
    */
	@Test
	public void contextLoads() {
		Operation operation= OpreationFactory.createOperate("+");
		operation.setNumberA(1);
		operation.setNumberB(4);
		log.info("执行结果"+operation.getResult());
	}

}

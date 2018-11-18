package com.shuyu;

import com.shuyu.facade.Facede;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeApplicationTests {

	@Test
	public void contextLoads() {
		Facede facede=new Facede();
		facede.methodA();
		facede.methodB();
	}

}

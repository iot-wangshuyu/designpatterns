package com.shuyu;

import com.shuyu.template.AbstractClass;
import com.shuyu.template.ConcreteClass;
import com.shuyu.template.ConcreteClass2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateApplicationTests {

	@Test
	public void contextLoads() {

		AbstractClass abstractClass=new ConcreteClass();
		abstractClass.templateMethod();

		abstractClass=new ConcreteClass2();
		abstractClass.templateMethod();
	}

}

package com.shuyu;

import com.shuyu.builder.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderApplicationTests {

	@Test
	public void contextLoads() {
		Director director=new Director();
		Builder builder=new ConcreteBuilder1();
		Builder builder1=new ConcreteBuilder2();

		director.construct(builder);

		Product product=builder.getResult();
		product.show();

		director.construct(builder1);
		Product product1=builder1.getResult();
		product1.show();
	}

}

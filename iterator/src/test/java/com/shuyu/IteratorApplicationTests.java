package com.shuyu;

import com.shuyu.iterator.ConcreteAggregate;
import com.shuyu.iterator.ConcreteIterator;
import com.shuyu.iterator.Iterator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class IteratorApplicationTests {

	@Test
	public void contextLoads() {

		ConcreteAggregate concreteAggregate=new ConcreteAggregate();
		concreteAggregate.addArrayList("name1");
		concreteAggregate.addArrayList("name2");
		concreteAggregate.addArrayList("name3");
		concreteAggregate.addArrayList("name4");

		Iterator iterator=new ConcreteIterator(concreteAggregate);
		Object frist=iterator.first();

		while (!iterator.isDone()){
              log.info("到你了："+iterator.getCurrentItem());
              iterator.next();
		}
	}

}

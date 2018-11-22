package com.shuyu;

import com.shuyu.publish.ConcreteObserver;
import com.shuyu.publish.ConcreteSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PublishApplicationTests {

	@Test
	public void contextLoads() {
		ConcreteSubject subject=new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject,"X"));
		subject.attach(new ConcreteObserver(subject,"Y"));
		subject.attach(new ConcreteObserver(subject,"Z"));

		subject.setSubjectState("ABC");

		subject.notifyA();
	}

}

package com.shuyu;

import com.shuyu.memento.Caretaker;
import com.shuyu.memento.Originator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MementoApplicationTests {

	@Test
	public void contextLoads() {

		Originator originator=new Originator();

		originator.setState("ON");
		originator.show();

		Caretaker c=new Caretaker();
		c.setMemento(originator.createMemento());
		originator.setState("off");
		originator.show();

		originator.setMemento(c.getMemento());
		originator.show();
	}

}

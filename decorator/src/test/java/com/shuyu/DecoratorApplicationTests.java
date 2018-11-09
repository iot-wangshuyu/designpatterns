package com.shuyu;

import com.shuyu.decorator.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DecoratorApplicationTests {

	@Test
	public void contextLoads() {
		Person person=new Person("小菜");
		log.info("第一种打扮");
		Sneakers sneakers=new Sneakers();
		BigTrouser bigTrouser=new BigTrouser();
		TShirts tShirts=new TShirts();
		sneakers.Decorate(person);
		bigTrouser.Decorate(sneakers);
		tShirts.Decorate(bigTrouser);
		tShirts.Show();

		log.info("第二种打扮");
		LeatherShoes leatherShoes=new LeatherShoes();
		TShirts tShirts1=new TShirts();
		leatherShoes.Decorate(person);
		tShirts1.Decorate(leatherShoes);
		tShirts1.Show();
	}

}

package com.shuyu;

import com.shuyu.commadn.Broker;
import com.shuyu.commadn.BuyStock;
import com.shuyu.commadn.SellStock;
import com.shuyu.commadn.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandApplicationTests {

	@Test
	public void contextLoads() {

		Stock stock=new Stock();

		BuyStock buyStock=new BuyStock(stock);
		SellStock sellStock=new SellStock(stock);
		Broker broker=new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);

		broker.placeOrders();
	}

}

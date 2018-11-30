package com.shuyu;

import com.shuyu.bridge.Circle;
import com.shuyu.bridge.GreenCircle;
import com.shuyu.bridge.RedCircle;
import com.shuyu.bridge.Shape;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BridgeApplicationTests {

	@Test
	public void contextLoads() {
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
		Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}

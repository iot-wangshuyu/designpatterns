package com.shuyu.commadn;

import java.util.ArrayList;
import java.util.List;

/**
 * @package:com.shuyu.commadn
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-11-30 22:53
 * @version:V1.0
 **/

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order o : orderList) {
            o.execute();
        }
        orderList.clear();
    }
}

package com.shuyu.commadn;

/**
 * @package:com.shuyu.commadn
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-11-30 22:48
 * @version:V1.0
 **/

public class BuyStock implements Order{

    private Stock stock;

    public BuyStock(Stock stock){
        this.stock=stock;
    }
    @Override
    public void execute() {
        stock.buy();
    }
}

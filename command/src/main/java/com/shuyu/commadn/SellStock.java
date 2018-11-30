package com.shuyu.commadn;

/**
 * @package:com.shuyu.commadn
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-11-30 22:52
 * @version:V1.0
 **/

public class SellStock implements Order{

    private Stock stock;
    public SellStock(Stock stock){
        this.stock=stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}

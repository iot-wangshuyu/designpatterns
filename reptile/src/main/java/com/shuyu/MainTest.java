package com.shuyu;

import com.shuyu.main.MyCrawler;
import com.shuyu.main.MyCrawlerDetail;
import com.shuyu.main.MyCrawlerListUrl;

import java.util.List;

/**
 * @package:com.shuyu
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-03-29 16:17
 * @version:V1.0
 * @NOTICE：本内容仅限于新疆感知科技有限公司内部传阅,禁止外泄以及用于其他的商业目
 * @ Copyright © 2017-ganinfo. All rights reserved.
 **/

public class MainTest {

    public static void main(String[] args) {
        MyCrawler crawler = new MyCrawler();
        String str[] = new String[]{"https://maoyan.com/films?showType=1","https://maoyan.com/films?showType=1&offset=30"};
        MyCrawlerListUrl myCrawlerListUrl = new MyCrawlerListUrl();
        crawler.crawling(str);
        System.out.println("列表读取完成");
        for (int i = 0; i < str.length; i++) {
            List<String> crawling = myCrawlerListUrl.crawling(str[i]);
            String[] strs1 = crawling.toArray(new String[crawling.size()]);
            MyCrawlerDetail.test(strs1);
            System.out.println("第"+(i+1)+"页爬取完成");
            try {
                Thread.sleep(50000);
            }catch (Exception e){

            }

        }


    }
}

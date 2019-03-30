package com.shuyu.main;

import com.shuyu.link.LinkFilter;
import com.shuyu.link.Links;
import com.shuyu.page.Page;
import com.shuyu.page.PageParserTool;
import com.shuyu.page.RequestAndResponseTool;
import com.shuyu.util.GsonUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

public class MyCrawlerListUrl {

    /**
     * 使用种子初始化 URL 队列
     *
     * @param seeds 种子 URL
     * @return
     */
    private void initCrawlerWithSeeds(String seeds) {
        Links.addUnvisitedUrlQueue(seeds);
    }


    /**
     * 抓取过程
     *
     * @param seeds
     * @return
     */
    public List<String> crawling(String seeds) {


        List<String> list = new ArrayList<String>();
        //初始化 URL 队列
        initCrawlerWithSeeds(seeds);

        //定义过滤器，提取以 http://www.baidu.com 开头的链接
        LinkFilter filter = new LinkFilter() {
            public boolean accept(String url) {
                if (url.startsWith("https://maoyan.com/")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        //循环条件：待抓取的链接不空且抓取的网页不多于 1000
        while (!Links.unVisitedUrlQueueIsEmpty() && Links.getVisitedUrlNum() <= 1000) {
            //先从待访问的序列中取出第一个；
            String visitUrl = (String) Links.removeHeadOfUnVisitedUrlQueue();
            if (visitUrl == null) {
                continue;
            }

            //根据URL得到page;
            Page page = RequestAndResponseTool.sendRequstAndGetResponse(visitUrl);

            //对page进行处理： 访问DOM的某个标签
            Elements es = PageParserTool.select(page, "a");
            if (!es.isEmpty()) {
                Iterator it2 = es.iterator();
                while (it2.hasNext()) {
                    Element element2 = (Element) it2.next();
                    Elements img = element2.getElementsByTag("a");
                    for (Element ele : img) {
                        //获取每个img标签URL "abs:"表示绝对路径
                        String url = ele.attr("abs:href");
                        // 打印URL
                        if (url != null && url.length() > 0) {
                            if (!url.contains("?") && !url.contains("#") && url.startsWith("https://maoyan.com/films/")) {
                                list.add(url);
                            }
                        }
                    }
                }
            }

        }
        return list;
    }

    public static void writeTxt(String path, String info) {
        try {
            File f = new File(path);
            FileOutputStream fos1 = new FileOutputStream(f);
            OutputStreamWriter dos1 = new OutputStreamWriter(fos1);
            dos1.write(info);
            dos1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //main 方法入口
    public static void main(String[] args) {
        MyCrawlerListUrl crawler = new MyCrawlerListUrl();
        String str[] = new String[]{"https://maoyan.com/films?showType=1"};
        for (int i = 0; i < str.length; i++) {
            crawler.crawling(str[i]);
        }
    }
}

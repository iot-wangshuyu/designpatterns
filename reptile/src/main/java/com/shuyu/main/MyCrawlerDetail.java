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

public class MyCrawlerDetail {

    /**
     * 使用种子初始化 URL 队列
     *
     * @param seeds 种子 URL
     * @return
     */
    private static void initCrawlerWithSeeds(String seeds) {
        Links.addUnvisitedUrlQueue(seeds);
    }


    /**
     * 抓取过程
     *
     * @param seeds
     * @return
     */
    public static void crawling(String seeds) {

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
        Map<String, Object> map = new HashMap<String, Object>();

        //循环条件：待抓取的链接不空且抓取的网页不多于 1000
        while (!Links.unVisitedUrlQueueIsEmpty() && Links.getVisitedUrlNum() <= 1000) {

            //先从待访问的序列中取出第一个；
            String visitUrl = (String) Links.removeHeadOfUnVisitedUrlQueue();
            if (visitUrl == null) {
                continue;
            }
            //根据URL得到page;
            Page page = RequestAndResponseTool.sendRequstAndGetResponse(visitUrl);

            //中文名称
            Elements es1 = PageParserTool.select(page, "h3.name");
            if (!es1.isEmpty()) {
                map.put("name", es1.get(0).text());
            }
            //英文文名称
            Elements es3 = PageParserTool.select(page, "div.ename");
            if (!es3.isEmpty()) {
                map.put("ename", es3.get(0).text());
            }
            //剧情简介
            Elements es2 = PageParserTool.select(page, "div.mod-content");
            if (!es2.isEmpty()) {
                map.put("content", es2.get(0).text());
            }

            //国家、国家、上映时间
            Elements es4 = PageParserTool.select(page, "li.ellipsis");
            if (!es4.isEmpty()) {
                map.put("kind", es4.get(0).text());
                map.put("location", es4.get(1).text());
                map.put("time", es4.get(2).text());
            }

            //演员
            Elements es5 = PageParserTool.select(page, "ul.celebrity-list");
            if (!es5.isEmpty()) {
                List<Map<String, Object>> actorList = new ArrayList<Map<String, Object>>();
                Element element = (Element) es5.get(1);
                Elements name = element.select("li.celebrity");
                if (!name.isEmpty()) {
                    Iterator it2 = name.iterator();
                    while (it2.hasNext()) {
                        Element element2 = (Element) it2.next();
                        String[] s = element2.text().split(" ");
                        Map<String, Object> mapD = new HashMap<String, Object>();
                        for (int i = 0; i < s.length; i++) {
                            if (i == 0) {
                                mapD.put("name", s[0]);
                            }
                            if (i == 1) {
                                mapD.put("role", s[1]);
                            }
                        }


                        Elements img = element2.getElementsByTag("img");
                        for (Element ele : img) {
                            //获取每个img标签URL "abs:"表示绝对路径
                            String imgSrc = ele.attr("abs:data-src");
                            // 打印URL
                            if (imgSrc != null && imgSrc.length() > 0) {
                                mapD.put("pic", imgSrc);
                            }
                        }
                        actorList.add(mapD);
                    }
                    map.put("actors", actorList);
                }
            }

            //奖项
            Elements es6 = PageParserTool.select(page, "ul.award-list");
            if (!es6.isEmpty()) {
                Map<String, Object> mapD = new HashMap<String, Object>();
                String[] strs = es6.text().split(" ");
                mapD.put("award", strs[0]);
                Elements name = es6.get(0).select("div.content");
                if (!name.isEmpty()) {
                    mapD.put("content", name.text());
                }
                map.put("module", mapD);
            }

            //图集
            Elements es7 = PageParserTool.select(page, "div.album");
            if (!es7.isEmpty()) {
                Iterator it2 = es7.iterator();
                List<String> list = new ArrayList<String>();
                while (it2.hasNext()) {
                    Element element2 = (Element) it2.next();
                    Map<String, Object> mapD = new HashMap<String, Object>();
                    Elements img = element2.getElementsByTag("img");
                    for (Element ele : img) {
                        //获取每个img标签URL "abs:"表示绝对路径
                        String imgSrc = ele.attr("abs:data-src");
                        // 打印URL
                        if (imgSrc != null && imgSrc.length() > 0) {
                            list.add(imgSrc);
                        }
                    }
                }
                map.put("pics", list);
            }

        }
        writeTxt("C:\\Users\\wang_\\Desktop\\爬虫\\" + map.get("name") + ".txt", GsonUtil.GsonString(map));
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
        MyCrawlerDetail crawler = new MyCrawlerDetail();
        String str[] = new String[]{"https://maoyan.com/films/410629", "https://maoyan.com/films/1218091", "https://maoyan.com/films/1206605", "https://maoyan.com/films/1229799", "https://maoyan.com/films/247295"};
        for (int i = 0; i < str.length; i++) {
//            crawler.crawling(str[i]);
        }

    }

    public static void test(String[] args) {
        for (int i = 0; i < args.length; i++) {
            crawling(args[i]);
        }

    }
}

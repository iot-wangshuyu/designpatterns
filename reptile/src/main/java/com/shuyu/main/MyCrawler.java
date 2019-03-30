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

public class MyCrawler {

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
    public void crawling(String[] seeds) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (int j = 0; j < seeds.length; j++) {
            //初始化 URL 队列
            initCrawlerWithSeeds(seeds[j]);

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
//            Elements es = PageParserTool.select(page, "a");
//            if (!es.isEmpty()) {
//                System.out.println("下面将打印所有a标签： ");
//                System.out.println(es);
//            }
                //猫眼列表
                Elements es2 = PageParserTool.select(page, "dd");
                if (!es2.isEmpty()) {
                    //获取迭代器
                    Iterator it = es2.iterator();

                    while (it.hasNext()) {
                        Map<String, Object> map = new HashMap<String, Object>();
                        Element element = (Element) it.next();
                        String str = element.text();
                        String[] s = str.split(" ");
                        if (s.length == 3) {
                            for (int i = 1; i < s.length; i++) {

                                if (i == 1) {
                                    map.put("title", s[1]);
                                }
                                if (i == 2) {
                                    map.put("score", s[2]);
                                }
                            }
                        }
                        if (s.length == 2) {
                            for (int i = 0; i < s.length; i++) {

                                if (i == 0) {
                                    map.put("title", s[0]);
                                }
                                if (i == 1) {
                                    map.put("score", s[1]);
                                }
                            }
                        }


                        Elements img = element.getElementsByTag("img");
                        for (Element ele : img) {
                            //获取每个img标签URL "abs:"表示绝对路径
                            String imgSrc = ele.attr("abs:data-src");
                            // 打印URL
                            if (imgSrc != null && imgSrc.length() > 0) {
                                map.put("img", imgSrc);
                            }
                        }
                        list.add(map);
                    }

                }
        }



            //将保存文件
//            FileTool.saveToLocal(page);

            //将已经访问过的链接放入已访问的链接中；
//            Links.addVisitedUrlSet(visitUrl);

            //得到超链接
//            Set<String> links = PageParserTool.getLinks(page, "img");
//            for (String link : links) {
//                Links.addUnvisitedUrlQueue(link);
//                System.out.println("新增爬取路径: " + link);
//            }
        }
        writeTxt("C:\\Users\\wang_\\Desktop\\爬虫\\list.txt", GsonUtil.GsonString(list));
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
        MyCrawler crawler = new MyCrawler();
        String str[] = new String[]{"https://maoyan.com/films?showType=1"};
//        for (int i = 0; i < str.length; i++) {
//            crawler.crawling(str[i]);
//        }
    }
}

package com.reno.ttest;

/**
 * Created by qxl19 on 2018/5/13.
 */
public class RootPathTest {
    public static void main(String[] args) {
       String pp=  "/E:/apache-tomcat-8.5.31/webapps/SpringMVCTemplate/WEB-INF/classes/";
        System.out.println( pp.substring(1, pp.length() - 16));
    }
}

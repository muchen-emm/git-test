package com.muchen.git;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git");
        System.out.println("hello git2");
        System.out.println("hello git hot-fix");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("错误：SSL certificate problem: unable to get local issuer certificate\n" +
                "解决：git取消代理\n" +
                "git config --global http.sslVerify false");
    }
}
package com.qfedu.jedis;

import redis.clients.jedis.Jedis;

public class App {
    public static void main(String[] args) {
        //创建jedis对象
        Jedis jedis = new Jedis("49.232.23.242",6379);
        //如果没有在配置文件中设置密码，不使用该方法
        //jedis.auth("redis的密码")


        //根据key值获取字符串类型内容
        String name = jedis.get("name");
        System.out.println(name);

        //设置值
//        jedis.set("hobby","敲代码");
//        System.out.println(jedis.get("hobby"));

        String name1 = jedis.hget("hh", "name");
        System.out.println(name1);

        //关闭
        jedis.close();
    }
}

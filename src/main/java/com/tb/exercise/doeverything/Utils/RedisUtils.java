package com.tb.exercise.doeverything.Utils;


import com.tb.exercise.doeverything.Config.JedisConnect;
import redis.clients.jedis.Jedis;

/**
 * 描述：redis操作工具栏
 *
 * @author: TanBoQiuYun
 * @date: 2019/10/24 15:55
 */

public class RedisUtils {

    /**
     * 对字符串的操作-设置key的值为value
     * @param key
     * @param value
     */
    public static String set(String key,String value){
        Jedis jedis = JedisConnect.getJedis();
        String set = jedis.set(key, value);
        return set;
    }

//    public static String setObject(String key,Object value){
//        Jedis jedis = JedisConnect.getJedis();
//        String set = jedis.set(key,value);
//        return set;
//    }

    /**
     * 对字符串的操作-通过key获取值
     * @param key
     * @return
     */
    public static String get(String key){
        Jedis jedis = JedisConnect.getJedis();
        String s = jedis.get(key);
        return s;
    }

    /**
     * 通过key向list头部添加字符串
     * @param key
     * @param value 可以是一个string 也可以是string数组
     * @return
     */
    public static Long setList(String key,String...value){
        Jedis jedis = JedisConnect.getJedis();
        Long lpush = jedis.lpush(key, value);
        return lpush;
    }
}

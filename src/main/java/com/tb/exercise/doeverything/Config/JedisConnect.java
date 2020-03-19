package com.tb.exercise.doeverything.Config;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 描述：
 *
 * @author: TanBoQiuYun
 * @date: 2019/10/24 16:57
 */
public class JedisConnect {
    private static JedisPool pool;
    private static final  String HOST = "127.0.0.1";
    private static final Integer PORT = 6379;

    static {
        //连接池配置
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //最大连接数, 默认8个
        jedisPoolConfig.setMaxTotal(5);
        //最大空闲连接数, 控制一个pool最多有多少个状态为idle(空闲)的jedis实例；
        jedisPoolConfig.setMaxIdle(1);
        //获取jedis连接池
        pool = new JedisPool(jedisPoolConfig,HOST,PORT);
    }

    /**
     * 获取jedis连接对象
     */
    public static Jedis getJedis(){
        Jedis jedis = pool.getResource();
        jedis.auth("foobared");
        return jedis;
    }

    /**
     * 关闭jedis连接
     */
    public static void closeJedis(Jedis jedis){
        if (jedis != null){
            jedis.close();
        }

    }
}

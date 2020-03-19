package com.tb.exercise.doeverything.RedisController;

import com.tb.exercise.doeverything.Pojo.Student;
import com.tb.exercise.doeverything.Utils.RedisUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：关于redis的相关操作
 *
 * @author: TanBoQiuYun
 * @date: 2019/10/24 11:35
 */
@Controller
@RequestMapping("/redis")
public class RedisCRUD {

    @RequestMapping("/setStr")
    public String setStr(){
        return RedisUtils.set("fdfdfdf","ddddd");
    }

    @RequestMapping("/setObject")
    public String setObject(){
        Student student = new Student();
        student.setName("tb");
        student.setAge(20);
        return RedisUtils.set("fdfdfdf","ddddd");
    }

    @RequestMapping("/getStr")
    public String getStr(){
        return RedisUtils.get("dfdfdf");
    }

    @RequestMapping("/setListStr")
    public Long setListStr(){
        String[] test = {"1","2","3"};
        return RedisUtils.setList("setListStr",test);
    }

}

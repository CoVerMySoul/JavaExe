package com.tb.exercise.doeverything.Test.Json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @Description: 关于Json
 * @Author: TanBoQiuYun
 * @Date: 2019/11/27 10:39
 */
public class AboutJson {
  JSONArray jsonArray = new JSONArray();
  JSONObject object = new JSONObject();

  public static void main(String[] args) {
    String data = "[\"HDC-50\", \"HDC-55\", \"HDC-55-2\"]";
    JSONArray objects = JSONArray.parseArray(data);
    System.out.println(objects);
  }
}

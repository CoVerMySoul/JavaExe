package com.example.javabasic.javabasic.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//用来描述当前这个注解可以放在哪些地方
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
//描述当前这个注解是存在什么作用域中的
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
  //注解的方法要求必须有返回则，void会报错
//  public abstract void test();

  String value() default "tanbo";
}

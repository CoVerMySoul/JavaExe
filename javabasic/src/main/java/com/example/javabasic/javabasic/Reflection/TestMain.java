package com.example.javabasic.javabasic.Reflection;

import com.example.javabasic.javabasic.Pojo.Game;
import com.example.javabasic.javabasic.Pojo.Person;
import com.example.javabasic.javabasic.Pojo.Reflection;
import com.example.javabasic.javabasic.Pojo.Student;
import com.example.javabasic.javabasic.Pojo.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/27 16:24
 */
public class TestMain {

  public static void main(String[] args) {
//    test1();
//    test2();
//    test3();
//    test4();
    Game bean = (Game)TestMain.getBean("com.example.javabasic.javabasic.Pojo.Game");
    System.out.println(bean);
  }


  /**
   * 设计一个方法，给定一个字符串，返回一个对象
   * 设计一个方法，控制对象的创建,同时将对象里面的所有属性赋值
   * 这种思想是IOC
   * @param className  类全名
   * @return
   */
  public static Object getBean(String className) {
    Object obj = null;
    try {
      //获取对应的类
      Class<?> classzz = Class.forName(className);
      //创建对象
       obj = classzz.newInstance();
       //在这里做一个自动DI注入，对象中的所有属性赋值

      //1、通过clazz找到类中的所有私有属性
      Field[] fields = classzz.getDeclaredFields();
      for (Field field : fields){
        //获取属性名
        String fieldName = field.getName();
        //拼接字符串获取方法名
        String newStr = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

        //
        Method setMethod = classzz.getMethod(newStr, field.getType());
        //找到了方法执行，就可以了
        setMethod.invoke(obj,"1111");
      }


    } catch (Exception e) {
      e.printStackTrace();
    }
    return obj;
  }

  /**
   * 获取并操作类中的构造方法
   */
  private static void test4() {
    Class classzz = Reflection.class;
    try {
      Constructor constructor = classzz.getConstructor();
      Object data = constructor.newInstance();
      System.out.println(data);
    }catch (Exception e){
      System.out.println(e);
    }
  }

  /**
   * 获取并操作类中的方法
   * invoke方法
   */
  private static void test3(){
    Class classzz = Reflection.class;
    //获取所有的共有的方法（自己类+父类）
    Method[] methods = classzz.getMethods();
    try{
      Reflection reflection = (Reflection)classzz.newInstance();
      //方法名字，方法参数类型对应的Class(因为方法可能有重载)
      Method m = classzz.getMethod("eat", String.class);

      //获取方法的修饰符
      int modifiers = m.getModifiers();
      //获取返回值数据类型
      Class<?> returnType = m.getReturnType();
      //获取方法参数列表的类型
      Class<?>[] parameterTypes = m.getParameterTypes();
      //获取方法抛出的异常类型
      Class<?>[] exceptionTypes = m.getExceptionTypes();

      System.out.println(m);
      Object data = m.invoke(reflection, "谭博");
      System.out.println(data);
    }catch (Exception e){
      System.out.println(e);
    }
  }

  /**
   * Class类中的常用方法
   */
  private static void test2() {
    Class classzz = Reflection.class;
    /*
    获取类的修饰符（包含权限和特征）
    如果类中有权限和特征，则返回值就是求和
    每一个修饰符用一个整数表示
    从0开始——0 1 2 4 8 16 32 64 128 256
    1-public  2-private  4-protected
     */
    int modifiers = classzz.getModifiers();
    System.out.println("类的修饰符：" + modifiers);
  }

  /**
   * 获取Class的三种方式
   */
  private static void test1() {
    Class<Student> studentClass1 = Student.class;
    Student student = new Student("1", 20);
    Class<? extends Student> studentClass2 = student.getClass();
    System.out.println("第一种方式" + studentClass1);
    System.out.println("第二种方式" + studentClass2);

    try {
      Class<?> studentClass3 = Class.forName("com.example.javabasic.javabasic.Pojo.Student");
      System.out.println("第三种方式" + studentClass3);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

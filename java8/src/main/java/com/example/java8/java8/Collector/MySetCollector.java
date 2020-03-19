package com.example.java8.java8.Collector;


import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
import static java.util.stream.Collector.Characteristics.UNORDERED;

/**
 * @Description: 自定义收集器实现
 * 自定义Set集合的收集器
 * @Author: TanBoQiuYun
 * @Date: 2019/12/26 9:54
 */
public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>> {
  @Override
  public Supplier<Set<T>> supplier() {
    System.out.println("supplier invoked......");
//    return () -> new HashSet<>();
    return HashSet<T>::new;
  }

  @Override
  public BiConsumer<Set<T>, T> accumulator() {
    System.out.println("accumulator invoked.....");
//    return Set<T>::add;
//    return HashSet<T>::add;
    return (set, item) -> set.add(item);
  }

  @Override
  public BinaryOperator<Set<T>> combiner() {
    System.out.println("combiner invoked.....");
    return (set1, set2) -> {
      set1.addAll(set2);
      return set1;
    };
  }

  @Override
  public Function<Set<T>, Set<T>> finisher() {
    System.out.println("finisher invoked.....");
    return t -> t;
  }

  @Override
  public Set<Characteristics> characteristics() {
    System.out.println("characteristics invoked.....");
    return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH, UNORDERED));
  }


}

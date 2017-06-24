package com.h5wanbao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author scott
 * @Version 0.0.1
 * Date: 2017/6/24 15:23
 * ProjectName: java8
 *
 * 1.2 The equivalent example in Java 8, stream.filter() to filter a List,
 *
 * and collect() to convert a stream into a List.
 *
 */
public class NowJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("SpringBoot","SpringCloud","EventSourcing");

        List<String> result = lines.stream()                        // convert list to stream
            .filter(line -> !"EventSourcing".equals(line))          // we dont like EventSourcing
            .collect(Collectors.toList()) ;                         // collect the output and convert streams to a List
        result.forEach(System.out :: println);                      //output : SpringBoot,SpringCloud
    }


}

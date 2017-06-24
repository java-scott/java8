package com.h5wanbao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author scott
 * @Version 0.0.1
 * Date: 2017/6/24 15:07
 * ProjectName: java8
 *
 * Before Java 8, filter a List like this :
 *
 */
public class BeforeJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("SpringBoot","SpringCloud","EventSourcing");

        List<String> result = getFilterOutput(lines, "EventSourcing");

        for(String temp : result){
            System.out.println(temp); //output : SpringBoot, SpringCloud
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {

        List<String> result = new ArrayList<>();
        for(String line : lines){
            if(!"EventSourcing".equals(line)){ // we dont like EventSourcing
                result.add(line);
            }
        }
        return result;
    }


}

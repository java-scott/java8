package com.h5wanbao;

import java.util.Arrays;
import java.util.List;

/**
 * @author scott
 * @Version 0.0.1
 * Date: 2017/6/24 15:39
 * ProjectName: java8
 */
public class BeforeJava8Person {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
            new Person("Scott", 30),
            new Person("Jhoon", 20),
            new Person("Frank", 40)
        );

        Person result = getStudentByName(persons,"Jhoon");
        System.out.println(result);

    }

    private static Person getStudentByName(List<Person> persons, String name) {
        Person result = null;

        for (Person temp : persons){
            if(name.equals(temp.getName())){
                result = temp;
            }
        }
        return result;
    }

}

package cn.h5wanbao;

/**
 * Created by scott on 7/21/16.
 *
 * 利用Lamda表达式实现
 *
 */

interface MessageLamda {

    public void print(String str);

}

public class TestDemoLamda {

    public static void main(String[] args) {

        MessageLamda msgLa = (String s) -> System.out.println(s);

        msgLa.print("Hello World!");

    }


}

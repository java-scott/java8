package cn.h5wanbao;

/**
 * Created by scott on 7/20/16.
 *
 * 回顾一下匿名内部类
 *
 */


interface Message { //这是一个接口

    public void print(String str); //里面只有一个抽象方法

}

public class TestDemo {

    public static void main(String[] args) {

        Message mes = new Message() {

            public void print(String str) {

                System.out.println(str);

            }

        }; // 匿名内部类定义完成了

        mes.print("Hello World!");

    }


}

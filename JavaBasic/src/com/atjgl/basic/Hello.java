package com.atjgl.basic;

/**
 * @author 小亮
 **/
public class Hello {

    /**
     * 每个Java应用程序都会至少有一个String[] args参数的main方法。
     * 当一个类中有main方法，执行命令“java 类名”则会启动虚拟机执行该类中的main方法。
     * 由于JVM在运行这个Java应用程序的时候，首先会调用main方法，调用时不实例这个类的对象，而是通过类名直接调用因此需要市限制为public static。
     * 对于Java中的main方法，JVM有限制，不能有返回值，因此返回值类型为void。
     * main方法中还有一个输入参数，类型为String[]，这个也是java的规范，main()方法中必须有一个入参，类细必须String[]。
     * 至于字符串数组的名字，这个是可以自己设定的，根据习惯，这个字符串数组的名字一般和sun Java规范范例中main参数名保持一致，取名为args。
     * main()方法中字符串参数数组作用是接收命令行输入参数的，命令行的参数之间用空格隔开
     * main方法可以throw Exception
     */
    public static void main(String[] args) {
        // 这是梦开始的地方，学习Java时，敲下的第一行代码。
        // main()方法是Java应用程序的入口方法，也就是说，程序在运行的时候，第一个执行的方法就是main方法。

        System.out.println("Hello World");
        // Java源文件以.java为扩展名。源文件的基本组成部分是类。
    }
}

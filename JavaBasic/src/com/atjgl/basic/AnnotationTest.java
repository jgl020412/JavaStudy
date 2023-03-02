package com.atjgl.basic;

/**
 * @author 小亮
 * 这是文档注释，注释内容可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档。
 * 命令：javadoc -d 文件名 -xx -yy
 **/
public class AnnotationTest {
    /**
     * @param name
     * @return 返回值为name
     */
    public String testAnnotation(String name) {

        // 这时一个单行注释

        System.out.println("hello");

        /*
         * 这是多行注释
         * 对于单行和和多行注释，被注释的文字，不会被JVM（Java虚拟机）解释执行。
         * 多行注释里面不允许有多行注释嵌套。
         */

        return name;
    }
}

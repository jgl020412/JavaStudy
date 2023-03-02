package com.atjgl.basic;

/**
 * @author 小亮
 **/
public class VariableTest {
    /**
     * 所谓关键字就是被Java语言赋予了特殊含义，用作专门用途的字符串（单词），关键字中所有字母都为小写；
     * 例如：
     * 用于定义数据类型的关键字：class，interface，enum，byte，short，int，long，float，double，char，boolean，void；
     * 用于定义流程控制的关键字：if，else，switch，case，default，while，do，for，break，continue，return；
     * 用于定义访问权限修饰符的关键字：private，protected，public；
     * 用于定义类，函数，变量修饰符的关键字：abstract，final，static，synchronized；
     * 用于定义类与类之间关系的关键字：extends，implements；
     * 用于定义建立实例及引用实例，判断实例的关键字：new，this，super，instanceof；
     * 用于异常处理的关键字：try，catch，finally，throw，throws；
     * 用于包的关键字：package，import；
     * 其他修饰符关键字：native，strictfp，transient，volatile，assert；
     * Java对各种变量、方法和类等要素命名时使用的字符序列称为标识符，凡是自己可以起名字的地方都叫标识符；
     * 必须只由26个英文字母大小写、0-9数字、_或$组成，数字不可以开头，不可以使用关键字和保留字，但能包含关键字和保留字；
     * 包名一般都是小写字母组成的，而类名或接口名一般都是所有单词的首字母大写的，变量名、方法名一般第一个单词首字母大写，其他单词首字母大写，常量名则所有字母全是大写，多单词用下划线连接；
     * 保留字是指现有Java版本尚未使用，但以后版本可能会作为关键字使用，如：goto、const；
     */
    public void testVar() {

        /**
         * 变量是程序中最基本的存储单元，包含变量类型、变量名和存储的值。用于在内存中保存数据；
         * Java中每个变量必须先声明，后使用，使用变量名来访问区域的数据；
         * 变量的作用域其定义所在的一对号{}内，变量只有在其作用域内才有效，同一个作用域内，不能定义重名的变量；
         */

        // 声明变量： <数据类型> <变量名称>
        int intVar;

        // 变量的赋值： <变量名称> = <值>
        intVar = 10;

        // 声明和赋值变量： <数据类型> <变量名> = <初始化值>
        int var = 10;
    }
}

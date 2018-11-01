package com.dragon.jdk8.feature.unit1;

import java.util.Arrays;
import java.util.jar.Attributes;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/11/1 20:28
 * @Description
 */

interface Person {

    default String getName() {
        return "Lucky Dragon";
    }
}

interface Name {

    default String getName() {
        return "Lucky Dragon";
    }
}

/**
 * 如果实现的两个接口有一个同名且定义默认方法的时候
 * 那么这个类必须实现这个接口的这个同名方法
 */
class Student implements Person ,Name{
    @Override
    public String getName() {
        return null;
    }
}

/**
 *
 */
class Teacher implements Person{

}

public class defaultFunction {

    public static void main(String[] args) {
    }
}

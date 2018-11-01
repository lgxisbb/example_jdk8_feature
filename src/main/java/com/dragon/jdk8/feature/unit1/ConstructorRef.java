package com.dragon.jdk8.feature.unit1;

import java.util.ArrayList;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/11/1 13:03
 * @Description lambda 的构造器引用
 */

interface ConstructorRefObject{
    ConstructorRef generateConstructorRef(String name);
}

public class ConstructorRef {


    String name;

    public ConstructorRef() {
    }

    public ConstructorRef(String name) {
        this.name = name;
        System.out.println("Invoke -> ConstructorRef(String name) : "+name);
    }

    public void testConstructorRef(ConstructorRefObject ref){
        ConstructorRef an = ref.generateConstructorRef("any ");
        System.out.println(an.name);
    }


    public static void main(String[] args) {
        new ConstructorRef().testConstructorRef(ConstructorRef::new);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }


        list.forEach(System.out::print);
    }
}

package com.dragon.jdk8.feature.unit1;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/11/1 00:01
 * @Description ----------------------------------
 * 对象  :: 实例方法 {{@link FunctionRef#function1(String)}}
 * 类    :: 静态方法 {{@link FunctionRef#function(String)}}
 * 这两种方法引用, 等同于传递方法参数的lambda表达式
 * System.out::print = (x) -> System.out.print(x);
 * Math::pow = (x,y) -> { Math.pow(x,y) }
 * ----------------------------------
 * 类    :: 实例方法 {{@link String#toUpperCase()}}
 * 这种方法引用, 会把第一个参数当成去执行这个实例方法的对象
 * 所以这种方式限定的类第一个参数只能是传递参数类型的类
 * String::toUpperCase
 */
public class FunctionRef {

    @FunctionalInterface
    interface PrintFunc {
        String print(String x);
    }

    public static String function(String a) {
        return a;
    }

    public String function1(String a) {
        return a;
    }

    public static void main(String[] args) {

        /**
         * 类    :: 静态方法
         */
        new FunctionRef().refFunctionPrint(FunctionRef::function);

        /**
         * 对象  :: 实例方法
         */
        FunctionRef fr = new FunctionRef();
        new FunctionRef().refFunctionPrint(fr::function1);

        /**
         * 类    :: 实例方法
         */
        new FunctionRef().refFunctionPrint(String::toUpperCase);
    }

    public void refFunctionPrint(PrintFunc func) {
        for (int i = 97; i < 107; i++) {
            char a = (char) i;
            System.out.println(func.print(String.valueOf(a)));
        }
    }
}

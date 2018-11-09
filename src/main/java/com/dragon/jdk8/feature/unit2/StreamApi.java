package com.dragon.jdk8.feature.unit2;

import java.util.stream.Stream;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/11/1 23:02
 * @Description \n
 * stream() 是Collections的一个方法, 可以把任何的集合类转换为Stream
 * 如果是数组, 可以使用 Stream.of(T[]), 获得一个Stream
 */
public class StreamApi {

    /**
     * Stream Filter 是一个 element -> boolean 值的方法
     */
    static class StreamFilter {
        public static void main(String[] args) {
            Stream<Double> genRandom = Stream.generate(Math::random).limit(10);
            // 过滤掉小于五的数值
            genRandom.filter((d) -> d * 10 > 5).forEach((d) -> {
                double x = d * 100 % 10;
                System.out.println(x);
            });
        }
    }

    /**
     * stream Map 把元素转换为另一个元素
     */
    static class StreamMap {
        public static void main(String[] args) {
            Stream<String> strs = Stream.of("hello world".split(" "));
            Stream<String> upStrs = strs.map(String::toUpperCase);
            upStrs.forEach(System.out::print);
        }
    }


    static class StreamChildAndLimitStream {
        public static void main(String[] args) {
            // limit 10 element
            Stream<Double> genRandom = Stream.generate(Math::random).limit(10);

            // skip two element
            Stream<Double> skip = genRandom.skip(2);
            System.out.println(skip.count());

            // concat two stream
            Stream<Character> streamConcat = Stream.concat(Stream.of('h', 'e', 'l', 'l', 'o'), Stream.of(' ','w', 'o', 'r', 'l', 'd'));
            streamConcat.forEach(System.out::print);
        }
    }
}

package jpabasic.ex1hellojpa;

import jpabasic.ex1hellojpa.domainV5.Album;

public class ValueMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("a == b : " + (a == b));

        Integer c = 10;
        Integer d = 10;
        System.out.println("c == d : " + (c == d));

        Album album1 = new Album("박효신", "발라드");
        Album album2 = new Album("박효신", "발라드");

        // 레퍼런스 값을 가져오기 때문에 false 반환
        System.out.println("album1 == album2 : " + (album1 == album2));
    }
}

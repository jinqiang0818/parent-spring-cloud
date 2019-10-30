package com.example.aservice;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestOne {
    public static void main(String[] args) {
        Integer a  = null;
        double b = 2.4999999d;
        System.out.println(b);

        double v = Math.random() * (1 - 1);
        System.out.println(v);

        Set<Long> keys = Sets.newHashSet();

        keys.add(3L);
        keys.add(0L);
        keys.add(1L);
        keys.add(5L);

        keys.stream().sorted();
        List<Long> keyList = new ArrayList<>(keys);

        System.out.println(keyList.get(0));
        System.out.println(keys);
    }
}

package com.example.generic_test;


import org.junit.Test;

import java.util.*;
import java.util.Map.Entry;

public class HashMapIterator {

    private static final Map<String,String> map=new HashMap<>();

    static{
        map.put("西游记","吴承恩");
        map.put("水浒传","施耐庵");
        map.put("三国演义","罗贯中");
        map.put("红楼梦","曹雪芹");
    }

    @Test
    public void test01(){
        Set<String> keySet = map.keySet();
        System.out.println("第一种遍历方式：");
        for(String key: keySet){
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }

    @Test
    public void test02(){
        Set<String> keySet = map.keySet();
        System.out.println("第二种遍历方式：");
        Iterator<String> it = keySet.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }

    @Test
    public void test03(){
        Set<Entry<String, String>> entrySet = map.entrySet();
        System.out.println("第三种遍历方式：");
        for(Entry<String,String> entry: entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

    @Test
    public void test04(){
        Set<Entry<String, String>> entrySet = map.entrySet();
        Iterator<Entry<String, String>> it = entrySet.iterator();
        System.out.println("第四种遍历方式：");
        while(it.hasNext()){
            Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

    @Test
    public void test05(){
        Collection<String> values = map.values();
        for(String value: values){
            System.out.println(value);
        }
    }
}

package com.teddy.fastjson;

import com.alibaba.fastjson.JSON;
import java.io.IOException;

public class fastjson {

    public String name;
    public String age;
    public fastjson() throws IOException {
    }

    public void setName(String test) {
        System.out.println("name setter called");
        this.name = test;
    }

    public String getName() {
        System.out.println("name getter called");
        return this.name;
    }

    public void setAge(String test) {
        System.out.println("age setter called");
        this.age = test;
    }
    public String getAge(){
        System.out.println("age getter called");
        return this.age;
    }

    public static void main(String[] args) {
        Object obj = JSON.parse("{\"@type\":\"com.teddy.fastjson.fastjson\",\"name\":\"test name\", \"age\":\"test age\"}");
        System.out.println(obj);
        System.out.println("------------");
        Object obj2 = JSON.parseObject("{\"@type\":\"com.teddy.fastjson.fastjson\",\"name\":\"test name\", \"age\":\"test age\"}");
        System.out.println(obj2);
    }

}
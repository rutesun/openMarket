package com.intellicode.openMarket.vo.product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rutes_000 on 2015-06-04.
 */
public class ClassificationMap {
    private String code;
    private String name;

    private Map<String, ClassificationMap> next = new HashMap<>();

    public ClassificationMap(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, ClassificationMap> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "ClassificationMap{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}

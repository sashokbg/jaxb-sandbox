package com.example.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.util.Map;

public class MyHashMapAdapter extends XmlAdapter<Map<String, String>, String> {
    @Override
    public String unmarshal(Map<String, String> v) throws Exception {
        return null;
    }

    @Override
    public Map<String, String> marshal(String v) throws Exception {
        return null;
    }
}

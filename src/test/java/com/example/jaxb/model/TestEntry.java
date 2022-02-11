package com.example.jaxb.model;

import com.example.jaxb.AnyValueAdapter;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.LinkedHashMap;


@XmlRootElement
public class TestEntry {
    @XmlAttribute
    public String name;
    @XmlAnyElement(lax = true)
    
    @XmlJavaTypeAdapter(AnyValueAdapter.class)
    public LinkedHashMap<String, String> values;
}

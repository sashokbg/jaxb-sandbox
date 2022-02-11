package com.example.jaxb.model;

import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TestEntry {
    @XmlAttribute
    public String name;
    @XmlAnyElement(lax = true)
    public Object values;
}

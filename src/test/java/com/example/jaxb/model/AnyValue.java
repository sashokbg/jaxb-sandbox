package com.example.jaxb.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AnyValue {
    @XmlElement
    public String toto;
}

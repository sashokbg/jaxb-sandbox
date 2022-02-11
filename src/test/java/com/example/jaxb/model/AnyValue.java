package com.example.jaxb.model;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class AnyValue {
    @XmlAnyElement
    public List<JAXBElement<String>> properties = new ArrayList<>();
}

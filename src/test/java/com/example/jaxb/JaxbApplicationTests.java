package com.example.jaxb;

import com.example.jaxb.model.AnyValue;
import com.example.jaxb.model.TestEntry;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.LinkedHashMap;

class JaxbApplicationTests {

    @Test
    void contextLoads() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(TestEntry.class, AnyValue.class);

        TestEntry employee = new TestEntry();
        employee.name = "Alex";
        
        LinkedHashMap<String, String> properties = new LinkedHashMap<>();
        properties.put("toto", "here we go");
        properties.put("another", "here we go again");
        
        employee.values = properties;
        
        context.createMarshaller().marshal(employee, System.out);
    }

}

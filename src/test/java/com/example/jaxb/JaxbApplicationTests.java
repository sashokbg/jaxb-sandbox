package com.example.jaxb;

import com.example.jaxb.model.AnyValue;
import com.example.jaxb.model.TestEntry;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;

class JaxbApplicationTests {

    @Test
    void contextLoads() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(TestEntry.class, AnyValue.class);

        TestEntry employee = new TestEntry();
        employee.name = "Alex";
        
        AnyValue values1 = new AnyValue();
        values1.toto = "here we go";
        employee.values = values1;
        
        context.createMarshaller().marshal(employee, System.out);
    }

}

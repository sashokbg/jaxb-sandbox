package com.example.jaxb;

import com.example.jaxb.model.AnyValue;
import com.google.common.base.CaseFormat;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import javax.naming.OperationNotSupportedException;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnyValueAdapter extends XmlAdapter<AnyValue, Map<String, String>> {
    @Override
    public AnyValue marshal(Map<String, String> m) {
        AnyValue wrapper = new AnyValue();
        List<JAXBElement<String>> elements = new ArrayList<>();
        for (Map.Entry<String, String> property : m.entrySet()) {
            elements.add(new JAXBElement<>(
                    new QName(getCleanLabel(property.getKey())),
                    String.class, property.getValue()));
        }
        wrapper.properties = elements;
        return wrapper;
    }

    @Override
    public Map<String, String> unmarshal(AnyValue v) throws Exception {
        throw new OperationNotSupportedException();
    }

    private String getCleanLabel(String attributeLabel) {
        attributeLabel = attributeLabel.replaceAll("[()]", "")
                .replaceAll("[^\\w\\s]", "_").replaceAll(" ", "_")
                .toUpperCase();
        attributeLabel = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,
                attributeLabel);
        return attributeLabel;
    }
}
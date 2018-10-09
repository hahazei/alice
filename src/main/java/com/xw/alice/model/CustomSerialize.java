package com.xw.alice.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xw.alice.dto.AgeType;

import java.io.IOException;

/**
 * Created by xuw-e on 2018/10/9.
 */
public class CustomSerialize extends JsonSerializer<Integer> {
    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObject(AgeType.getType(value));
    }
}

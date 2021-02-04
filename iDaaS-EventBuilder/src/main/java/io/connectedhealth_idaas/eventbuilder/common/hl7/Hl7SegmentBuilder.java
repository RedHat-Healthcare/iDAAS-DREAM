package io.connectedhealth_idaas.eventbuilder.common.hl7;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Hl7SegmentBuilder {

    public static <T> String buildSegment(T pojo, int fieldIndexStart, int fieldCount, String fieldDelimiter) {
        String name = pojo.getClass().getSimpleName();
        StringBuilder segment = new StringBuilder();
        segment.append(name);

        Field[] fields = pojo.getClass().getDeclaredFields();
        Map<Integer, Field> fieldMap = new HashMap<>(fields.length);
        String fieldNamePrefix = name + "_";
        for (Field f : fields) {
            String fieldName = f.getName();
            if (fieldName.startsWith(fieldNamePrefix)) {
                int index = fieldName.indexOf("_", fieldNamePrefix.length()+1);
                String fieldIndex = fieldName.substring(fieldNamePrefix.length(), index);
                fieldMap.put(Integer.valueOf(fieldIndex), f);
            }
        }

        for (int i=fieldIndexStart; i<=fieldCount; i++) {
            try {
                Field f = fieldMap.get(Integer.valueOf(i));
                if (null != f) {
                    f.setAccessible(true);
                    segment.append(fieldDelimiter).append(f.get(pojo));
                }

            } catch (Exception e) {
            }

        }

        return segment.append(fieldDelimiter).toString();
    }
    
}

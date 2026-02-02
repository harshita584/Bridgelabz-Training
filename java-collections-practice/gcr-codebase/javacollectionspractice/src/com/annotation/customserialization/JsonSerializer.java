package com.annotation.customserialization;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true); // private fields access

                JsonField annotation = field.getAnnotation(JsonField.class);

                try {
                    Object value = field.get(obj);

                    if (!first) {
                        jsonBuilder.append(", ");
                    }

                    jsonBuilder.append("\"")
                               .append(annotation.name())
                               .append("\": ");

                    if (value instanceof String) {
                        jsonBuilder.append("\"").append(value).append("\"");
                    } else {
                        jsonBuilder.append(value);
                    }

                    first = false;

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}

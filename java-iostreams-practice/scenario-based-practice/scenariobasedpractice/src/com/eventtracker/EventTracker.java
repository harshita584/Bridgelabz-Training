package com.eventtracker;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import org.json.JSONArray;
import org.json.JSONObject;

public class EventTracker {
    public static void main(String[] args) {
        JSONArray logs = new JSONArray();
        try {
            Class<?> cls = UserActions.class;
            Method[] methods = cls.getDeclaredMethods();

            for (Method m : methods) {
                if (m.isAnnotationPresent(AuditTrail.class)) {
                    AuditTrail audit = m.getAnnotation(AuditTrail.class);
                    
                    JSONObject log = new JSONObject();
                    log.put("class", cls.getSimpleName());
                    log.put("method", m.getName());
                    log.put("action", audit.action());
                    log.put("timestamp", LocalDateTime.now().toString());

                    logs.put(log);
                }
            }
            System.out.println(logs.toString());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

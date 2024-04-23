package pipeline.proceccing;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Date {

    private Map<String, Object> map = new HashMap<>();

    public void put(Map<String, Object> map) {
        this.map = map;
    }

    public java.util.Date match(String fieldName, String pattern) {

        try {
            String value = (String) map.get(fieldName);
            java.util.Date date1 = DateUtils.parseDate(value, pattern);
            map.put(fieldName, date1);
            return date1;
        } catch (Exception e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
        return null;
    }
}

package pipeline.proceccing;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Strip {
    private Map<String, Object> map = new HashMap<>();

    public void put(Map<String, Object> map) {
        this.map = map;
    }

    public String match(String fieldName) {

        String value = (String) map.get(fieldName);
        value = StringUtils.strip(value);
        map.put(fieldName, value);
        return value;
    }
}

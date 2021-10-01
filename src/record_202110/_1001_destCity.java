package record_202110;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 旅行终点站
 * https://leetcode-cn.com/problems/destination-city/
 */
public class _1001_destCity {
    public static String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>(paths.size());
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (map.get(value) == null) {
                return value;
            }
        }
        return "";
    }
    public static void main(String[] args) {

        List<List<String>> paths =new ArrayList<>();
        paths.add(new ArrayList<>(){{
            add("B");
            add("C");
        }});
        paths.add(new ArrayList<>(){{
            add("D");
            add("B");
        }});paths.add(new ArrayList<>(){{
            add("C");
            add("A");
        }});
        System.out.println(destCity(paths));
    }
}

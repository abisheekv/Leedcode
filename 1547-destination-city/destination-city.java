import java.util.*;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> startCities = new HashSet<>();
        
        for (List<String> path : paths) {
            startCities.add(path.get(0));
        }
        
        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!startCities.contains(dest)) {
                return dest;
            }
        }
        
        return "";
    }
}
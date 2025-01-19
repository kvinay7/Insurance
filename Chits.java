import java.util.*;
import java.util.stream.*;

public class Chits{
	public static void main(String[] args) {
	    double amount = 120000;
	    int months = 12;
	    double roi = 0.02;
	    int n = 2;
	    
	    Map<Integer, Double> map = new HashMap<>();
	    double total = 0;
	    for(int i = 1; i <= months; i++){
	        if(i == 2){
	            map.put(i, amount/months * n);
	        }else{
	            double val = (amount - ((roi) * amount * (months - i))) / months * n;
	            map.put(i, val);
	        }
		total += map.get(i);
	    }
	    System.out.println(map);
	    
	    Map<String, Double> combinations = new HashMap<>();
	    for(int i = 1; i < months; i++){
	        for(int j = i+1; j <= months; j++){
	            if(i == 2 || j == 2) continue;
	            int remain = (months-n);
	            double val = total - map.get(i) - map.get(j) - (map.get(i)/n * remain) - (map.get(j)/n * remain);
              	    val = val > 0 ? -val : Math.abs(val);
	            String key = i + "," + j;
	            combinations.put(key, val);
	        }
	    }
	    
	    Map<String, Double> sortedMap = combinations.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue, 
                (oldValue, newValue) -> oldValue,
                LinkedHashMap::new
            ));
            sortedMap.forEach((key, value) -> System.out.println(key + " -> " + value));
	    
	}
}

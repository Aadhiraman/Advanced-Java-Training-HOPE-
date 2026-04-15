import java.util.HashMap;

void main(){
	var map = new HashMap<String, Integer>();
	
	// returns null value
	IO.println(map.get("hello"));
	IO.println(map.getOrDefault("name1", 8));
	map.put("name2", 10);

	for(String s: map.keySet()){
		IO.println(s + " " + map.get(s));
	}
        
}

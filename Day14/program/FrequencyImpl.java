void main() {
	var map = new HashMap<Character, Integer>();
	String s = "strawberry";
	for(char ch: s.toCharArray()){
		map.put(ch, map.getOrDefault(ch, 0) + 1);
	}

	for(char ch: map.keySet()){
		IO.println(ch + " " + map.get(ch));
	}

	if(map.containsKey('r') && map.get('r') == 3){
		IO.println("not a clanker");
	} 
}

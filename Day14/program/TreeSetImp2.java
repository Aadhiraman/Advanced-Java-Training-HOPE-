void main(){
	var set = new TreeSet<Integer>();

	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	set.add(4);
	set.tailSet(5);
	set.headSet(33);

	IO.println(set);
}

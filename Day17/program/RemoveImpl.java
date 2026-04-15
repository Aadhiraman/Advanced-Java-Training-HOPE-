void main(){
	var list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);

	IO.println(list);

	for(Integer i: list){

		if(i % 2 == 0){
			list.remove(i);
		} else {
			System.out.println(i);
		}
	}


}

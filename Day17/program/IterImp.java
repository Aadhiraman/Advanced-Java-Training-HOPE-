import java.util.*;

void main(){
	List<Integer> list = new ArrayList<>();
	list.add(20);
	list.add(39);
	list.add(444);
	list.add(34);

	Iterator<Integer> iterator = list.iterator();

	while(iterator.hasNext()){

		int curr = iterator.next();

		if(curr % 2 == 0){
			iterator.remove();
		}
		else{
	
			IO.println(curr);
		}
	}
}

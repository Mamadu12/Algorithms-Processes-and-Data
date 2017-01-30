package hashtables;

public class HashTable {
	public static void main (String[] args){ 
		HashtableWrapper<String, Integer> instance = new HashtableWrapper<>(5);
		instance.put("is", 69);
		instance.put("dead", 0);
		instance.put("but", 999);
		instance.put("not", -42);
		instance.put("me!", -1);
		System.out.println(instance);
		System.out.println("Your hashCode is: "+ instance.hashCode());
	}

}

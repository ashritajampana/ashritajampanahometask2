package epam.newyeargift;


	import java.util.*;



	public class newyear {
		
		static Scanner sc = new Scanner(System.in);
		static Map<String, Integer> map = new HashMap<String, Integer>()
		{{
		                 put("Eclairs", 0); put("MangoBite", 0); put("Munch", 0); put("Kalakand", 0); put("Jilebi", 0); put("KajuBarfi", 0);
		}};
		//main method
		public static void main(String args[]) {
		//creating sweet objects
		sweet Kalakand = new sweet();
		Kalakand.setWeight(30);
		sweet Jilebi = new sweet();
		Jilebi.setWeight(45);
		sweet KajuBarfi = new sweet();
		KajuBarfi.setWeight(25);
		Eclair dc = new Eclair();
		MangoBite g = new MangoBite();
		Munch c = new Munch();
		//taking input from user
		char areMore = 'y';
		System.out.println("\n1. Eclairs\n2. MangoBite\n3. Munch\n4. Kalakand\n5. Jilebi\n6. KajuBarfi");
		while (areMore == 'y') {
		System.out.println("Select what you want: ");
		       int n = sc.nextInt();
		       switch(n) {
		       case 1: map.put("Eclairs", map.get("Eclairs")+1); break;
		       case 2: map.put("MangoBite", map.get("MangoBite")+1); break;
		       case 3: map.put("Munch", map.get("Munch")+1); break;
		       case 4: map.put("Kalakand", map.get("Kalakand")+1); break;
		       case 5: map.put("Jilebi", map.get("Jilebi")+1); break;
		       case 6: map.put("KajuBarfi", map.get("KajuBarfi")+1); break;
		       }
		       System.out.println("Are there more sweets or chocolates? (y/n): ");
		       areMore = sc.next().charAt(0);
		}
		sc.close();
		//calculating total weight and number of candies
		double totalWt = dc.calWeight(map.get("Eclairs")) + g.calWeight(map.get("MangoBite")) + c.calWeight(map.get("Munch"));
		totalWt += Kalakand.calcWeight(map.get("Kalakand")) + Jilebi.calcWeight(map.get("Jilebi")) + KajuBarfi.calcWeight(map.get("KajuBarfi"));
		System.out.println("Total gift weight: " + totalWt);
		int quantity = 0;
		System.out.println("Number of individual candies: ");
		for (String candy : map.keySet()) {
		System.out.println(candy + " : " + map.get(candy));
		quantity += map.get(candy);
		}
		System.out.println("Total number of candies: " + quantity);
		}
	}



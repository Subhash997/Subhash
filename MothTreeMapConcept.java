

	import java.util.Map.Entry;
	import java.util.Set;
	import java.util.TreeMap;
	public class MothTreeMapConcept {
		public static void main(String[] args) {
			
			TreeMap<String, Integer> months = new TreeMap<String, Integer>();
			months.put("January", 31);
			months.put("February", 28);
			months.put("March", 31);
			months.put("April", 30);
			months.put("May", 31);
			months.put("June", 30);
			months.put("July", 31);
			months.put("August", 31);
			months.put("September", 30);
			months.put("October", 31);
			months.put("November", 30);
			months.put("December", 31);
			System.out.println(months);
			System.out.println("===================================================");
			System.out.println("Using Entry Set");
			Set<Entry<String, Integer>> entry = months.entrySet();
			for (Entry<String, Integer> ent : entry) {
				System.out.println("Key : " + ent.getKey() + " Value : " + ent.getValue());
			}
			System.out.println("========================");
			System.out.println("Using ForEach");
			months.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));
		}

	}



package jumptojava;

import java.util.HashMap;

public class practice_map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "sohui");
		map.put("height", "161cm");

		System.out.println(map.get("name"));
		System.out.println(map.remove("name"));
		System.out.println(map.containsKey("name"));
		System.out.println(map.containsKey("height"));
		System.out.println(map.size());

	}
}

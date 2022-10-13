package assignment;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceCount {

	public Map<String, Integer> occurrenceCount(String str) {

		String[] strArray = str.split(" ");
		Map<String, Integer> occurrenceMap = new HashMap<String, Integer>();

		for (String word : strArray) {
			if (occurrenceMap.keySet().contains(word)) {
				occurrenceMap.put(word, occurrenceMap.get(word) + 1);
			}else {
				occurrenceMap.put(word, 1);
			}
		}
		return occurrenceMap;

	}

}

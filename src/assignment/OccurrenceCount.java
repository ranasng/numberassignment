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
			} else {
				occurrenceMap.put(word, 1);
			}
		}

		return occurrenceMap;

	}

	public int getCaseInsensitiveValue(String key) {
		Map<String, Integer> mpv = new HashMap<>();
		mpv.put("A", 1);
		mpv.put("B", 2);
		mpv.put("C", 3);
		mpv.put("D", 4);
		mpv.put("E", 5);
		mpv.put("F", 6);
		int value = -1;

		if (mpv.keySet().contains(key)) {
			value = mpv.get(key);
		} else {
			key = key.toUpperCase();
			if (mpv.get(key) != null) {
				value = mpv.get(key);
			}
		}

		return value;
	}

	

}

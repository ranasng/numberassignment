package assignment;

import java.util.List;

public class LargestNumber {

	public int findLargestNumber(List<Integer> numberList) {
		int largestNum = numberList.stream().sorted(new CustomSort()).findFirst().orElse(0);
		return largestNum;
	}

	public int find2ndLargestNumber(List<Integer> numberList) {
		int secondHighest = numberList.stream().sorted(new CustomSort()).skip(1).findFirst().orElse(0);
		return secondHighest;
	}

	public int findLargestNumberWithoutSort(List<Integer> numberList) {
		int largest = numberList.get(0);
		for (int i = 0; i < numberList.size(); i++) {
			if (largest < numberList.get(i))
				largest = numberList.get(i);

		}

		return largest;
	}

}

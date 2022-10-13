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

	public void findLargestNumberWithoutSort(List<Integer> numberList) {
		int largest = numberList.get(0);
		int lastNum=0;
		for (int i = 0; i < numberList.size(); i++) {
			if (largest < numberList.get(i)) {
				lastNum=largest;
				largest = numberList.get(i);
			}
			
		}
		System.out.println("Largest without Sorting: "+largest);
		System.out.println("2nd Largest without Sorting: "+lastNum);
		
	}

}

package assignment;

import java.util.Arrays;
import java.util.List;

public class Assignment {

	public static void main(String[] args) {
		List<Integer> numberList=Arrays.asList(3,5,6,7,55,72,84,43,67);
		//List<Integer> numberList=Arrays.asList(3,6,5);
		LargestNumber ln = new LargestNumber();
		OccurrenceCount occurrenceCount=new OccurrenceCount();
		String str="Today is Sunday Today is holiday";
		int largestNUmber = ln.findLargestNumber(numberList);
		
		System.out.println("List of number :" + numberList);
		System.out.println("================================================" );
		System.out.println("Larges Number is :" + largestNUmber);
		System.out.println("================================================" );
		int secondLargest=ln.find2ndLargestNumber(numberList);
		System.out.println("2nd Largest :" + secondLargest);
		
		System.out.println("Largest number without sorting :" + ln.findLargestNumberWithoutSort(numberList));
		System.out.println("================================================" );
		System.out.println("Number of Occurrence in String: "+occurrenceCount.occurrenceCount(str));
		
		
	}

}

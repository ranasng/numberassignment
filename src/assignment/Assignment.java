package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Assignment {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(3, 5, 6, 7, 55, 72, 84, 43, 67);
		// List<Integer> numberList=Arrays.asList(3,6,5,7);
		LargestNumber ln = new LargestNumber();
		OccurrenceCount occurrenceCount = new OccurrenceCount();
		String str = "Today is Sunday Today is holiday";
		int largestNUmber = ln.findLargestNumber(numberList);

		System.out.println("List of number :" + numberList);
		System.out.println("================================================");
		System.out.println("Larges Number is :" + largestNUmber);
		int secondLargest = ln.find2ndLargestNumber(numberList);
		System.out.println("2nd Largest :" + secondLargest);
		System.out.println("================================================");
		ln.findLargestNumberWithoutSort(numberList);
		System.out.println("================================================");
		Map<String,Integer> strMap=occurrenceCount.occurrenceCount(str);
		System.out.println("Number of Occurrence in String: " + strMap);
		System.out.println("===================Sort Employee Objects=========================");
		List<Employee> empList = Arrays.asList(new Employee(3, "Rana", 30), new Employee(1, "Singha", 25),
				new Employee(5, "Arun", 35), new Employee(4, "Sourav", 20), new Employee(7, "Debu", 55),
				new Employee(2, "Rajiv", 20), new Employee(8, "Sameer", 35), new Employee(9, "Abhi", 25)

		);
		empList.stream().sorted().forEach(System.out::println);
		System.out.println("===================Case Insensitive Map=========================");
		System.out.println(occurrenceCount.getCaseInsensitiveValue("A"));
		System.out.println(occurrenceCount.getCaseInsensitiveValue("b"));
		System.out.println(occurrenceCount.getCaseInsensitiveValue("Z"));
		System.out.println("===================Most Frequent Words=========================");
		System.out.println(occurrenceCount.frequentWord(strMap));

	}

}

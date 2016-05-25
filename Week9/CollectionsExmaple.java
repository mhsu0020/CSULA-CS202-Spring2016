import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionsExmaple {

	public static void main(String[] args) {

		LinkedHashSet<Student> students = new LinkedHashSet<>();

		Student studentOne = new Student("mike", "1234");
		Student studentTwo = new Student("mike", "1234");

		Student studentThree = new Student("john", "12121");

        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);

        for(Student student : students){
        	System.out.println(student.name);

        }
		HashSet<String> names = new HashSet<>();

		names.add("John");
		names.add("Michael");
		names.add("Mary");
		names.add("David");
		names.add("Larry");

//		for(String name : names){
//			System.out.println(name);
//
//		}

		HashSet<Integer> numbers = new HashSet<>();

		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);

		for(Integer num : numbers){
			System.out.println(num);
		}
	}

}

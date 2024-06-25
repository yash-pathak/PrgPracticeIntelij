package SamsungLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmployee {
    public static void main(String[] args) {
//        Employee e1= new Employee("yash",23,100);
//        Employee e2=new Employee("mohit",24, 200);
//        Employee e3=new Employee("naman",25, 200);
//        System.out.println(e1==e2);
//
//        List<Employee> employeeList= new ArrayList<>();
//        employeeList.add(e1);
//        employeeList.add(e2);
//        employeeList.add(e3);
//
//        employeeList.sort(Comparator.comparingDouble(Employee::getSalary).thenComparingInt(Employee::getAge));
//        employeeList.forEach(System.out::println);

        int a = -121;
        String string = Integer.toString(a);
        char[] charArray = string.toCharArray();
        String s = Stream.of(charArray).map(chr -> new StringBuffer(Arrays.toString(chr)).reverse()).collect(Collectors.joining(","));
        if (string.equals(s)){
            System.out.println("palindrome");
    }
        else {
            System.out.println("not palindrome");
            System.out.println(string+"-"+s);
        }




//            int reverse = 0;
//            int temp = a;
//            while (temp != 0) {
//                reverse = (reverse * 10) + (temp % 10);
//                temp = temp / 10;
//
//            }
        System.out.println(1%10);

    }




}

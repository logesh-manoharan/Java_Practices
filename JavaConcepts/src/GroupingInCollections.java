import entities.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingInCollections {

    public static void main(String[] args) {
        List<Employee> listOfEmployees = new ArrayList<>();
        for (int index = 0; index < 5; index++) {
            Employee employee = new Employee(index, "Employee-" + index, 21 +
                    index, 10000 * index, "City-" + index);
            listOfEmployees.add(employee);
        }
        // Adding more employees with Same City
        Employee employee1 = new Employee(5, "Employee-" + 5, 21,
                10000, "City-" + 4);
        Employee employee2 = new Employee(6, "Employee-" + 6, 22,
                15000, "City-" + 4);

        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);

        // Grouping by City and calculating the Sum() of the Salary
        Map<String, Long> groupByCity = listOfEmployees.stream().collect(
                Collectors.groupingBy(Employee::getCity, Collectors.summingLong(Employee::getSalary))
        );

        // Sorting by value
        List<Map.Entry<String, Long>> mapAsList = new ArrayList<>(groupByCity.entrySet());
//        Collections.sort(mapAsList, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        mapAsList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));  // Descending Order

        for (Map.Entry<String, Long> entry : mapAsList) {
            System.out.println("City : " + entry.getKey() + " " +
                    "Total Salary : " + entry.getValue());
        }
//        Iterator<Map.Entry<String, Long>> employeeIterator = groupByCity.entrySet().iterator();
//        while(employeeIterator.hasNext()) {
//            System.out.println("City : " + employeeIterator.next().getKey() + " " +
//                    "Total Salary : " + employeeIterator.next().getValue());
//        }

    }
}

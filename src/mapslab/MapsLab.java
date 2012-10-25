
package mapslab;

import com.sun.org.apache.bcel.internal.generic.ISTORE;
import java.util.*;
public class MapsLab {


    public static void main(String[] args) {
Employee emp1 = new Employee("Smith","John","111-22-3333");
Employee emp2 = new Employee("Doe","Will","111-22-3333");
Employee emp3 = new Employee("Garcia","Jane","222-33-4444");
Employee emp4 = new Employee("Wright","Marcy","333-44-5555");

/////#2///////
        System.out.println("#2");
Set<Employee> set = new HashSet<Employee>();
set.add(emp1);
set.add(emp2);
set.add(emp3);
set.add(emp4);

        System.out.println(set);
List<Employee> list = new ArrayList<Employee>(set);

        System.out.println(list);
//////////////
        
////#3////////
        System.out.println("#3");
Map<String,Employee> hm = new HashMap<String,Employee>();
List<Map<String,Employee>> list2 = new ArrayList<Map<String,Employee>>();
hm.put(emp1.getFirstName(), emp1);
hm.put(emp2.getFirstName(), emp2);
hm.put(emp3.getFirstName(), emp3);
hm.put(emp4.getFirstName(), emp4);
list2.add(hm);

        System.out.println("Using the get method: " + hm.get("Jane") + "" + "\n");

        for(Employee emp: hm.values()){
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", SSN: " + emp.getSsn());
        }
      
        System.out.println(list2);
        
//////////////
        
////#4////////
        System.out.println("#4");
        
Map<String,Employee> tm = new TreeMap<String,Employee>();
List<Map<String,Employee>> list3 = new ArrayList<Map<String,Employee>>();
tm.put(emp1.getFirstName(), emp1);
tm.put(emp2.getFirstName(), emp2);
tm.put(emp3.getFirstName(), emp3);
tm.put(emp4.getFirstName(), emp4);
list3.add(tm);

        System.out.println(list3 + "\n");
for(Employee emp: tm.values()){
    System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", SSN: " + emp.getSsn());
}


//////////////

////#5////////
        System.out.println("#5");
Set<Employee> ts = new TreeSet<Employee>();

ts.add(emp1);
ts.add(emp2);
ts.add(emp3);
ts.add(emp4);
Iterator it;
it = ts.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}


    }
}

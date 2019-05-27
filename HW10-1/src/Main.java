import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = adddata();


        System.out.println( " Grouping Number : "+ personList.stream().collect(Collectors
                .groupingBy(
                        (Person p) ->"\n\n"+ p.getName().length())));


        System.out.println("\nGrouping Number Item :   "+personList.stream().collect(Collectors
                .groupingBy(
                        (Person p) -> p.getName().length(),Collectors.counting())));


    }

    // Add Data Person
    static List<Person> adddata() {

        Person person1 = new Person("meharn");
        Person person2 = new Person("reza");
        Person person3 = new Person("mohammad");
        Person person4 = new Person("ali");
        Person person5 = new Person("ahmad");
        Person person6 = new Person("nima");
        Person person7 = new Person("farzan");
        Person person8 = new Person("mostafa");
        Person person9 = new Person("abbas");
        Person person10 = new Person("arash");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);
        return personList;
    }

}

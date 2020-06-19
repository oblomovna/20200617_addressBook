package telran.controller;

import telran.data.Address;
import telran.data.Person;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Address a1 = new Address("Avenue 1",11);
        Address a2 = new Address("Avenue 2",12);
        Address a3 = new Address("Avenue 3",13);
        Address a4 = new Address("Avenue 4",14);

        List<Address> addresses = new ArrayList<>();
        addresses.add(a1);
        addresses.add(a2);
        addresses.add(a3);
        addresses.add(a4);


        Person p1 = new Person("Olivie",a1);
        Person p2 = new Person("Polin",a2);
        Person p3 = new Person("Mishel",a3);
        Person p4 = new Person("Nicole",a4);

        List<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);

        List<Person> persons2 = new ArrayList<>();
        persons2.add(p3);
        persons2.add(p4);


        List<Address> addressByPerson = getAddress(persons2);
        System.out.println(addressByPerson);



    }
    public static List<Address> getAddress(List<Person> persons) {
        List<Address> addressByPerson = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().equals(persons)) ;
            addressByPerson.add(persons.get(i).getAddress());
        }
        return addressByPerson;
    }
}

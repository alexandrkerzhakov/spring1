package ru.gb;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", "Rick", 20);
        Person person2 = new Person("John", "Tomson", 30);
        Person person3 = new Person("John", "Tomson", 30);

        System.out.println(person1.equals(person2)); //false
        System.out.println(person2.equals(person3)); //true

        Serialization serialization = new Serialization();
        String json = serialization.jsonFromPerson(person1);
        System.out.println(json);
        /*
            {
              "firstName": "Tom",
              "lastName": "Rick",
              "age": 20
            }
        */

        Person serializationPerson1 = serialization.personFromJson(json);
        System.out.println(serializationPerson1); // ru.gb.Person@33a10788[firstName=Tom,lastName=Rick,age=20]
    }
}

package ru.gb;

import com.google.gson.GsonBuilder;

public class Serialization {

    public String jsonFromPerson(Person person) {
        return new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(person);
    }

    public Person personFromJson(String json) {
        return new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .fromJson(json, Person.class);
    }
}

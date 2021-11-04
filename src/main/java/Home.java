import java.util.ArrayList;
import java.util.List;

public class Home {
    public static void main(String[] args) {
     List <Person> people = List.of(
             new Person("Kanha",Gender.MALE),
             new Person("Punam",Gender.FEMALE),
             new Person("Dolly",Gender.FEMALE),
             new Person("Nimma",Gender.FEMALE),
             new Person("Kamal",Gender.MALE)
             );
     //Imperative Approach
        List<Person> female = new ArrayList<>();

//        for (Person person : people) {
//            if ()
//        }
    }

    static class Person {
        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}

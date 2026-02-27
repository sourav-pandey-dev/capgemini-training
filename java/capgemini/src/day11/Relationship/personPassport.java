package day11.Relationship;

public class personPassport {
    class Passport {
        String passportNumber;

        public Passport(String number) { this.passportNumber = number; }
    }

    class Person {
        String name;
        // One-to-One: A person has exactly one passport
        Passport passport;

        public Person(String name, Passport passport) {
            this.name = name;
            this.passport = passport ;
        }
    }
}

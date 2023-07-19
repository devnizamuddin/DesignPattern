package builder;

public class BuilderPatternExample {

    /**
     * The Builder pattern is a creational design pattern that is used to construct complex objects step by step.
     * It provides a flexible solution for creating objects with many optional parameters or configurations,
     * while keeping the construction process clean and easy to understand.
     * The Builder pattern separates the construction of an object from its representation,
     * allowing different construction algorithms to create different representations of the same object.
     *
     * In Mobile App Development, Builder Pattern is used for
     * 1. Creating User Profiles
     * 2. Building Configurable UI Components such as text color, background color, font size, alignment, and more
     * 3. In case of constructing API requests Builder pattern allows developers to specify the required parameters and configurations
     */

    public static void main(String[] args) {

        Person person = new Person.Builder()
                .setName("Person")
                .build();

        Person nizam = new Person.Builder()
                .setName("Nizam")
                .setEducation("Bsc in Computer Science Engineering")
                .setAge(27)
                .setProfession("Mobile App Developer")
                .build();

        person.show();
        System.out.println("----------------------------------------");
        nizam.show();

    }
}

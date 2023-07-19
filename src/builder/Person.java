package builder;

public class Person {

    private String name;
    private int age;
    private String education;
    private String profession;

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
        education = builder.education;
        profession = builder.profession;
    }

    public void show() {
        System.out.println("Name : " + name
                + "\nAge : " + age
                + "\nEducation : " + education
                + "\nProfession : " + profession);
    }

    public static class Builder {

        /**
         * For building Person.
         */

        private String name;
        private int age;
        private String education;
        private String profession;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEducation(String education) {
            this.education = education;
            return this;
        }

        public Builder setProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

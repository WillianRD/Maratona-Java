package academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

public class Person {
    private String firsname;
    private String lastname;
    private String username;
    private String email;

    private Person(String firsname, String lastname, String username, String email){
        this.firsname = firsname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firsname='" + firsname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firsname;
        private String lastname;
        private String username;
        private String email;

        public PersonBuilder firsname(String firsname){
            this.firsname = firsname;
            return this;
        }

        public PersonBuilder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public PersonBuilder username(String username){
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }

        public Person build(){
            return new Person(firsname,lastname,username,email);
        }
    }

}
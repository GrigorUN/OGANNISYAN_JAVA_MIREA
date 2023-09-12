package Practika2;

public class zadanie1 {
    public class Author {
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        public String toString() {
            return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
        }
    }
    public static void main(String[] args) {
        zadanie1 outerInstance = new zadanie1();
        Author author = outerInstance.new Author("Grigor", "grigorogannisyan@example.com", 'M');

        System.out.println("Имя автора: " + author.getName());
        System.out.println("Адрес электронной почты: " + author.getEmail());

        author.setEmail("newemail@example.com");
        System.out.println("Новый адрес электронной почты: " + author.getEmail());

        System.out.println("Пол автора: " + author.getGender());
        System.out.println(author.toString());
    }
    

}

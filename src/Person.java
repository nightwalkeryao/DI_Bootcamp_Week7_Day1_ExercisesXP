public class Person {
    private String name;
    private String lastName;
    private String email;
    private int age;

    public Person(String name, String lastName, String email, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{\n" +
                "    name='"+name+"',\n" +
                "    lastName='"+lastName+"',\n" +
                "    email='"+email+"', age="+age+"\n" +
                "}";
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Wick", "john@wick.com", 55);
        System.out.println(person.toString());
    }
}

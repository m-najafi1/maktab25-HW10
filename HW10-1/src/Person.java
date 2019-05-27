public class Person {

    private String name;


    public Person(String name) {
        this.name = name;
    }

    // Getters And Setters ...
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

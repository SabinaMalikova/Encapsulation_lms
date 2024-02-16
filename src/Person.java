public class Person {
    private String name;
    private int age;
    private String nationality;
    private String work;

    public Person() {
    }

    public Person(String name, int age, String nationality, String work) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" +
                "Возраст: " + age + "\n"+
                "Национальность: " + nationality + "\n" +
                "Работа: " + work ;
    }
}

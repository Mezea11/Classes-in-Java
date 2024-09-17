public class Teacher {
    private String name;
    private int age;
    public String subject;

    public Teacher (String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Teacher (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", age=" + age + ", subject=" + subject + "]";
    }
}

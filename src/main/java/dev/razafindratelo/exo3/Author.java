package mg.training.exo3;

public class Author {
    public enum Sex {M, F};
    private String name;
    private String email;
    private Sex sex;

    public Author(String name, String email, Sex sex) {
        this.name = name;
        this.email = email;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author {" +
                "name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", sex = " + sex +
                '}';
    }
}

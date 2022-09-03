package moviepackage;

public class Genre {
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre() {
    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getters and setters

    @Override
    public String toString() {
        return "moviepackage.Genre [id=" + id + ", name=" + name + "]";
    }

}
package module4.oop.pr1;

public class Item {
    private Integer id;
    private String name;

    public Item(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

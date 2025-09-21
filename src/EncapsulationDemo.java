class Mobile {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.setId(23);
        mb.setName("samsung");

        System.out.println(mb.getId());
        System.out.println(mb.getName());
    }
}

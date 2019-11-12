package demo;

public class bank {
    private String name;
    private int qian;
    private int id;

    public bank( int id,String name, int qian) {
        this.name = name;
        this.qian = qian;
        this.id = id;
    }

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

    public int getQian() {
        return qian;
    }

    public void setQian(int qian) {
        this.qian = qian;
    }

    @Override
    public String toString() {
        return "bank{" +
                "name='" + name + '\'' +
                ", qian=" + qian +
                ", id=" + id +
                '}';
    }
}

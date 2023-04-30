package third_modul.seventh;

public class Phone implements Comparable<Phone>{

    private Manufactures manufacturer;
    private String name;
    private int cost;

    public Phone(Manufactures manufacturer, String name, int cost) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.cost = cost;
    }

    public Manufactures getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufactures manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(Phone o) {
        return this.cost - o.cost;
    }
}

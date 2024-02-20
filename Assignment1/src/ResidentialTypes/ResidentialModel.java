package ResidentialTypes;

public abstract class ResidentialModel {
    private int price;
    private int area;
    private int numOfRooms;
    private int numOfHalls;
    private String name;

    public ResidentialModel(int price, int area, int numOfRooms, int numOfHalls, String name) {
        this.price = price;
        this.area = area;
        this.numOfRooms = numOfRooms;
        this.numOfHalls = numOfHalls;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getNumOfHalls() {
        return numOfHalls;
    }

    public void setNumOfHalls(int numOfHalls) {
        this.numOfHalls = numOfHalls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

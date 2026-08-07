package UMLDiagram.ClassDiagram.parkingLotSystem;

public class ParkingSpace {
    private String name ;
    private String address ;
    private int parkingSlots ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(int parkingSlots) {
        this.parkingSlots = parkingSlots;
    }
}

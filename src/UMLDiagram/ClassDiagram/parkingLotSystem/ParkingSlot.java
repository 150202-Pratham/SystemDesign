package UMLDiagram.ClassDiagram.parkingLotSystem;

public class ParkingSlot {
    private boolean OccupiedStatus;
    private String slotNumber ;

    public boolean isOccupiedStatus() {
        return OccupiedStatus;
    }

    public void setOccupiedStatus(boolean occupiedStatus) {
        OccupiedStatus = occupiedStatus;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }
}

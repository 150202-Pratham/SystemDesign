package UMLDiagram.ClassDiagram.parkingLotSystem;

import UMLDiagram.ClassDiagram.parkingLotSystem.Enums.VehicleType;

public class Vehicle {
    private String numberPlate ;
    private VehicleType type;

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}

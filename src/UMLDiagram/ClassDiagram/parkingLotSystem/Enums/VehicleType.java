package UMLDiagram.ClassDiagram.parkingLotSystem.Enums;

public enum VehicleType {

    CAR ,
    TRUCK ,
    AMBUlANCE,
    MOTORCYCLE,
    CYCLE ;

    public static VehicleType fromString(String v) {
        for (VehicleType t : VehicleType.values()) {
            if (t.name().equalsIgnoreCase(v)) {
                return t;
            }
        }

        return null ;
    }


}

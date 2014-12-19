package ferry.dto;

import ferry.dto.DepartureDetail;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
public class FerryConfigDetail implements Serializable{

    private int peopleCapacity;
    private int vehicleCapacity;
    private int weightCapacity;
    private int id;

    public FerryConfigDetail() {
        super();
    }

    public FerryConfigDetail(int peopleCapacity, int vehicleCapacity, int weightCapacity, int id) {
        this.peopleCapacity = peopleCapacity;
        this.vehicleCapacity = vehicleCapacity;
        this.weightCapacity = weightCapacity;
        this.id = id;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public int getId() {
        return id;
    }
    
    
}

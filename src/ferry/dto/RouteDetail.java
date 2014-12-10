package ferry.dto;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc --> @generated
 */
public class RouteDetail extends RouteIdentifier implements Serializable {

    public RouteDetail(int duration, String habourDestination, String habourOrigin, int basePrice, int id) {
        super(id);
        this.duration = duration;
        this.habourDestination = habourDestination;
        this.habourOrigin = habourOrigin;
        this.basePrice = basePrice;
    }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */

    private int duration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */
    private String habourDestination;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */
    private String habourOrigin;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */
    private int basePrice;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */
    private int id;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public RouteDetail() {
        super();
    }
}
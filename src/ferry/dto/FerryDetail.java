package ferry.dto;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
public class FerryDetail implements Serializable{

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */

    private String name;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private int id;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    public Set<FerryConfigDetail> ferryConfigDetail;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public FerryDetail() {
        super();
    }

    public int getId() {
        return id;
    }

    public Set<FerryConfigDetail> getFerryConfigDetail() {
        return ferryConfigDetail;
    }
}
package ferry.dto;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc --> @generated
 */
public class FerryDetail extends FerryIdentifier implements Serializable {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */
    private String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */
    public Set<FerryConfigDetail> ferryConfigDetail;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public FerryDetail() {
        super();
    }

    public FerryDetail(int id, String name, Set<FerryConfigDetail> ferryConfigDetail) {
        super(id);
        this.name = name;
        this.ferryConfigDetail = ferryConfigDetail;
    }

    public Set<FerryConfigDetail> getFerryConfigDetail() {
        return ferryConfigDetail;
    }
}
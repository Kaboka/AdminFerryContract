package ferry.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc --> @generated
 */
public class ScheduleDetail extends ScheduleIdentifier implements Serializable {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */

    private Date endDate;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */
    private Date startDate;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated @ordered
     */
    public Collection<DepartureDetail> departureDetail;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public ScheduleDetail() {
        super();
    }

    // Frontend
    public ScheduleDetail(int id, Date endDate, Date startDate, Collection<DepartureDetail> departureDetail) {
        super(id);
        this.endDate = endDate;
        this.startDate = startDate;
        this.departureDetail = departureDetail;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Collection<DepartureDetail> getDepartureDetail() {
        return departureDetail;
    }
}
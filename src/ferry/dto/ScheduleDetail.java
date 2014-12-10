package ferry.dto;
import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ScheduleDetail implements Serializable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Date endDate;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Date startDate;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int id;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<DepartureDetail> departureDetail;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ScheduleDetail(){
		super();
	}

        
    // Frontend
    public ScheduleDetail(Date endDate, Date startDate, Set<DepartureDetail> departureDetail) {
        this.endDate = endDate;
        this.startDate = startDate;
        this.departureDetail = departureDetail;
    }
    
    // Backend
    public ScheduleDetail(int id, Date endDate, Date startDate, Set<DepartureDetail> departureDetail) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public Set<DepartureDetail> getDepartureDetail() {
        return departureDetail;
    }
    
    
}
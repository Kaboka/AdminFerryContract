package ferry.dto;
import ferry.dto.RouteDetail;
import ferry.dto.ScheduleDetail;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class DepartureDetail implements Serializable
{
	private int departureTime;
	private Date departureDate;
	private int id;
	private RouteDetail routeDetail;
        private FerryConfigDetail config;

	public DepartureDetail(){
	}

    public DepartureDetail(int departureTime, Date departureDate, int id, RouteDetail routeDetail, FerryConfigDetail config) {
        this.departureTime = departureTime;
        this.departureDate = departureDate;
        this.id = id;
        this.routeDetail = routeDetail;
        this.config = config;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getId() {
        return id;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public RouteDetail getRouteDetail() {
        return routeDetail;
    }

    public FerryConfigDetail getConfig() {
        return config;
    }
    
    
}
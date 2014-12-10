package ferry.contract;

import ferry.dto.FerryDetail;
import ferry.dto.RouteDetail;
import ferry.dto.ScheduleDetail;
import ferry.eto.DataAccessException;
import ferry.eto.NoSuchFerryException;
import ferry.eto.NoSuchHarbourException;
import ferry.eto.NoSuchScheduleException;
import java.util.Collection;
import java.util.Date;
import ferry.dto.FerryIdentifier;
import ferry.dto.ScheduleIdentifier;

/**
 *
 * @author Kasper
 * 
 */
public interface AdminContract {

    /**
     * Changes the departure and arrival time for a ferry.
     *
     * @pre the ferry must not be null and exist and the departure.
     * @throws NoSuchFerryException if the ferry does not exist.
     * @throws DataAccessException if the data can not be stored.
     * @param ferryId
     * @param date
     * @param depatureID
     * @param delayTime
     * @post the departure and arrival time have been changed for the ferry
     */
    public void delayFerry(FerryIdentifier ferryId, Date date,int depatureID, int delayTime) throws NoSuchFerryException, DataAccessException;

    /**
     * Show a list of all ferries.
     *
     * @pre there must exist at least one ferry in system and it must not be null
     * @throws DataAccessException if data cant accessed.
     * @return Collection<FerryDetail>
     * @post the collection of ferries have been returned.
     *
     */
    public Collection<FerryDetail> showFerries() throws DataAccessException;

    /**
     * Adds a new schedule in the system
     *
     * @pre the schedule must not already exist in the system
     * @throws DataAccessException if the data cant be stored.
     * @param schedule
     * @post schedule have been saved.
     */
    public void addSchedule(ScheduleDetail schedule) throws DataAccessException;

    /**
     * Returns a list of schedules
     *
     * @pre there must at least exist one schedule.
     * @throws NoSuchScheduleException thrown if the specified scheduleID does
     * not exist.
     * @return Collection<ScheduleDetail>
     * @post a collection of schedules have been returned.
     */
    public Collection<ScheduleDetail> showSchedules() throws NoSuchScheduleException;

    /**
     * Return all schedules that is active for a given date.
     *
     * @pre there must at least exist one schedule for the given date.
     * @throws NoSuchScheduleException thrown if no schedules are found
     * @param date
     * @return Collection<ScheduleDetail>
     * @post returns all schedules that is active for the given date.
     */
    public Collection<ScheduleDetail> showSchedulesForDate(Date date) throws NoSuchScheduleException;

    /**
     * Shows all the routes currently in the system
     *
     * @pre the assigned harbours must exist
     * @throws NoSuchHarbourException if destination or orgin harbour does not
     * exist.
     * @return Collection<RouteDetail>
     * @post the collection of RouteDetails has been returned
     */
    public Collection<RouteDetail> showRoutes() throws NoSuchHarbourException;
    
    /**
     * Assigns a ferry to a schedule
     * @Pre the ferry and schedule must exist
     * @throws DataAccessException if the data can not be stored.
     * @throws NoSuchFerryException if ferry dont exist
     * @throws NoSuchScheduleException  if schedule dont exist
     * @param ferryId
     * @param scheduleId
     * @post the ferry have been assigned to the schedule
     */
    public void assignFerryToSchedule(FerryIdentifier ferryId, ScheduleIdentifier scheduleId) throws DataAccessException, NoSuchFerryException,NoSuchScheduleException;
}
    
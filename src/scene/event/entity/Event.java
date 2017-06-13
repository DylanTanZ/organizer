package scene.event.entity;

import java.util.GregorianCalendar;

/**
 * Created by Liu Woon Kit on 12/6/2017.
 */
public class Event {
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;
    private String eventTitle;
    private String eventDesc;

    public Event(GregorianCalendar startDate, GregorianCalendar endDate, String eventTitle, String eventDesc) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventTitle = eventTitle;
        this.eventDesc = eventDesc;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }
}

package lab_java.complex_relationship.model.EventManager;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {
    @Temporal(TemporalType.DATE)
    private Date date;
    private long duration;
    private String location;
    @Id
    private String title;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_title")
    private List<Guest> guestList;

    public Event() {
    }

    public Event(Date date, long duration, String location, String title, List<Guest> guestList) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guestList = guestList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", guestList=" + guestList +
                '}';
    }
}

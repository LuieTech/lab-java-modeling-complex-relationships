package lab_java.complex_relationship.model.EventManager;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
import java.util.List;
import java.util.Timer;

@Entity
@PrimaryKeyJoinColumn(name = "title")
public class Exposition extends Event{

    public Exposition() {
    }

    public Exposition(Date date, long duration, String location, String title, List<Guest> list) {
        super(date, duration, location, title, list);
    }


}

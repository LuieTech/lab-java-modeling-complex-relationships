package lab_java.complex_relationship.model.EventManager;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Timer;
@Entity
public class Speaker {
    @Id
    private String name;
    private long presentationDuration;

    public Speaker() {
    }

    public Speaker(String name, long presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(long presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "name='" + name + '\'' +
                ", presentationDuration=" + presentationDuration +
                '}';
    }
}

package project.app.demo.propertyrint;

import org.springframework.stereotype.Component;
import project.app.demo.property.propertyEntity;

import java.sql.Timestamp;

@Component
public class propertyrintEntity extends propertyEntity {

    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

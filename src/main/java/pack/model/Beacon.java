package pack.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_beacon")
public class Beacon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mac;

//    @JsonIgnore
//    @OneToOne(fetch = FetchType.LAZY)
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Device device;

    private Long placeId;
    private Long deviceId;


//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//    @JsonIgnore
//    @ManyToOne(fetch = FetchType.LAZY)
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Place place;


    @Column(columnDefinition = "boolean default false")
    private boolean disabled;

    public Beacon() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "Beacon{" +
                "id=" + id +
                ", mac='" + mac + '\'' +
                ", placeId=" + placeId +
                ", deviceId=" + deviceId +
                ", disabled=" + disabled +
                '}';
    }
}

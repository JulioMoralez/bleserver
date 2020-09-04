package pack.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "t_device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "boolean default false")
    private boolean disabled;

//    @JsonIgnore
////    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//    @OneToOne(mappedBy = "device", fetch = FetchType.LAZY)
//    private Beacon beacon;
//
//    @Transient
//    private Long idBeacon;

    public Device() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

//    public Beacon getBeacon() {
//        return beacon;
//    }
//
//    public void setBeacon(Beacon beacon) {
//        this.beacon = beacon;
//    }
//
//    public Long getIdBeacon() {
//        return beacon!=null ? beacon.getId() : null;
//    }
//
//    public void setIdBeacon(Long idBeacon) {
//        this.idBeacon = idBeacon;
//    }
}

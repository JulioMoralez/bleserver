package pack.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Entity
@Table(name = "t_place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "boolean default false")
    private boolean disabled;

//    @JsonIgnore
//    @OneToMany(mappedBy = "place", fetch = FetchType.LAZY)
//    private List<Beacon> beacons;
//
//    @Transient
//    private List<Long> idBeacons;

    public Place() {
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

//    public List<Beacon> getBeacons() {
//        return beacons;
//    }
//
//    public void setBeacons(List<Beacon> beacons) {
//        this.beacons = beacons;
//    }
//
//    public List<Long> getIdBeacons() {
//        return beacons.stream().map(Beacon::getId).collect(Collectors.toList());
//    }
//
//    public void setIdBeacons(List<Long> idBeacons) {
//        this.idBeacons = idBeacons;
//    }

}

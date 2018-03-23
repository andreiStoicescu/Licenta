package Webapp.jsp.Model;

import javax.persistence.*;

/**
 * Created by easyw on 25-Feb-18.
 */

@Entity(name = "LOCATION")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_LOCATION")
    private int idLocation;
    @Column(name="CITY")
    private String city;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="CODE")
    private String code;

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}


package Webapp.jsp.Business;

import Webapp.jsp.Model.Location;
import Webapp.jsp.Model.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by easyw on 25-Feb-18.
 */
@Component
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;


    public Location create(Location location){
        return locationRepository.save(location);
    }

    public List<Location> findAll(){
        List<Location> list = locationRepository.findAll();
        return list;
    }

    public Location findOne(int idLocation){
        return locationRepository.findOne(idLocation);
    }

    public Location update(Location location){
        return locationRepository.save(location);
    }

    //Delete
    public void delete(int idLocation){
        locationRepository.delete(idLocation);
    }
}

package Webapp.jsp.Rest;

import Webapp.jsp.Business.LocationService;
import Webapp.jsp.Model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by easyw on 05-Mar-18.
 */
@Controller
@RequestMapping(value = "/api",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class RestControler {

    @Autowired
    LocationService locationService;

    @RequestMapping(
            value = "/get",
            method = RequestMethod.GET)
    public ResponseEntity<Location> getLocations(){
        Location location = locationService.findOne(1);
        return new ResponseEntity<Location>(location, HttpStatus.OK);
    }


}

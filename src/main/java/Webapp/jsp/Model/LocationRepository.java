package Webapp.jsp.Model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by easyw on 25-Feb-18.
 */
public interface LocationRepository extends CrudRepository<Location, Integer> {

    List<Location> findAll();
}
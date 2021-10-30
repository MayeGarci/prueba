
package com.costume.repository.crud;

import com.costume.model.Costume;
import org.springframework.data.repository.CrudRepository;

/**
 *interfaz que extiende de CrudRepository para la clase Costume
 * @author User
 */
public interface CostumeCrudRepository extends CrudRepository<Costume, Integer>{
    
}

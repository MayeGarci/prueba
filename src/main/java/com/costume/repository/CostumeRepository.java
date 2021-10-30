
package com.costume.repository;

import com.costume.model.Costume;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.costume.repository.crud.CostumeCrudRepository;

/**
 *
 * @author User
 */
@Repository
public class CostumeRepository {
    @Autowired
    private CostumeCrudRepository costumeCrudRepository;
 /**
 *
 * @return
 */
    public List<Costume> getAll(){
       return (List<Costume>)costumeCrudRepository.findAll();
    }  
    /**
    * @param id
    * @return 
    */
    public Optional<Costume> getCustome(int id){
        return costumeCrudRepository.findById(id);
    }  
 /**
 * @param costume
 * @return 
 */
    public Costume save(Costume costume){
        return costumeCrudRepository.save(costume);
    }

    public Optional<Costume> getCostume(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Costume get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}

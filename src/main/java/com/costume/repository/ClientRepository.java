
package com.costume.repository;

import com.costume.model.Client;
import com.costume.repository.crud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public class ClientRepository {
   @Autowired
    private ClientCrudRepository clientCrudRepository;
   
   public List<Client> getAll() {
      return (List<Client>) clientCrudRepository.findAll();
   }
    public Optional<Client> getCategory(int id){
        return clientCrudRepository.findById(id);
    }
    public Client save(Client client) {
        return clientCrudRepository.save(client);
    }

    public Optional<Client> getClient(Integer idClient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Client get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

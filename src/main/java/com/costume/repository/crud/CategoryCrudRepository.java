
package com.costume.repository.crud;

import com.costume.model.Category;
import com.costume.repository.CategoryRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */

public interface CategoryCrudRepository extends CrudRepository<Category, Integer>{

    
    
}

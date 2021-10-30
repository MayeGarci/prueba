
package com.costume.controller;

import com.costume.model.Costume;
import com.costume.service.CostumeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *api/Costume/all
 * @author User
 */

@RestController
@RequestMapping("/api/Costume")
@CrossOrigin(origins = "*", methods={RequestMethod.GET,RequestMethod.POST})
public class CostumeController {
   @Autowired 
    private CostumeService costumeService;

 /**
 * 
 * @return 
 */
   @GetMapping("/all")
    public List<Costume> getAll(){
        return costumeService.getAll();
    }
    @PostMapping("/save")
    public Costume save(@RequestBody Costume costume){
        return costumeService.save(costume);
    }
}

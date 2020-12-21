package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zemoso on 1/8/17.
 */
@RestController
public class WebController {
    @Autowired
    CustomerRepository repository;

    @ResponseBody
    @RequestMapping(value ="/save", method= RequestMethod.POST)
    public String process( @RequestBody Customer customer){
        repository.save(customer);
        return "done" ;
    }

    @ResponseBody
    @RequestMapping(value ="/update", method= RequestMethod.PUT)
    public String update( @RequestBody Customer customer){
        repository.save(customer);
        return "done" ;
    }


  @RequestMapping(value = "/findAll", method = RequestMethod.GET)
     public List<String> findAll(){
        List<String> results = new ArrayList<>();

        for(Customer cust : repository.findAll()){
            results.add(cust.toString());
        }

        return results ;
    }

    @RequestMapping(value = "/findbyid", method = RequestMethod.GET)
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = repository.findById(id).toString();
        return result;
    }

    @RequestMapping(value = "/findbylastname", method = RequestMethod.GET)
    public List<String> fetchDataByLastName(@RequestParam("lastname") String lastName){
        List<String> results = new ArrayList<>();

        for(Customer cust: repository.findByLastName(lastName)){
            results.add(cust.toString());
        }

        return results;
    }

    @RequestMapping(value = "/deletebyid", method = RequestMethod.DELETE)
    public String delete(@RequestParam("id") long id){
        Customer customer = repository.findById(id).orElseThrow();
        repository.delete(customer);
        return "done";
    }

    @RequestMapping(value = "/deleteall" , method = RequestMethod.DELETE)
    public String deleteAll(){
        repository.deleteAll();
        return "done";
    }
}

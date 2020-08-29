package io.homeproject.springbbotdemo.api;

import io.homeproject.springbbotdemo.ReqObjects.EmloyeeReqEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


/*
* TODO : Future enhancements
*  1. Secure --- Spring security,OAUTH2 protocol
*  2. Swagger documentaion
* */
@RestController
@RequestMapping("/api/v1")
public class TestController
{
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/data")
    public String getData(){
        return "Data is here..!";
    }

    @GetMapping("/data/{id}")
    public String getById(@PathVariable("id") String id){
        logger.info("Id recieved ---- {}",id);
        return "Done";
    }

    @PostMapping("/create")
    public String create(@RequestBody EmloyeeReqEntity entity){
        logger.info("Reuest body recieved --- {}",entity);
        return "true";
    }

    /*TODO: Put and Delete API*/
}

package com.titan.rest;

import com.titan.service.coin.AddInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author syline on 2018/5/3
 * @version 1.0
 */
@RestController
public class RunControl {

    @Autowired
    private AddInfo addInfo;


    @RequestMapping(value = "/getHis/{coin}/{begTime}", method = RequestMethod.GET)
    public String getHis(@PathVariable String coin, @PathVariable String begTime) {

        addInfo.addXvgInfo(coin);

        return "ok";
    }

}

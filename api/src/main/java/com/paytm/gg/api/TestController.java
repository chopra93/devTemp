package com.paytm.gg.api;

import com.paytm.gg.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chopra
 * 05/03/18
 */
@RestController
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/v1/test", method = RequestMethod.GET)
    public ResponseEntity testFunction(){
        testService.testFunction();
        return ResponseEntity.ok("ok");
    }
}

package com.paytm.gg.service.impl;

import com.paytm.gg.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * @author chopra
 * 05/03/18
 */
@Service
public class TestServiceImpl implements ITestService {

    @Override
    public void testFunction() {
        System.out.println("Test Function in service");
        return;
    }
}

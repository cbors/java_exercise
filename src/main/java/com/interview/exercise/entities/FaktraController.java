package com.interview.exercise.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FaktraController {

    @Autowired
    private  FakturaSerwis fakturaSerwis;
}

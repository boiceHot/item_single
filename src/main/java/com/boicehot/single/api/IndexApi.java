package com.boicehot.single.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexApi {
    @RequestMapping
    public void index(){}
}
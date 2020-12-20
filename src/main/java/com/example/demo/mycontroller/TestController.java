package com.example.demo.mycontroller;

import com.example.demo.tms.GetTile;
import com.example.demo.wms.GetCapabilities;
import com.example.demo.wms.GetMap;
import com.example.demo.wms.GetMapProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class TestController {
    @Autowired
    GetMap getMap;

    @Autowired
    GetCapabilities getCapabilities;

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return getMap.getService();
    }

    @GetMapping("/hello1")
    @ResponseBody
    public String sayHello1(){
        return getCapabilities.getVersion();
    }
}

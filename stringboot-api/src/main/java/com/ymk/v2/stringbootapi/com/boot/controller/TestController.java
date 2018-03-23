package com.ymk.v2.stringbootapi.com.boot.controller;

import com.ymk.v2.stringbootutils.com.boot.utils.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * Hello word
     *@return
     * */
    @RequestMapping("/index")
    public String index(){
        String name = "Hello word 啦啦啦";
        Date date = DateUtils.getCurDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return name + df.format(date);
    }
}

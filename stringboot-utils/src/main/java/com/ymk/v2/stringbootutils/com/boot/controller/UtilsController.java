package com.ymk.v2.stringbootutils.com.boot.controller;

import com.ymk.v2.stringbootutils.com.boot.utils.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/test")
public class UtilsController {

    /**
     * 获取当前时间
     * @return
     */
    @RequestMapping("date")
    public String Date(){
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD");
        return df.format(DateUtils.getCurDate());
    }

}

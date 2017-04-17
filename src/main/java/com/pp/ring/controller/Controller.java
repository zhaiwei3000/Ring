package com.pp.ring.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pp.ring.dao.Test1Dao;
import com.pp.ring.model.Test1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by zhaiwei on 2017/4/17.
 */
@org.springframework.stereotype.Controller
public class Controller {

    @Resource(name="test1Dao")
    private Test1Dao test1Dao;

    @RequestMapping(value = "/test.do" ,method = {RequestMethod.POST,RequestMethod.GET})
    public String test1(HttpServletRequest request, HttpServletResponse response){
        Test1 test1 = new Test1();
        List<Test1> list = test1Dao.selectTest1(test1);

        Gson gson = new GsonBuilder() .setDateFormat("yyyy-MM-dd HH:mm:ss") .create();
        System.out.println(gson.toJson(list));

        PrintWriter pw = null;
        try {
            pw = response.getWriter();

            pw.write(gson.toJson(list));



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(pw != null){
                pw.flush();
                pw.close();
            }
        }

        return null;
    }

    public Test1Dao getTest1Dao() {
        return test1Dao;
    }

    public void setTest1Dao(Test1Dao test1Dao) {
        this.test1Dao = test1Dao;
    }

//String
}

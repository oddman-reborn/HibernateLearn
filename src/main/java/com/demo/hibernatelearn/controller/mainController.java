/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.hibernatelearn.controller;

import com.demo.hibernatelearn.entity.markSemister;
import com.demo.hibernatelearn.entity.studentInfo;
import com.demo.hibernatelearn.entity.studentMarks;
import com.demo.hibernatelearn.model.studentModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
    
    @RequestMapping(value={"/","index"})
    public String index()
    {
        return "index";
    }
    
    @RequestMapping(value="newStudent")
    public String addStudentForm()
    {
        return "studentNew";
    }
    
    @RequestMapping(value="addStudent")
    public String addStudent(@ModelAttribute(value="studentInfo") studentInfo student )
    {
        studentModel stdModel=new studentModel();
        boolean done=stdModel.insertStudent(student);
        if(done==true)
            return"success";
        else
            return "error";
    }
    
    @RequestMapping(value="insertMarks")
    public String viewForm()
    {
        return "studentMarks";
    }
    
    @RequestMapping(value="insertMark",method = RequestMethod.POST)//one to one implementation
    public String insertData(@ModelAttribute(value="markSemister") markSemister mark,@RequestParam(value="gpa") float gpa)
    {
        
        
        studentMarks sm=new studentMarks();
        System.out.println(gpa);
        sm.setGpa(gpa);
        mark.setStdMark(sm);
        
        studentModel smodel=new studentModel();
        boolean done=smodel.insertMark(mark);
        
        if(done==true)
            return "success";
        else
            return "error";
    }
    
    @RequestMapping(value="crud",method=RequestMethod.GET)
    public String crud(Model m)
    {
        studentModel smodel=new studentModel();
        List<studentInfo> sList=new ArrayList();
        sList=smodel.getAllStudent();
        m.addAttribute("sList", sList);
        return "hibernateCrud";
    }
    
    @RequestMapping(value="getStudent",method=RequestMethod.GET)
    public String getStudent(@RequestParam(value="id") long id,Model m)
    {
        studentModel smodel=new studentModel();
        studentInfo std=smodel.getStudent(id);
        m.addAttribute("std", std);
        return "viewStudent";
    }
    
    @RequestMapping(value="deleteStudent",method=RequestMethod.GET)
    public String deleteStudent(@RequestParam(value="id") long id)
    {
        studentModel smodel=new studentModel();
        smodel.deleteStudent(id);
        return "redirCRUD";
    }
    
    
}

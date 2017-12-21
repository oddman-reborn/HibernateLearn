/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.hibernatelearn.model;

import com.demo.hibernatelearn.entity.markSemister;
import com.demo.hibernatelearn.entity.studentInfo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Md. Monirul Islam
 */
public class studentModel {
    
    SessionFactory sf=HibernateUtil.getSessionFactory();
    public boolean insertStudent(studentInfo student)
    {
        boolean done=false;
        Session session=sf.openSession();//opens DB connection
        try{
            
            session.beginTransaction();//logical transaction for CRUD operation
            session.save(student);
            session.getTransaction().commit();//only when we are changing value in DB we need commit
            done=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();//prints the total error report
            session.getTransaction().rollback();
        }
        session.close();
        return done;
    }
    
    public boolean insertMark(markSemister ms)
    {
        boolean res=false;
        
        Session session=sf.openSession();
        try{
            session.beginTransaction();
            session.save(ms);
            session.getTransaction().commit();
            res=true;
        }catch(Exception e)
        {
            session.getTransaction().rollback();
        }
        session.close();
        return res;
    }
    
    public List<studentInfo> getAllStudent()
    {
        List<studentInfo> sList=new ArrayList();
        
        Session session=sf.openSession();
        try{
            session.beginTransaction();
            Criteria c=session.createCriteria(studentInfo.class);
            session.getTransaction();
            sList=c.list();
            
        }catch(Exception e)
        {
            session.getTransaction().rollback();
        }
        session.close();
        return sList;
    }
    
    public void deleteStudent(long id)
    {
        Session session=sf.openSession();
        try{
            session.beginTransaction();
            studentInfo std=(studentInfo)session.get(studentInfo.class,id);
            session.delete(std);
            session.getTransaction().commit();
        }catch(Exception e)
        {
            session.getTransaction().rollback();
        }
        session.close();
    }
    
    public studentInfo getStudent(long id)
    {
        studentInfo std=new studentInfo();
        
        Session session=sf.openSession();
        try
        {
            session.beginTransaction();
            std=(studentInfo) session.get(studentInfo.class, id);
            session.getTransaction();
        }catch(Exception e)
        {
            session.getTransaction().rollback();
        }
        session.close();
        return std;
    }
}

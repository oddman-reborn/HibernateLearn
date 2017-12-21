/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.hibernatelearn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Monirul Islam
 */
@Entity
@Table(name="STUDENTMARK")
public class studentMarks {
    
    
    private long id;
    private float gpa;

    @Id
    @GeneratedValue
    @Column(name="mark_pk")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    /* 
    //For Bi-Directional mapping
    private markSemister msObj;

    @OneToOne(mappedBy="stdMark",cascade=CascadeType.ALL)
    public markSemister getMsObj() {
        return msObj;
    }

    public void setMsObj(markSemister msObj) {
        this.msObj = msObj;
    }
    */
}

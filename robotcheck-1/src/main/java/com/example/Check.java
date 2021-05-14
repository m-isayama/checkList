package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`check`")
public class Check {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String point;
    private Long result;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getPoint() {
        return point;
    }
    public void setPoint(String point) {
        this.point = point;
    }
    
    public Long getResult() {
        return result;
    }
    public void setResult(Long result) {
        this.result = result;
    }
    
}
    
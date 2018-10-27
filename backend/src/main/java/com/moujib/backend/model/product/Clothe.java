package com.moujib.backend.model.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Clothe extends Product implements Serializable {

    private String sex;

    private String size;

    private String clotheType;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getClotheType() {
        return clotheType;
    }

    public void setClotheType(String clotheType) {
        this.clotheType = clotheType;
    }
}
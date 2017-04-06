package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/6.
 */

public class Province extends DataSupport {
    private int id;
    private String proviceName;
    private int prviceCode;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getPrviceCode() {
        return prviceCode;
    }

    public void setPrviceCode(int prviceCode) {
        this.prviceCode = prviceCode;
    }
}

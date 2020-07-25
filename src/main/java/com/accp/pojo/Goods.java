package com.accp.pojo;

import java.util.Date;

public class Goods {
    private String goodsid;

    private String goodsname;

    private String zgys;

    private String type;

    private Integer num;

    private Double price;

    private Double sumprice;

    private Double bzjj;

    private Double saleprice;

    private Date lrtime;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getZgys() {
        return zgys;
    }

    public void setZgys(String zgys) {
        this.zgys = zgys == null ? null : zgys.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSumprice() {
        return sumprice;
    }

    public void setSumprice(Double sumprice) {
        this.sumprice = sumprice;
    }

    public Double getBzjj() {
        return bzjj;
    }

    public void setBzjj(Double bzjj) {
        this.bzjj = bzjj;
    }

    public Double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Double saleprice) {
        this.saleprice = saleprice;
    }

    public Date getLrtime() {
        return lrtime;
    }

    public void setLrtime(Date lrtime) {
        this.lrtime = lrtime;
    }
}
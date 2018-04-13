package com.example.lx.guoyi_chengren.energy.bean;

/**
 * Created by lx on 2018/4/13.
 */

public class Titlte {

    private String titlte1;
    private String titlte2;
    private int imageview;

    public Titlte() {
    }

    public Titlte(String titlte1, String titlte2, int imageview) {
        this.titlte1 = titlte1;
        this.titlte2 = titlte2;
        this.imageview = imageview;
    }

    public String getTitlte1() {
        return titlte1;
    }

    public void setTitlte1(String titlte1) {
        this.titlte1 = titlte1;
    }

    public String getTitlte2() {
        return titlte2;
    }

    public void setTitlte2(String titlte2) {
        this.titlte2 = titlte2;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }
}

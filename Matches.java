/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Matches implements Serializable, Comparable<Matches> {
    private Date time;
    private String ha, type;
    private String opponent;
    private int pts, ptsO;
    private String teamXI, subs, goals;
    private String res;

    public Matches(String time, String ha, String type, String opponent, int pts, int ptsO, String teamXI, String subs, String goals, String res) 
            throws ParseException {
        this.time = new SimpleDateFormat("dd.MM.yyyy").parse(time);
        this.ha = ha;
        this.type = type;
        this.opponent = opponent;
        this.pts = pts;
        this.ptsO = ptsO;
        this.teamXI = teamXI;
        this.subs = subs;
        this.goals = goals;
        this.res = res;
    }

    public String getTime() {
        return new SimpleDateFormat("dd.MM.yyyy").format(time);
    }

    public void setTime(String time) throws ParseException {
        this.time = new SimpleDateFormat("dd.MM.yyyy").parse(time);
    }

    public String getHa() {
        return ha;
    }

    public void setHa(String ha) {
        this.ha = ha;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public int getPtsO() {
        return ptsO;
    }

    public void setPtsO(int ptsO) {
        this.ptsO = ptsO;
    }

    public String getTeamXI() {
        return teamXI;
    }

    public void setTeamXI(String teamXI) {
        this.teamXI = teamXI;
    }

    public String getSubs() {
        return subs;
    }

    public void setSubs(String subs) {
        this.subs = subs;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    @Override
    public int compareTo(Matches o) {
        return this.time.compareTo(o.time);
    }
}
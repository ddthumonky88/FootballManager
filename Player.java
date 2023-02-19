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
public class Player implements Serializable, Comparable<Player> {
    private int number;
    private String name, pos;
    private Date DoB;
    private String nat;
    private int height, weight, played, goals, ok;

    public Player(int number, String name, String pos, String DoB, String nat, int height, int weight, int played, int goals, int ok) throws ParseException {
        this.number = number;
        this.name = name;
        this.pos = pos;
        this.DoB = new SimpleDateFormat("dd.MM.yyyy").parse(DoB);
        this.nat = nat;
        this.height = height;
        this.weight = weight;
        this.played = played;
        this.goals = goals;
        this.ok = ok;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String position) {
        this.pos = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return (new Date().getYear() - DoB.getYear());
    }
    
    public String getDoB() {
        return new SimpleDateFormat("dd.MM.yyyy").format(DoB);
    }

    public void setDoB(String DoB) throws ParseException{
        this.DoB = new SimpleDateFormat("dd.MM.yyyy").parse(DoB);
    }
    
    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPlayed() {
        return played;
    }

    public int getGoals() {
        return goals;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    @Override
    public int compareTo(Player o) {
        if(this.number > o.number) return 1;
        return -1;
    }
}
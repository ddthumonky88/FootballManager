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
public class Club implements Serializable {
    private String clubName, coach, stadium, teamXI;
    private Date founded;
    private int next;
    
    public Club(){
        this.clubName = " ";
        this.coach = " ";
        this.stadium = " ";
        this.teamXI = " ";
        this.founded = new Date();
        this.next = 0;
    }
    
    public Club(String clubName, String coach, String stadium, String teamXI, String founded, int next) throws ParseException {
        this.clubName = clubName;
        this.coach = coach;
        this.stadium = stadium;
        this.teamXI = teamXI;
        this.founded = new SimpleDateFormat("dd/MM/yyyy").parse(founded);
        this.next = 0;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
    
    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getTeamXI() {
        return teamXI;
    }

    public void setTeamXI(String teamXI) {
        this.teamXI = teamXI;
    }

    public String getFounded() {
        return new SimpleDateFormat("dd/MM/yyyy").format(founded);
    }

    public void setFounded(String founded) throws ParseException {
        this.founded = new SimpleDateFormat("dd/MM/yyyy").parse(founded);
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}

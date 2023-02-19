/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */

public class Ranking implements Serializable, Comparable<Ranking>{
    private String player;
    private int value;

    public Ranking(String player, int value) {
        this.player = player;
        this.value = value;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Ranking o) {
        if(this.value < o.value) return 1;
        return -1;
    }
}

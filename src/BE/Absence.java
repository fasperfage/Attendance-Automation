/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.io.Serializable;

/**
 *
 * @author Kasper
 */
public class Absence implements Serializable {

    private final int monday;
    private final int tuesday;
    private final int wednesday;
    private final int thursday;
    private final int friday;
    private int totalAbsence;

    /**
     * Constructor for the Absence class
     *
     * @param monday
     * @param tuesday
     * @param wednesday
     * @param thursday
     * @param friday
     */
    public Absence(int monday, int tuesday, int wednesday, int thursday, int friday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
    }

    /**
     * calculates absence percentage by adding the value of Monday, Tuesday,
     * Wednesday, Thursday, Friday and dividing it by 5
     *
     * @return
     */
    public int getTotalAbsence() {
        return totalAbsence = (monday + tuesday + wednesday + thursday + friday) / 5;
    }

    /**
     * Gets the value of Monday
     *
     * @return
     */
    public int getMonday() {
        return monday;
    }

    /**
     * Gets the value of Tuesday
     *
     * @return
     */
    public int getTuesday() {
        return tuesday;
    }

    /**
     * Gets the value of Wednesday
     *
     * @return
     */
    public int getWednesday() {
        return wednesday;
    }

    /**
     * Gets the value of Thursday
     *
     * @return
     */
    public int getThursday() {
        return thursday;
    }

    /**
     * Gets the value of Friday
     *
     * @return
     */
    public int getFriday() {
        return friday;
    }
}

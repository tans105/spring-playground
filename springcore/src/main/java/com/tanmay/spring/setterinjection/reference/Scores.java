package com.tanmay.spring.setterinjection.reference;

/**
 * @author Tanmay
 * @date 21/09/19
 **/
public class Scores {
    private Double maths;
    private Double physics;
    private Double chemistry;

    public Double getMaths() {
        return maths;
    }

    public void setMaths(Double maths) {
        this.maths = maths;
    }

    public Double getPhysics() {
        return physics;
    }

    public void setPhysics(Double physics) {
        this.physics = physics;
    }

    public Double getChemistry() {
        return chemistry;
    }

    public void setChemistry(Double chemistry) {
        this.chemistry = chemistry;
    }

    public String toString() {
        return "MATHS " + this.getMaths() + " PHYSICS " + this.getPhysics() + " CHEMISTRY " + this.getChemistry();
    }
}

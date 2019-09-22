package com.tanmay.spring.setterinjection.reference;

/**
 * @author Tanmay
 * @date 21/09/19
 **/
public class Student {
    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    private Scores scores;
}

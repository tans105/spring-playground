package com.tanmay.spring.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * @author Tanmay
 * @date 29/09/19
 **/
public class Prescription {

    private int id;
    private String patientName;

    public int getId() {
        return id;
    }

    @Required //always them on setter method
    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }

    private List<String> medicines;

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", medicines=" + medicines +
                '}';
    }
}

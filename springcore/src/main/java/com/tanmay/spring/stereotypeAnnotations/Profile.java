package com.tanmay.spring.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
    @Value("Software Developer")
    private String title;

    @Value("CA Technologies")
    private String company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

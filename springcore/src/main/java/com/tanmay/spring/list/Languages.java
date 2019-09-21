package com.tanmay.spring.list;

import java.util.Properties;

/**
 * @author Tanmay
 * @date 21/09/19
 **/
public class Languages {
    public Properties getCountriesAndLanguages() {
        return countriesAndLanguages;
    }

    public void setCountriesAndLanguages(Properties countriesAndLanguages) {
        this.countriesAndLanguages = countriesAndLanguages;
    }

    Properties countriesAndLanguages;
}

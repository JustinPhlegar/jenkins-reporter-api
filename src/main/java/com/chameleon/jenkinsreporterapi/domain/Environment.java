package com.chameleon.jenkinsreporterapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Environment {

    @Id
    @GeneratedValue
    private Long id;
    private String environment_name;

    public String getEnvironmentName() {
        return environment_name;
    }

    public void setEnvironmentName(String environment_name) {
        this.environment_name = environment_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

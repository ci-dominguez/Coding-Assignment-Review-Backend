package com.ci_dominguez.CodeReviewBackend.domain;

import jakarta.persistence.*;

@Entity
@Table(name="assignments")
public class Assignment {

    /////////////////////Instance Variables/////////////////////
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String githubUrl;
    private String branch;
    private String codeReviewUrl;
    @ManyToOne(optional = false)
    private User user;
    //TODO: private User assignedTo;

    /////////////////////Getters & Setters/////////////////////
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCodeReviewUrl() {
        return codeReviewUrl;
    }

    public void setCodeReviewUrl(String codeReviewUrl) {
        this.codeReviewUrl = codeReviewUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
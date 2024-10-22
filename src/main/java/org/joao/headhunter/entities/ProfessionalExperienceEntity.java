package org.joao.headhunter.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ProfessionalExperienceEntity")
public class ProfessionalExperienceEntity extends BaseEntity {

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "jobPosition")
    private String jobPosition;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "candidateId", nullable = false)
    private CandidateEntity candidateEntity;

    public ProfessionalExperienceEntity() {}

    public ProfessionalExperienceEntity(String companyName, String jobPosition, String description) {
        super();
        this.companyName = companyName;
        this.jobPosition = jobPosition;
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

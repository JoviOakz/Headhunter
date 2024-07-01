package org.joao.headhunter.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "JobOpportunityEntity")
public class JobOpportunityEntity extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "requirements")
    private String requirements;

    @Column(name = "extraRequirements")
    private String extraRequirements;

    @OneToMany(mappedBy = "jobOpportunityEntity")
    private Set<CandidateJobOpportunityEntity> candidateJobOpportunityEntities;

    public JobOpportunityEntity() {}

    public JobOpportunityEntity(String title, String description, String requirements, String extraRequirements) {
        super();
        this.title = title;
        this.description = description;
        this.requirements = requirements;
        this.extraRequirements = extraRequirements;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getExtraRequirements() {
        return extraRequirements;
    }

    public void setExtraRequirements(String extraRequirements) {
        this.extraRequirements = extraRequirements;
    }
}

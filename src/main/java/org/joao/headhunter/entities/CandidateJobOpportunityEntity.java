package org.joao.headhunter.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CandidateJobOpportunityEntity")
public class CandidateJobOpportunityEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "candidateId", nullable = false)
    private CandidateEntity candidateEntity;

    @ManyToOne
    @JoinColumn(name = "jobOpportunityId", nullable = false)
    private JobOpportunityEntity jobOpportunityEntity;
}

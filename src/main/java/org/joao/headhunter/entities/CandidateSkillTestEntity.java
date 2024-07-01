package org.joao.headhunter.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CandidateSkillTestEntity")
public class CandidateSkillTestEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "candidateId", nullable = false)
    private CandidateEntity candidateEntity;

    @ManyToOne
    @JoinColumn(name = "skillTestId", nullable = false)
    private SkillTestEntity skillTestEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "feedbackId", referencedColumnName = "id")
    private FeedbackEntity feedbackEntity;
}

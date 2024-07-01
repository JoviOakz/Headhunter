package org.joao.headhunter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CandidateSkillEntity")
public class CandidateSkillEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "candidateId", nullable = false)
    private CandidateEntity candidateEntity;

    @ManyToOne
    @JoinColumn(name = "skillId", nullable = false)
    private SkillEntity skillEntity;

    public CandidateEntity getCandidateEntity() {
        return candidateEntity;
    }

    public void setCandidateEntity(CandidateEntity candidateEntity) {
        this.candidateEntity = candidateEntity;
    }

    public SkillEntity getSkillEntity() {
        return skillEntity;
    }

    public void setSkillEntity(SkillEntity skillEntity) {
        this.skillEntity = skillEntity;
    }
}

package org.joao.headhunter.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "CandidateEntity")
public class CandidateEntity extends BaseEntity {

    @Column(name = "personalDescription")
    private String personalDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "candidateEntity")
    private Set<CandidateSkillEntity> candidateSkills;

    public CandidateEntity() {}

    public CandidateEntity(String personalDescription) {
        super();
        this.personalDescription = personalDescription;
    }

    public String getPersonalDescription() {
        return personalDescription;
    }

    public void setPersonalDescription(String personalDescription) {
        this.personalDescription = personalDescription;
    }
}

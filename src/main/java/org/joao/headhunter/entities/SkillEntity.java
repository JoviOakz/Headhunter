package org.joao.headhunter.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "SkillEntity")
public class SkillEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "skillLevel")
    private String skillLevel;

    @OneToMany(mappedBy = "skillEntity")
    private Set<CandidateSkillEntity> skillCandidates;

    public SkillEntity() {}

    public SkillEntity(String name, String skillLevel) {
        super();
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
}

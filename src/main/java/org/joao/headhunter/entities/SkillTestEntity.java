package org.joao.headhunter.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SkillTestEntity")
public class SkillTestEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "testType")
    private Boolean testType;

    @Column(name = "result")
    private Integer result;

//    @OneToMany AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    public SkillTestEntity() {}

    public SkillTestEntity(String name, String description, Boolean testType, Integer result) {
        super();
        this.name = name;
        this.description = description;
        this.testType = testType;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getTestType() {
        return testType;
    }

    public void setTestType(Boolean testType) {
        this.testType = testType;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}

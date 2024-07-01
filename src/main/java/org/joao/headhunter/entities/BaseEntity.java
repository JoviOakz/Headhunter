package org.joao.headhunter.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@MappedSuperclass
public class BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CreatedAt")
    private Timestamp createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UpdatedAt")
    private Timestamp updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DeletedAt")
    private Timestamp deletedAt;

    public BaseEntity() {
        this.createdAt = new Timestamp(System.currentTimeMillis());
        this.updatedAt = new Timestamp(System.currentTimeMillis());
    }

    public void updateEntity() {
        this.updatedAt = new Timestamp(System.currentTimeMillis());
    }

    public void deleteEntity() {
        this.deletedAt = new Timestamp(System.currentTimeMillis());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }
}

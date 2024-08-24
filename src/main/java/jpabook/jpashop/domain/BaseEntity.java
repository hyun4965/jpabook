package jpabook.jpashop.domain;


import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    private String createdBy;
    private LocalDateTime createdDate;

    private String lastmodifiedBy;
    private LocalDateTime lastmodifiedDate;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastmodifiedBy() {
        return lastmodifiedBy;
    }

    public void setLastmodifiedBy(String lastmodifiedBy) {
        this.lastmodifiedBy = lastmodifiedBy;
    }

    public LocalDateTime getLastmodifiedDate() {
        return lastmodifiedDate;
    }

    public void setLastmodifiedDate(LocalDateTime lastmodifiedDate) {
        this.lastmodifiedDate = lastmodifiedDate;
    }
}

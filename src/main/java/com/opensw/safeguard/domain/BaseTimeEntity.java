package com.opensw.safeguard.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
    // 등록일, 수정일을 공용으로 맵핑하기 위한 엔티티

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate; // 등록일

    @LastModifiedDate
    private LocalDateTime lastModifiedDate; // 수정일
}

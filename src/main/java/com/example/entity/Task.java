package com.example.entity;

import com.example.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tasks")
@NoArgsConstructor
@Data
@Where(clause = "is_deleted = false")
public class Task extends BaseEntity{

    private String taskSubject;
    private String taskDetail;

    @Enumerated(EnumType.STRING)
    private Status taskStatus;

    @Column(columnDefinition = "DATE")
    private LocalDate assignedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User assignedEmployee;

    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;

}

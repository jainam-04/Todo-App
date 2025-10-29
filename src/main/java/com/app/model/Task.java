package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    private long id;
    private String title;
    private boolean completed;
}

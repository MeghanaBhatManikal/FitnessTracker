package com.fitness.tracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tracker_user")
public class TrackerUser {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}

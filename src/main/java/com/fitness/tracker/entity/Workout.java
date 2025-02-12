package com.fitness.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "workout")
public class Workout {
    @Id
    private long id;
    private WorkoutType workoutType;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    private long userId;
}

enum WorkoutType{
    WALK, HIKE, RUN, YOGA, SWIM;
}




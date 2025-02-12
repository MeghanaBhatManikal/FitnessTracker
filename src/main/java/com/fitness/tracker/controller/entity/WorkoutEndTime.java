package com.fitness.tracker.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class WorkoutEndTime {
    private long id;
    private LocalDateTime endTime;
}

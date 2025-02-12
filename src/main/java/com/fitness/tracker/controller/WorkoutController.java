package com.fitness.tracker.controller;

import com.electronwill.nightconfig.core.conversion.Path;
import com.fitness.tracker.controller.entity.WorkoutEndTime;
import com.fitness.tracker.controller.entity.WorkoutUserId;
import com.fitness.tracker.entity.TrackerUser;
import com.fitness.tracker.entity.Workout;
import com.fitness.tracker.services.WorkoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workout/v1")
@RequiredArgsConstructor
@Validated
public class WorkoutController {
    private final WorkoutService workoutService;
    @PostMapping("/")
    public ResponseEntity<Workout> saveWorkout(@RequestBody Workout workout)
    {
        return ResponseEntity.ok().body(workoutService.saveWorkout(workout));
    }
//    @GetMapping("/")
//    public ResponseEntity<List<Workout>> getAllWorkoutsByUser(@RequestBody WorkoutUserId userId){
//        Optional<List<Workout>> workoutListOpt = workoutService.getAllWorkoutsByUser(userId.getUserId());
//        if(workoutListOpt.isPresent()){
//            return ResponseEntity.ok().body(workoutListOpt.get());
//        }else{
//            return ResponseEntity.notFound().build();
//        }
//    }
    @PatchMapping("/endTIme")
    public ResponseEntity<Workout> updateWorkoutEndtime(@RequestBody WorkoutEndTime workoutEndTime){
        Optional<Workout> workoutopt = workoutService.updateWorkoutEndTime(workoutEndTime.getEndTime(), workoutEndTime.getId());

        if(workoutopt.isPresent())
            return ResponseEntity.ok().body(workoutopt.get());
        else{
            return ResponseEntity.notFound().build();
        }
    }
}

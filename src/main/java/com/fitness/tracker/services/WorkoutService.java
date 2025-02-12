package com.fitness.tracker.services;

import com.fitness.tracker.entity.Workout;
import com.fitness.tracker.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class WorkoutService {
    private final WorkoutRepository workoutRepo;

    public Workout saveWorkout(Workout workout){
        Workout savedWorkout = workoutRepo.save(workout);
        log.info("workout with id: {} saved successfully", savedWorkout.getId());
        return savedWorkout;
    }

//    public Optional<List<Workout>> getAllWorkoutsByUser(long userId){
//        Optional<List<Workout>> workoutListOpt = workoutRepo.findAllById(userId)
//        if(workoutListOpt.isPresent()){
//            Workout workout = workoutListOpt.get();
//            return Optional.of(workout);
//        }else {
//            return Optional.empty();
//        }
//    }

    public Optional<Workout> updateWorkoutEndTime(LocalDateTime endTime, long id){
        Optional<Workout> workoutOpt = workoutRepo.findById(id);
        if(workoutOpt.isPresent()){
            Workout workout = workoutOpt.get();
            workout.setEndTime(endTime);
            workoutRepo.save(workout);
            return Optional.of(workout);
        }else {
            return Optional.empty();
        }
    }



}

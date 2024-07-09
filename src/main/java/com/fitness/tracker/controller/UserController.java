package com.fitness.tracker.controller;

import com.fitness.tracker.entity.TrackerUser;
import com.fitness.tracker.services.TrackerUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trackeruser/v1")
@RequiredArgsConstructor
@Validated
public class UserController {
    private final TrackerUserService trackerUserervice;
    @GetMapping("/")
    public ResponseEntity<List<TrackerUser>> getAllUsers(){
        return ResponseEntity.ok().body(trackerUserervice.getAllUsers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<TrackerUser> getUserById(@PathVariable("id") Long id){
        Optional<TrackerUser> trackerUserOpt = trackerUserervice.getUserById(id);

        if(trackerUserOpt.isPresent())
            return ResponseEntity.ok().body(trackerUserOpt.get());
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public ResponseEntity<TrackerUser> saveUser(@RequestBody TrackerUser trackerUser)
    {
        return ResponseEntity.ok().body(trackerUserervice.saveUser(trackerUser));
    }

}

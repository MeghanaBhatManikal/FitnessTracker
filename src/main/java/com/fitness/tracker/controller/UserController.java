package com.fitness.tracker.controller;

import com.fitness.tracker.entity.TrackerUser;
import com.fitness.tracker.services.TrackerUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PostMapping("/")
    public ResponseEntity<TrackerUser> saveUser(@RequestBody TrackerUser trackerUser)
    {
        return ResponseEntity.ok().body(trackerUserervice.saveUser(trackerUser));
    }

}

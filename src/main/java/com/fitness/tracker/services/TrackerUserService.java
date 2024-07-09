package com.fitness.tracker.services;


import com.fitness.tracker.entity.TrackerUser;
import com.fitness.tracker.repository.TrackerUserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TrackerUserService {

    private final TrackerUserRepository trackerUserRepo;

    public TrackerUser saveUser(TrackerUser trackerUser){
        TrackerUser savedUser = trackerUserRepo.save(trackerUser);
        log.info("User with id: {} saved successfully", savedUser.getId());
        return savedUser;

    }
    public List<TrackerUser> getAllUsers(){
        return trackerUserRepo.findAll();
    }

    public Optional<TrackerUser> getUserById(Long id){

        return trackerUserRepo.findById(id);
    }
}

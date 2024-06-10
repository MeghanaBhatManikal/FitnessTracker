package com.fitness.tracker.repository;

import com.fitness.tracker.entity.TrackerUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackerUserRepository extends JpaRepository<TrackerUser, Long> {
}

package com.sujan.task.repo;

import com.sujan.task.model.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CameraRepo extends JpaRepository<Camera ,Integer> {
}

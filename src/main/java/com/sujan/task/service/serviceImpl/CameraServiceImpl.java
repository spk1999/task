package com.sujan.task.service.serviceImpl;

import com.sujan.task.model.Camera;
import com.sujan.task.repo.CameraRepo;
import com.sujan.task.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CameraServiceImpl implements CameraService {

  private final CameraRepo cameraRepo;

    @Autowired
  public CameraServiceImpl(CameraRepo cameraRepo)
  {
      this.cameraRepo=cameraRepo;
  }


    @Override
    public List<Camera> getCameras() {
        return cameraRepo.findAll();
    }

    @Transactional
    @Override
    public Camera addCamera(Camera camera) {
        return cameraRepo.saveAndFlush(camera);
    }

    @Transactional
    @Override
    public Camera updateCamera(Camera camera) {
        return cameraRepo.saveAndFlush(camera);
    }
}

package com.sujan.task.service;

import com.sujan.task.model.Camera;

import java.util.List;

public interface CameraService {

    List<Camera> getCameras();
    Camera addCamera(Camera camera);
    Camera updateCamera(Camera camera);

}

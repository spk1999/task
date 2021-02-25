package com.sujan.task.controller;

import com.sujan.task.model.Camera;
import com.sujan.task.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camera")
public class CameraController {

    private final CameraService cameraService;

    @Autowired
    public CameraController(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    @GetMapping()
    public ResponseEntity<List<Camera>> getAllCameras()
    {
        return new ResponseEntity(cameraService.getCameras(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Camera> saveCamera(@RequestBody Camera camera)
    {
        return new ResponseEntity(cameraService.addCamera(camera),HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Camera> updateCamera(@RequestBody Camera camera)
    {
        return new ResponseEntity(cameraService.updateCamera(camera),HttpStatus.OK);
    }
}

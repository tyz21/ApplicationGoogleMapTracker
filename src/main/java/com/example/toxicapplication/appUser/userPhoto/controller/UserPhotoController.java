package com.example.toxicapplication.appUser.userPhoto.controller;

import com.example.toxicapplication.appUser.userPhoto.service.UserPhotoService;
import com.example.toxicapplication.exception.NoPhotoForProfileException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/images")
public class UserPhotoController {
    private final UserPhotoService userPhotoService;

    @GetMapping("/circle/{profileId}")
    public List<Long> getAllIdImageCircle(@PathVariable long profileId) throws NoPhotoForProfileException {
        return userPhotoService.getAllIdCircleImage(profileId);
    }
    @GetMapping("/rectangle/{profileId}")
    public List<Long> getAllIdImageRectangle(@PathVariable long profileId) throws NoPhotoForProfileException {
        return userPhotoService.getAllIdRectangleImage(profileId);
    }
    @GetMapping("/randomId")
    public long getRandomId() throws NoPhotoForProfileException {
        return userPhotoService.provideRandomIdPhotoUser();
    }
}
package com.tico.mypawday.walk.presentation.controller;

import com.tico.mypawday.walk.application.service.WalkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/walks")
@RequiredArgsConstructor
public class WalkController {
    
    private final WalkService walkService;
}
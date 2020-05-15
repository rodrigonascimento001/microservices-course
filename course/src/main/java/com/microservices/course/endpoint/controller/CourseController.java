package com.microservices.course.endpoint.controller;


import com.microservices.core.model.Course;
import com.microservices.course.endpoint.service.CourserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.*;

@RestController
@RequestMapping("v1/admin/course")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {
    private final CourserService courserService;

    @GetMapping(produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
        return new ResponseEntity<>(courserService.list(pageable), HttpStatus.OK);
    }
}

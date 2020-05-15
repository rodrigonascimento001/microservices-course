package com.microservices.core.repository;


import com.microservices.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {
}

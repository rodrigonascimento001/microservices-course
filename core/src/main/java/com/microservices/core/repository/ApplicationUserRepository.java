package com.microservices.core.repository;

import com.microservices.core.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser,Long> {
    ApplicationUser findByUsername(String username);
}

package com.project.web.volunteer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long>, IVolunteerRepository {
}

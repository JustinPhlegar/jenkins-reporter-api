package com.chameleon.jenkinsreporterapi.repository;

import com.chameleon.jenkinsreporterapi.domain.Environment;
import org.springframework.data.repository.CrudRepository;

public interface EnvironmentRepository  extends CrudRepository<Environment, Long> {
}

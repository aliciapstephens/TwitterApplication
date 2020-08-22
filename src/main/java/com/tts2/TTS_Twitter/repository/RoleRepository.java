package com.tts2.TTS_Twitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts2.TTS_Twitter.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByRole(String role);
}

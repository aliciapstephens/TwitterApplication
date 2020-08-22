package com.tts2.TTS_Twitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts2.TTS_Twitter.model.User;

public interface UserRepository extends CrudRepository <User,Long> {
	User findByUsername(String username);
}

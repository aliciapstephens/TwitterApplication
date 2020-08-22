package com.tts2.TTS_Twitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts2.TTS_Twitter.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
	public Tag findByPhrase(String phrase);
}

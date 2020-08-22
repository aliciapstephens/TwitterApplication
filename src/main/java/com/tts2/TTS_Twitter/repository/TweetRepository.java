package com.tts2.TTS_Twitter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts2.TTS_Twitter.model.Tweet;
import com.tts2.TTS_Twitter.model.User;

public interface TweetRepository extends CrudRepository<Tweet, Long> {
	List<Tweet> findAllByOrderByCreatedAtDesc();

	List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);

	List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);

	public List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);
}

package fi.solita.training.forum.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fi.solita.training.forum.model.Topic;

@Service
public class TopicService {

	@Transactional
	public TopicDto addTopic(TopicDto dto) {
		/*
		Topic topic = new Topic(dto.getTitle());
		topicDao.save(topic);
		return toTopicDto(topic);
		*/
		return null;
	}

	@Transactional(readOnly=true)
	public List<TopicDto> getAllTopics() {
		/*
		return topicDao.findAllOrdered()
			.stream()
			.map(t -> toTopicDto(t))
			.collect(Collectors.toList());
		*/
		return null;
	}

	private static TopicDto toTopicDto(Topic topic) {
		TopicDto dto = new TopicDto();
		dto.setId(topic.getId());
		dto.setTitle(topic.getTitle());
		dto.setMessageCount(topic.getMessageCount());
		return dto;
	}

}

package fi.solita.training.forum.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fi.solita.training.forum.dao.TopicDao;
import fi.solita.training.forum.model.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicDao topicDao;

	@Transactional
	public TopicDto addTopic(TopicDto dto) {
		Topic topic = new Topic(dto.getTitle());
		topicDao.save(topic);
		return toTopicDto(topic);
	}

	@Transactional
	public List<TopicDto> getAllTopics() {
		return topicDao.findAll()
			.stream()
			.map(t -> toTopicDto(t))
			.collect(Collectors.toList());
	}

	private static TopicDto toTopicDto(Topic topic) {
		TopicDto dto = new TopicDto();
		dto.setId(topic.getId());
		dto.setTitle(topic.getTitle());
		dto.setMessageCount(topic.getMessageCount());
		return dto;
	}

}

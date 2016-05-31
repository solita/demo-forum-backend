package fi.solita.training.forum.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TopicService {

	@Transactional
	public TopicDto addTopic(TopicDto dto) {
		/*
		Topic topic = new Topic(dto.getTitle())
		topicDao.save(topic);
		return toTopicDto(topic);
		*/
		return null;
	}

	@Transactional
	public List<TopicDto> getAllTopics() {
		/*
		List<TopicDto> result = new ArrayList<TopicDto>();
		for (Topic topic : topicDao.findAll()) {
			result.add(toTopicDto(topic));
		}
		return result;
		*/
		return null;
	}

	/*
	private TopicDto toTopicDto(Topic topic) {
		TopicDto dto = new TopicDto();
		dto.setId(topic.getId());
		dto.setTitle(topic.getTitle());
		dto.setMessageCount(topic.getMessageCount());
		return dto;
	}
	 */

}

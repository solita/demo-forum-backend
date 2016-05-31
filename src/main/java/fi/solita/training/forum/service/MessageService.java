package fi.solita.training.forum.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fi.solita.training.forum.dao.MessageDao;
import fi.solita.training.forum.dao.TopicDao;
import fi.solita.training.forum.model.Message;

@Service
public class MessageService {

	@Autowired
	private MessageDao messageDao;

	@Autowired
	private TopicDao topicDao;

	@Transactional(readOnly=true)
	public List<MessageDto> getMessagesForTopic(long topicId) {
		return messageDao.findByTopicIdOrderByCreateTimeAsc(topicId)
		    .stream()
		    .map(m -> toMessageDto(m))
		    .collect(Collectors.toList());
	}

	@Transactional
	public MessageDto addMessagesForTopic(long topicId, MessageDto dto) {
		Message message = new Message(dto.getContent(), topicDao.getOne(topicId));
		messageDao.save(message);
		return toMessageDto(message);
	}

	private static MessageDto toMessageDto(Message message) {
		MessageDto dto = new MessageDto();
		dto.setId(message.getId());
		dto.setCreateTime(message.getCreateTime());
		dto.setContent(message.getContent());
		return dto;
	}

}

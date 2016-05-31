package fi.solita.training.forum.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageService {

	@Transactional(readOnly=true)
	public List<MessageDto> getMessagesForTopic(long topicId) {
		/*
		return messageDao.findByTopicIdOrderByCreateTimeAsc(topicId)
		    .stream()
		    .map(m -> toMessageDto(m))
		    .collect(Collectors.toList());
		*/
		return null;
	}

	@Transactional
	public MessageDto addMessagesForTopic(long topicId, MessageDto dto) {
		/*
		Message message = new Message(dto.getContent(), topicDao.getOne(topicId));
		messageDao.save(message);
		return toMessageDto(message);
		*/
		return null;
	}

	/*
	private static MessageDto toMessageDto(Message message) {
		MessageDto dto = new MessageDto();
		dto.setId(message.getId());
		dto.setCreateTime(message.getCreateTime());
		dto.setContent(message.getContent());
		return dto;
	}
	*/

}

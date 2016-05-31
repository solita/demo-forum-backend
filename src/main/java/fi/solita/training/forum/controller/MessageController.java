package fi.solita.training.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.solita.training.forum.service.MessageDto;
import fi.solita.training.forum.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;

    @RequestMapping(value="/topic/{topicId}/message", method=RequestMethod.GET)
    public List<MessageDto> getMessage(@PathVariable long topicId) {
        return messageService.getMessagesForTopic(topicId);
    }

    @RequestMapping(value="/topic/{topicId}/message", method=RequestMethod.PUT)
    public MessageDto addMessage(@PathVariable long topicId, @RequestBody MessageDto dto) {
        return messageService.addMessagesForTopic(topicId, dto);
    }

}

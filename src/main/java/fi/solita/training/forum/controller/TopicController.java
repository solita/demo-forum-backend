package fi.solita.training.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.solita.training.forum.service.TopicDto;
import fi.solita.training.forum.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

    @RequestMapping(value="/topic", method=RequestMethod.GET)
    public List<TopicDto> getAllTopics() {
        return topicService.getAllTopics();
    }

	@RequestMapping(value="/topic", method=RequestMethod.POST)
	public TopicDto addTopic(@RequestBody TopicDto dto) {
		return topicService.addTopic(dto);
	}

}

package fi.solita.training.forum.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.solita.training.forum.model.Message;

public interface MessageDao extends JpaRepository<Message, Long> {

	List<Message> findByTopicIdOrderByCreateTimeAsc(long topicId);

}

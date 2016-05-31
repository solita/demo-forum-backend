package fi.solita.training.forum.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.solita.training.forum.model.Topic;

public interface TopicDao extends JpaRepository<Topic, Long> {

}

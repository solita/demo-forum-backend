package fi.solita.training.forum.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fi.solita.training.forum.model.Topic;

public interface TopicDao extends JpaRepository<Topic, Long> {

	@Query("SELECT t FROM Topic t ORDER BY t.id DESC")
	List<Topic> findAllOrdered();

}

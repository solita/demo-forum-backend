package fi.solita.training.forum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Formula;

@Entity
public class Topic {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	@Column(nullable=false, length=100)
	private String title;
	
	@Formula("(select count(*) from message m where m.topic=id)")
	private int messageCount = 0;
	
	public Topic(String title) {
		this.title = title;
	}

	Topic() { }

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getMessageCount() {
		return messageCount;
	}

}

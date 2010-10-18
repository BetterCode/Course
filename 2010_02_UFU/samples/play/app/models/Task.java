package models;

import java.util.Date;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public final class Task extends Model {

	public @Required
	String executor;
	public @Required
	String description;
	
	private Date started;
	private Date finished;

	private Task(String executor, String descriptio) {
		super();
		this.executor = executor;
		this.description = descriptio;
	}

	public void start() {
		started = new Date();
	}

	public boolean isStarted() {
		return started != null;
	}

	public String started_at() {
		return started.toString();
	}

	public void finish() {
		finished = new Date();
	}

	public boolean isFinished() {
		return finished != null;
	}

	public String finished_at() {
		return finished.toString();
	}
}

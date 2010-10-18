package controllers;

import models.Task;


public class Tasks extends CRUD {

	public static void start(Long id) {
		Task task = Task.findById(id);
		task.start();
		task.save();
		redirect("Tasks.list");
	}

	public static void finish(Long id) {
		Task task = Task.findById(id);
		task.finish();
		task.save();
		redirect("Tasks.list");
		
	}
	
	public static void a(){
		b("bbbbbb");
		
	}
	
	public static void b(String s ){
		renderJSON(s);
	}
}

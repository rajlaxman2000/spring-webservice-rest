package com.jersy.first;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import com.miniproj.service.*;
import com.student.dto.Student;


public class TodoResource {
  @Context
  UriInfo uriInfo;
  @Context
  Request request;
  String id;
  public TodoResource(UriInfo uriInfo, Request request, String id) {
    this.uriInfo = uriInfo;
    this.request = request;
    this.id = id;
  }
  
  //Application integration     
  @GET
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public Student getTodo() {
	  
	
	  StudentService studentService = (StudentService) SpringApplicationContext.getBean("studentService");
	  Student student = null;
	  try {
		   student = studentService.getStudentById(id);			
	  } catch (Exception e) {
		  throw new RuntimeException("GetStudent : with " + id +  " not found");
	  }	
	
    return student;
  }
  
  // for the browser
  @GET
  @Produces(MediaType.TEXT_XML)
  public Student getTodoHTML() {
	  StudentService studentService = (StudentService) SpringApplicationContext.getBean("studentService");
	  Student student = null;
	  try {
		   student = studentService.getStudentById(id);			
	  } catch (Exception e) {
		  throw new RuntimeException("GetStudent : with " + id +  " not found");
	  }	
	
    return student;
  }  
} 
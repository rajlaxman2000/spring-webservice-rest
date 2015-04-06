package com.miniproj.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.miniproj.service.StudentService;
import com.student.dto.Address;
import com.student.dto.Student;

@Controller
public class StudentController {
	
	@Autowired(required=true)
	@Qualifier("studentService")
	private StudentService studentService;

	/**
	 * This mapping is for static search page to take user search criteria
	 * @return
	 */
	@RequestMapping(value = "/search")
	public String searchPanel(){
		
		return "search";
	}
	
	/**
	 * This mapping is for static search page to take user search criteria
	 * @return
	 */
	@RequestMapping(value = "/restPage")
	public String restPage(){
		
		return "angrest";
	}
	
	/**
	 * This mapping will be called to search the student based on given criteria and it will return display view if student found else 
	 * will display student not found message 
	 * @param searchStr
	 * @param request
	 * @param response
	 * @return String
	 */		
	@RequestMapping(value="/restGetStudent/{id}", method = RequestMethod.GET,headers="Accept=*/*")
	public @ResponseBody Student searchRestStudent(@PathVariable String id){

		System.out.println("Serach String:: "+id);
			Student student =null;
			
			try {
				student  = studentService.getStudentById(id);
			} catch (Exception e) {
				throw new AppException(e.getMessage());				
			}
			return student;
				
			
	}
	
	/**
	 * This mapping is for static search page to take user search criteria
	 * @return
	 */
	@RequestMapping(value = "/addStudentForm")
	public ModelAndView addStudentPanel(){
		ModelAndView addModelAndView = new ModelAndView("student_add");
		Address address = new Address();
		Student student = new Student();
			student.setAddress(address);
			
				
			addModelAndView.addObject(student);
		return addModelAndView;
	}
	
	/**
	 * This mapping will be called to search the student based on given criteria and it will return display view if student found else 
	 * will display student not found message 
	 * @param searchStr
	 * @param request
	 * @param response
	 * @return {@ModelAndView}
	 */
	@RequestMapping(value = "/getStudent", method=RequestMethod.GET)
	public ModelAndView searchStudent(@RequestParam("searchStr") String searchStr,HttpServletRequest request, HttpServletResponse response){

		System.out.println("Serach String:: "+searchStr);
		ModelAndView resModelAndView = new ModelAndView("search_student_display");
			
			Student student =null;
			
			try {
				student  = studentService.getStudentById(searchStr);
			} catch (Exception e) {
				throw new AppException(e.getMessage());
				//return new ModelAndView("process_failure");
			}
			if(student !=null){
				resModelAndView.addObject(student);
				return resModelAndView;
			}else{
				return new ModelAndView("search_failure");
			}
	}
	
	 /**
	  * This mapping will be integrated with search page, i.e user can modify the student 
	  * once the data is found from search screen
	 * @param student
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/editStudent", method = RequestMethod.POST)
	 public String editStudent(@ModelAttribute("student")Student student, ModelMap model){
		 
		Student student2= null;
		try {
			student2 = studentService.modifyStudent(student);
		} catch (Exception e) {
			throw new AppException(e.getMessage());			
		}
	      return "edit_success";
	 }
	
	
	@RequestMapping(value = "/delStudent")
	public String delStudent(@RequestParam("studentId") String studentId,HttpServletRequest request, HttpServletResponse response){
		
		boolean res;
		
		try {
			res = studentService.deleteStudent(studentId);
		} catch (Exception e) {
			throw new AppException(e.getMessage());		
		}
		System.out.println(studentId);
	      return "del_success";
	   }
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	 public String addStudent(@ModelAttribute("student")Student student, ModelMap model){
		int id;
		try {
			if(student.getFirstName()==null || student.getFirstName().isEmpty()){
				throw new AppException("Can't proceed with empty data");		
			}
			id = studentService.addStudent(student);
			student.setId(id);
		} catch (Exception e) {
			throw new AppException(e.getMessage());		
		}
	      
	      return "add_success";
	 }

	/**
	 * @return the studentService
	 */
	public StudentService getStudentService() {
		return studentService;
	}

	/**
	 * @param studentService the studentService to set
	 */	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	

}

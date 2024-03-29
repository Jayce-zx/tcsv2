package com.meession.orga.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.meession.orga.entity.Student;
import com.meession.orga.service.IUserService;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class StudentView implements Serializable{

	@ManagedProperty("#{userService}")
	private IUserService userService;

	private List<Student> studentList;
	private Student studentAdd;
	private Student studentQuery;
	private Student studentMod;
	private List<Student> selectedStudentList;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Student getStudentAdd() {
		return studentAdd;
	}

	public void setStudentAdd(Student studentAdd) {
		this.studentAdd = studentAdd;
	}

	public List<Student> getSelectedStudentList() {
		return selectedStudentList;
	}

	public void setSelectedStudentList(List<Student> selectedStudentList) {
		this.selectedStudentList = selectedStudentList;
	}

	public Student getStudentMod() {
		return studentMod;
	}

	public void setStudentMod(Student studentMod) {
		this.studentMod = studentMod;
	}
	
	public Student getStudentQuery() {
		return studentQuery;
	}

	public void setStudentQuery(Student studentQuery) {
		this.studentQuery = studentQuery;
	}	
	
	@PostConstruct
	public void init(){
		studentList=new ArrayList<Student>();
		selectedStudentList=new ArrayList<Student>();
		Student stu1=new Student("sam1","passwd","121@qq.com","18073254781",false,"2010551132","sam","this is remark");
		Student stu2=new Student("sam2","passwd","122@qq.com","18073254782",false,"2010551133","sam","this is remark");
		Student stu3=new Student("sam3","passwd","123@qq.com","18073254783",false,"2010551134","sam","this is remark");
		Student stu4=new Student("sam4","passwd","124@qq.com","18073254784",false,"2010551135","sam","this is remark");
		Student stu5=new Student("sam5","passwd","125@qq.com","18073254785",false,"2010551136","sam","this is remark");
		Student stu6=new Student("sam6","passwd","126@qq.com","18073254786",false,"2010551137","sam","this is remark");
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);
		studentQuery=new Student();
		studentAdd=new Student();
		studentMod=new Student();
	}

	public void query(){
		System.out.println(studentQuery);
	}
	
	public void modifySelect(ActionEvent e){
		if(selectedStudentList.size()>0){
			 studentMod=selectedStudentList.get(0);
		}else{
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("未选中要修改的用户！"));
		}
	}
	public void modify(ActionEvent e){
	      System.out.println(studentMod);
	}
	
	public void delete(ActionEvent e){
		
	}
	
	public void add(ActionEvent e){
		
	}
	
}

package com.Chapter3JavaBeans;

public class JavaBeansEg implements java.io.Serializable {
	int id; 
	String name;
	Boolean active;
	int data[];
	
	public JavaBeansEg()
	{
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Boolean isActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public int[] getData() {
		return data;
	}


	public void setData(int[] data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaBeansEg java = new JavaBeansEg();
		
		java.setId(1);;
		java.setName("Salina");
		java.setActive(true);
		
		System.out.println("ID : "+java.getId());
		System.out.println("Name : "+java.getName());
		System.out.println("Active : "+java.isActive());

	}

}

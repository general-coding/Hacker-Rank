package jv.advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student {
	private String name;
	private String id;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

public class JavaReflectionAttributes {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		Class student = Student.class;
		Method[] methods = Student.class.getDeclaredMethods();

		ArrayList<String> methodList = new ArrayList<>();
		for (int i = 0; i < methods.length; i++) {
			methodList.add(methods[i].getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}

}

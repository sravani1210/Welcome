package com.vrun;

public class Pojo {
String name;
int id;
public Pojo(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "Pojo [name=" + name + ", id=" + id + "]";
}
public Pojo() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}

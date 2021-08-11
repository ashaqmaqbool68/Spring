package com.example.webservices.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDemo {
@RequestMapping(method=RequestMethod.GET,path="/hello")
public String helloWorld(){
	return "Hello World";
}
@RequestMapping(path="/hellobean")
public HelloWorldBean helloWorldBean()
{
	return new HelloWorldBean("Hello World!");
}
@RequestMapping(path="/hellobean/{name}")
public HelloWorldBean helloWorldBean(@ PathVariable String name)
{
	return new HelloWorldBean("Hello World "+ name +" !");
}
@RequestMapping(path="/hellobean-list")
public List <HelloWorldBean> helloWorldBeanList()
{
	List<HelloWorldBean>list=new ArrayList<HelloWorldBean>();
	list.add(new HelloWorldBean("Ashiq"));
	list.add(new HelloWorldBean("Maqbool"));
	list.add(new HelloWorldBean("Malla"));
	list.add(new HelloWorldBean("Pulwama"));
	return list;
}
}

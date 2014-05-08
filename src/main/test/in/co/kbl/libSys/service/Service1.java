package in.co.kbl.libSys.service;

import org.springframework.beans.factory.annotation.Autowired;

public class Service1 {

	@Autowired
	Service2 service2;
	
	void method1() {
		System.out.println("hello");
		service2.method2();
	}
}

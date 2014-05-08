package in.co.kbl.libSys.service;

import org.springframework.beans.factory.annotation.Autowired;

public class Service2 {

	@Autowired
	private Service3 service3;

	void method2() {
		System.out.println("world");
		service3.method3();
	}
}

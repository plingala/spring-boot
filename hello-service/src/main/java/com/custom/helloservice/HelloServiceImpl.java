package com.custom.helloservice;

public class HelloServiceImpl implements IHelloService {

	private final String prefix;
	private final String suffix;
	
	public HelloServiceImpl(String prefix, String suffix) {
		super();
		this.prefix = (prefix == null) ? "Default P" : prefix;
		this.suffix = (suffix == null) ? "Default S" : suffix;
	}

	public HelloServiceImpl() {
		this(null, null);
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println( String.format("%s %s %s", this.prefix, name, this.suffix) );
	}
}
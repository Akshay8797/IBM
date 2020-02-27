package com.Generics;
class GenericTest {

	public static void main(String[] args) {
		 Wrapper1<String> w1 = new Wrapper1<String>("Hello");
		    String s1 = w1.get();
		    System.out.println("s1=" + s1);

		    w1.set("Testing generics");
		    String s2 = w1.get();
		    System.out.println("s2=" + s2);

		    w1.set(null);
		    String s3 = w1.get();
		    System.out.println("s3=" + s3);

	}
	

}
class Wrapper1<T> {
	  private T obj;

	  public Wrapper1(T obj) {
	    this.obj = obj;
	  }
	  public void set(T obj) {
		    this.obj = obj;
		  }

	  public T get() {
	    return obj;
	  }

	 
	}

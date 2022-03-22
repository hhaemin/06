//기본형 매개변수  

class Data { int x;}

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main(): x = "+d.x);
		
		change(d.x); //change메서드 호출 
		System.out.println("After change(d.x)");
		System.out.println("main(): x = "+d.x);
	}
	
	static void change(int x) { //타입이 int이므로 기본형 매개변수 
		x=1000; // change메서드가 종료되면서 매개변수 x는 스택에서 제거됨. 
		System.out.println("change(): x ="+x); 
	}
}
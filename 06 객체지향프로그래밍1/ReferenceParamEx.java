//참조형 매개변수 

class Data2 {int x;}

class ReferenceParamEx {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() :x = "+d.x);
		
		change(d); //change메서드의 매개변수를 참조형으로 선언했기 때문에, x의 값이 아닌 주소가 매개변수 d에 복사되었다.
		System.out.println("After change(d)");
		System.out.println("main() :x ="+d.x);
	}
	
	static void change(Data2 d) { //데이터 타입이 기본이 아니므로 참조형 매개변수 
		d.x=1000;
		System.out.println("change():x = "+d.x);
	}
}

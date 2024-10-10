
public class Test {
	
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000";
		taro.address = "@gmail";
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "111";
		jiro.address = "@gmail";
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
	    hanako.age = 16;
	    hanako.phoneNumber = "222";
		hanako.address = "@gmail";
	    
	    Person takumi = new Person();
		takumi.name = "濱崎匠";
		takumi.age = 24;
		takumi.phoneNumber = "333";
		takumi.address = "@gmail";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		System.out.println(takumi.name);
		System.out.println(takumi.age);
		System.out.println(takumi.phoneNumber);
		System.out.println(takumi.address);
		takumi.talk();
		takumi.walk();
		takumi.run();
	 
		Robot aibo = new Robot();
		aibo.name = "あいぼ";
		
		Robot asimo = new Robot();
		asimo.name = "あしも";
		
		Robot pepper= new Robot();
		pepper.name = "ペッパー";
	    
		
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
		
	}

}

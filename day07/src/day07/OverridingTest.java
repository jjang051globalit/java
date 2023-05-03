package day07;

class Animal {
	String speak() {
		return "으르렁";
	}
}

class Weapon {
	
	int fire() {
		int num= 10;
		int num02= 10;
		return num+num02;
		
	}
	
	void test() {
		System.out.println("test입니다.");
	}
	
//	int fire(int damage) {
//		return damage;
//	}
}
class Canon extends Weapon {
	
	@Override
	int fire() {
		return 10;
	}
}

class Puppy extends Animal {
	
	String speak() {
		return "멍멍";
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		int weaponDamage = weapon.fire();
		System.out.println("Weapon의 데미지는 "+weaponDamage);
		
		
		// 동적 바인딩.
		weapon = new Canon();
		int canonDamage = weapon.fire();
		System.out.println("Canon의 데미지는 "+canonDamage);
		
		Puppy puppy = new Puppy();
		System.out.println(puppy.speak());  
		
	}
}










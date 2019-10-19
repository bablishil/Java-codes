class Female{
	int id, age, year;
	String name;
	Female(String name, int id){
		this.name = name;
		this.id = id;
	}
	int Calc_age(int year){
		this.year = year;
		this.age = 2019 - year;
		System.out.println(age);
		return age;
	}
}
public class Main{
	public static void main(String args[]){
		Female lad = new Female("hina", 15);
		//lad.Female();
		System.out.println("Your age is-:");
		lad.Calc_age(2000);

		
	}

}
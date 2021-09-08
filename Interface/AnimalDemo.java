public interface AnimalDemo {

	abstract public void travel();// declarations

	void body();

	void eat();
}

// derived class
class Tiger implements AnimalDemo {

	@Override
	public void travel() {
		// implementation features of that method

		System.out.println("Tiger run very fast 100 mph");

	}

	@Override
	public void body() {
		// implementation of that method

		System.out.println("body is big");
	}

	@Override
	public void eat() {
		// implementation of that method

		System.out.println("Eat only animals");

	}

}

// derived class
class Rat implements AnimalDemo {

	@Override
	public void travel() {
		// TODO Auto-generated method stub

		System.out.println("travels slow...");

	}

	@Override
	public void body() {
		// TODO Auto-generated method stub
		System.out.println("small body...");
	}

	@Override
	public void eat() {

		System.out.println("small eat");

	}

	public static void main(String args[]) {
    Rat rat=new Rat();
    Tiger tiger=new Tiger();
    rat.travel();
    rat.body();
    rat.eat();
    tiger.travel();
    tiger.body();
    tiger.eat();
	}

}

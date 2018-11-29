package checkpoint;

public class ReadyMadeCake extends Cake {

	int quantity;
	public ReadyMadeCake(String n, double r, int q) {
		super(n, r);
		quantity = q;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		return rate * quantity;
	}

}

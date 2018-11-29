package checkpoint;

public class OrderCake extends Cake{

	int weight;
	public OrderCake(String n, double r, int w) {
		super(n, r);
		weight = w;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		return rate * weight;
	}

}

package checkpoint;

public class cakeTester {
	public static void main(String[] args) {
		Cake[] cakes = new Cake[20];
		
		for(int i = 0 ; i < 20; i++) {
			if(i%2 == 0) {
				cakes[i] = new OrderCake("O Cake", 5, i);
			} else {
				cakes[i] = new ReadyMadeCake("RM Cake", 5, i*2);
			}
		}
		double total = 0.0;
		for(Cake c : cakes) {
			total += c.calcPrice();
		}
		System.out.println("Total price is " + total);
		
		double rmTotal = 0.0;
		for(Cake c : cakes) {
			if(c instanceof ReadyMadeCake) {
				rmTotal += c.calcPrice();
			}
		}
		System.out.println("Total price of ready made cakes is " + rmTotal);
		
		double maxPrice = 0.0;
		for(Cake c : cakes) {
			if(c.calcPrice() > maxPrice) {
				maxPrice = c.calcPrice();
			}
		}
		System.out.println("The highest price sold is " + maxPrice);
	}
}

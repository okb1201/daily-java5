package day05.q01;

class CashRegister {

	int calcPrice(int cost) {

		int priceIncludeTax = (int) (cost * 1.1);
		return priceIncludeTax;

	}

}

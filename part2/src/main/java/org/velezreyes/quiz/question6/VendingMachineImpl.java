package org.velezreyes.quiz.question6;

import java.util.HashMap;

public class VendingMachineImpl implements VendingMachine, Drink{
	
	private HashMap<String,VendingMachineImpl> drinks = new HashMap<String,VendingMachineImpl>();
	private Float money = 0f;
	
	private String drinkName;
	private boolean fizzyness;
	private Float price;
	
	public static VendingMachine getInstance() {
		VendingMachineImpl vm = new VendingMachineImpl();
		stockMachine(vm);
		return vm; 
	}
	
	public static void stockMachine(VendingMachineImpl vm){
		VendingMachineImpl beverage1 = new VendingMachineImpl();
		beverage1.drinkName = "ScottCola";
		beverage1.fizzyness = true;
		beverage1.price = 0.75f;
		vm.drinks.put(beverage1.drinkName, beverage1);
		
		VendingMachineImpl beverage2 = new VendingMachineImpl();
		beverage2.drinkName = "KarenTea";
		beverage2.fizzyness = false;
		beverage2.price = 1f;
		vm.drinks.put(beverage2.drinkName, beverage2);
	}
	
	@Override
	public void insertQuarter() {
		money+=0.25f;
	}
	
	@Override
	public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
		if (drinks.containsKey(name)) {
			VendingMachineImpl beverage = drinks.get(name);
			if (beverage.price <= money) {
				money-=beverage.price;
				return beverage;
			}		
			else{
				throw new NotEnoughMoneyException();
			}
		}
		else {
			throw new UnknownDrinkException();
		}
	}

	@Override
	public String getName() {
		return drinkName;
	}

	@Override
	public boolean isFizzy() {
		return fizzyness;
	}
}


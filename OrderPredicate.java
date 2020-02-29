package com.Lambda;
@FunctionalInterface
public interface OrderPredicate {

	boolean test(Order o);

}
 class OrderPredicateByAmount implements OrderPredicate
{

	@Override
	public boolean test(Order o) {
		
		return o.getPrice()>10000;
	}
	
}
 
 class OrderPredicateByStatus implements OrderPredicate
{

	@Override
	public boolean test(Order o) {
		
		return "Completed".equals(o.getStatus());
	}
	
}
 

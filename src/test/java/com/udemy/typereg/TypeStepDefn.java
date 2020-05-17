package com.udemy.typereg;

import java.util.List;

import io.cucumber.java.en.When;

public class TypeStepDefn {

	
	
	@When("I Login With different Ids")
	public void i_Login_With_different_Ids(io.cucumber.datatable.DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		
		List<User> list=table.asList(User.class);
		System.out.println(list.get(0));
	    
	}
	
	
}

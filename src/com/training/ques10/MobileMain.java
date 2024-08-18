package com.training.ques10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MobileMain {

	public static void main(String[] args) throws MobileIdNotFoundException {

		List<Mobile> mobiles = Arrays.asList(new Mobile("iPhone 14 Pro", "Apple", 3299.99, 10),
				                             new Mobile("Galaxy S23 Ultra", "Samsung", 13199.99, 11),
				                             new Mobile("Pixel 7 Pro", "Google", 899.99, 12),
				                             new Mobile("OnePlus 11", "OnePlus", 749.99, 13),
				                             new Mobile("aperia 1 V", "Apple", 999.99, 14)
                                             );
		mobiles.forEach(str->System.out.println(str));
		
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("----------List of mobiles by brand-----------");
		
		List<Mobile> getbybrand = mobiles.stream().filter(str->str.getBrand().equalsIgnoreCase("apple")).collect(Collectors.toList());
		for(Mobile brand : getbybrand)
		{
			System.out.println(brand);
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("----------Sorted list of mobiles by brand-----------");
		List<Mobile> getbybrandsorted = mobiles.stream().filter(str->str.getBrand().equalsIgnoreCase("apple")).sorted((o1, o2) -> o1.getModel().compareTo(o2.getModel())).collect(Collectors.toList());
		for(Mobile sortedbrand : getbybrandsorted)
		{
			System.out.println(sortedbrand);
		}
	  
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("----------Get by Id-----------");
		
		Optional<Mobile> opmobile = Optional.of(mobiles.stream().filter(num->num.getMobileId().equals(12)).findAny().orElseThrow(()->new MobileIdNotFoundException("MobileId not found")));
	    System.out.println(opmobile);
	    
	    System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("----------List of mobiles by brand and price less than 2000-----------");
	
		List<Mobile> getbybrandandprice=mobiles.stream().filter(str->str.getBrand().equalsIgnoreCase("apple") && str.getPrice()<=2000).collect(Collectors.toList());
		for(Mobile brandandprice : getbybrandandprice)
		{
			System.out.println(brandandprice);
		}
        
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("----------Sorted list of mobiles by brand and print only by model name-----------");
		
		mobiles.stream().filter(str->str.getBrand().equalsIgnoreCase("apple")).sorted((o1, o2) -> o1.getModel().compareTo(o2.getModel())).map(str->str.getModel()).forEach(str->System.out.println(str));
		
	}}


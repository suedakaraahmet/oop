package oop;

public class Test 
{	
	public static void main(String[] args) 
	{
		Insan insan = new Insan();
		System.out.println(insan.getBoy());
		
		Insan insan2 = new Insan(183);
		System.out.println(insan2.getBoy());
		
		insan2.setBoy(160);
		System.out.println(insan2.getBoy());
		
		Nisa nisa = new Nisa();
		nisa.setBoy(150);
		System.out.println(nisa.getBoy());
		nisa.gor();
		
		CepTelefonu cep = new CepTelefonu();
		cep.gor();
	}

}

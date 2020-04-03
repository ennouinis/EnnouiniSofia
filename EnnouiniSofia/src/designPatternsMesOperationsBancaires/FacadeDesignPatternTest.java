package designPatternsMesOperationsBancaires;

public class FacadeDesignPatternTest {
		    public static void main(String[] args){

		        CompteBancaireFacade accescompte1 = new CompteBancaireFacade (123456, 0000);

		        accescompte1.retirerArgent(50.00);

		        accescompte1.retirerArgent(990.00);
		    }


}

package designPatternsMesOperationsBancaires;

public class FacadeDesignPatternTest {
		    public static void main(String[] args){

		        CompteBancaireFacade compte1 = new CompteBancaireFacade (123456, 0000);

		        compte1.retirerArgent(50.00);

		        compte1.retirerArgent(990.00);
		        
		        compte1.verserArgent(100);
		    }


}

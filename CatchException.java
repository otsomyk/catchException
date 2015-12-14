package catchException;

public class CatchException {

	public static void main(String[] args) {
		try{
			return;
		} catch (Exception e){
			e.printStackTrace();
		} finally{
			System.out.println("I want to be executed!");
		}
	}

}

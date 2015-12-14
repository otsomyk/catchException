package catchException;

public class CatchException {

	public static void main(String[] args) {
//		try {
//			return;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("I want to be executed!");
//		}

		try {
			throw new Exception();
		} catch (Exception e) {
			throw new IllegalStateException();
		} finally {
			System.out.println("I want to be printed.");
		}
	}
}

package Sun_Concrete;

public class TransMain {

	public static void main(String[] args) {
		TransCreator tc = new RealTransCreator_Transcompany();

		TransProduct tp;
		
		tp = tc.transCreate("bicycle");
		
		tp.useTrans();
		
		tp = tc.transCreate("taxi");
		
		tp.useTrans();
		
		
	}

}

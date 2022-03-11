import java.lang.reflect.Constructor;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human h0 = new Human(true, 17, "Muzafarov", "Michael" );
		Human h1 = new Human(true, 17, "Muzafarov", "Michael" );
		Human h3 = new Human(false, 17, "Muzafarov", "Michael" );
		
		
		System.out.println( h0.equals( h1 ) );
		System.out.println( h0.equals( h3 ) );
		
		
		
		String humanString = "Human";
		
		try 
		{
			Class jopka = Class.forName( humanString );
			
			
			Class [ ] paramsClasses = { boolean.class, int.class, String.class, String.class };
			
			
			
			Constructor constructor = jopka.getConstructor(paramsClasses);
			
			//Object [ ] params = { new Boolean( false ), new Integer( 46 ), "Muzafarov", "Davran" };
			Object [ ] params = { true, 46, "Muzafarov", "Davran" };
			Object resultObject = constructor.newInstance( params );
			
			
			Human h = ((Object)new Human());
			
			//Object resultObject = jopka.newInstance();
			
			System.out.println( resultObject.getClass() );
		} 
		catch ( Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sraka = "sraka";
		Object juka = sraka;
		System.out.println( juka.getClass() );

	}
	
	
	public void doStuff( String className )
	{
		Class jopka = Class.forName( className );
		Object result = jopka.newInstance();
		Mammal mam = ( Mammal )result;
		
		//mam.getClass();
		
		mam.sri( );
		mam.ssi( );
		if( mam instanceof Chimp )
		{
			Cimp c = (Chimp)mam;
			c.chimpMethod( );
		}
	}

}

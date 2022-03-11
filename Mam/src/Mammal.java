import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Mammal {

	public boolean equals(Object o) {
		if( o == null )
		{
			return false;
		}
		if( !this.getClass().equals( o.getClass() ) )
		{
			return false;
		}
		
		
		Class currentClass = this.getClass();
		Method [ ] methods = currentClass.getMethods();
		for( Method m: methods )
		{
			if( m.getParameters( ).length != 0 )
			{
				continue;
			}
			if( !m.getName().startsWith( "get") )
			{
				if( !m.getName().startsWith( "is") )
				{
					continue;
				}
				
			}
			int mod = m.getModifiers( );
			if( Modifier.PUBLIC != mod )
			{
				continue;
			}
			
			Object [ ] param = new Object[ 0 ];
			
			try 
			{
				Object result1 = m.invoke(this, param);
				Object result2 = m.invoke( o, param);
				if( result1 == null && result2 == null )
				{
					continue;
				}
				if( result1 == null && result2 != null )
				{
					return false;
				}
				if( result1 != null && result2 == null )
				{
					return false;
				}
				if( result1.equals( result2 ) )
				{
					continue;
				}
				else
				{
					return false;
				}
				
				
				
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}
}

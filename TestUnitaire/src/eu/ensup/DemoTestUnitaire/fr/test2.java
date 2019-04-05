package eu.ensup.DemoTestUnitaire.fr;

import static org.mockito.Mockito.*;

import java.util.Iterator;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class test2 {
	//demonter le retour de plusieur valeurs
	@Test
	public void testMoreThanOneReturnValue()  {
	        Iterator<String> i= mock(Iterator.class);
	        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
	        String result= i.next()+" "+i.next();
	        //assert
	        assertEquals("Mockito rocks", result);

	
}
	// montrer comment retourner les valeur
	@Test
	public void testReturnValueDependentOnMethodParameter()  {
	        Comparable<String> c= mock(Comparable.class);
	        when(c.compareTo("Mockito")).thenReturn(1);
	        when(c.compareTo("Eclipse")).thenReturn(2);
	        //assert
	        assertEquals(1, c.compareTo("Mockito"));
	}

	@Test
	public void testReturnValueInDependentOnMethodParameter()  {
	        Comparable<Integer> c= mock(Comparable.class);
	        when(c.compareTo(anyInt())).thenReturn(-1);
	        //assert
	        assertEquals(-1, c.compareTo(9));
	}

}
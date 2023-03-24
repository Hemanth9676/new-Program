package CollectionProject;

import java.util.Arrays;
import java.util.Collections;

public class Menu {

	public static void main(String[] args) {
	    MenuHotal[] a= {
	    		       new MenuHotal ("Roti",100),
		               new MenuHotal ("Idly",40),
		               new MenuHotal ("Masala Dosa",100),
		               new MenuHotal ("Fried Rice",100),
		               new MenuHotal ("Noodles",90),
	    };
	    
		          Arrays.sort(a);
		               for(MenuHotal e:a)
		               {
		            	   System.out.println(e);
		               }
	    
	}

}

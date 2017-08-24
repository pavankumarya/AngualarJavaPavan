package pack1.service;

import javax.jws.WebService;
@WebService
public class BookImpl implements BookInter {


	public double getBookPrice(String isbn) {
		
		if("isbno110".equals(isbn)){		
		return 698.90;
		}
		else
		{
			
	    	return 0;
		}
	}
	

}

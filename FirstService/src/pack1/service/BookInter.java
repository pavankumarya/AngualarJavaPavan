package pack1.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace="http://www.pavankumar.com/book")
public interface BookInter {
@WebMethod(operationName="getBookPrice")
@WebResult
public double getBookPrice(String isbn);
}

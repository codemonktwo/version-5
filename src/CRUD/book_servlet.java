package CRUD;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class book_servlet
 */
@WebServlet("/book_servlet")
public class book_servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 String pickupdate= request.getParameter("pickupdate");
		 String pickupt= request.getParameter("pickupt");
		 String city= request.getParameter("city");
		 String pincode= request.getParameter("pincode");
		 String address= request.getParameter("address");
		 String landmark= request.getParameter("landmark");
		 
		
		// request.setAttribute("pickupdate", pickupdate);
		// RequestDispatcher rd = request.getRequestDispatcher("sq1");
		 //rd.forward(request,response );
		 
		 
		HttpSession session=request.getSession();
		
		 //String shirts = (String) session.getAttribute("shirts");
		 
		session.setAttribute("pickupdate",pickupdate);
		
		session.setAttribute("pickupt",pickupt);
		session.setAttribute("city",city);
		session.setAttribute("pincode",pincode);
		session.setAttribute("address",address);
		session.setAttribute("landmark",landmark);
		response.sendRedirect("payment.jsp");
		
		
	}

}

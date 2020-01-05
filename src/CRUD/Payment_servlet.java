package CRUD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.DB_Connection1;


@WebServlet("/Payment_servlet")
public class Payment_servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		
		 String shirts=(String) session.getAttribute("shirts");
		 String tshirts=(String) session.getAttribute("tshirts");
		 String jeans=(String) session.getAttribute("jeans");
		 String trousers=(String) session.getAttribute("trousers");
		 String sarees=(String) session.getAttribute("sarees");
		 String totalamount=(String) session.getAttribute("totalamount");
		 String pickupdate=(String) session.getAttribute("pickupdate");
		 String pickupt=(String) session.getAttribute("pickupt");
		 String city=(String) session.getAttribute("city");
		 String pincode=(String) session.getAttribute("pincode");
		 String address=(String) session.getAttribute("address");
		 String landmark=(String) session.getAttribute("landmark");

		
		System.out.println(shirts);
		System.out.println(tshirts);
		System.out.println(jeans);
		System.out.println(trousers);
		System.out.println(sarees);
		System.out.println(totalamount);
		System.out.println(pickupdate);
		String service ="";
		if(session.getAttribute("washandfold")!=null)
		{
			service ="wash_and_fold";
		}
		int id=0;
		
		
		
		DB_Connection1 obj_DB_Connection1=new DB_Connection1();
		Connection connection=obj_DB_Connection1.get_connection();
		PreparedStatement ps=null;
		try {
			String mobileno="123466"; 
			String query="insert into orderclothes values('"+id+"','"+mobileno+"','"+service+"','"+shirts+"','"+tshirts+"','"+jeans+"','"+trousers+"','"+sarees+"','"+totalamount+"','"+pickupdate+"','"+pickupt+"','"+city+"','"+pincode+"','"+address+"','"+landmark+"');";
			 ps=connection.prepareStatement(query);
			 ps.executeUpdate();
	} catch (Exception e) {
		 System.err.println(e);
		}
		response.sendRedirect("home1.jsp");
	}

}

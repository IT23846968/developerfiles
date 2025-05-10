package site;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName = request.getParameter("customerName");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String phoneNo = request.getParameter("phoneNo");
		String country = request.getParameter("country");
		String currentPassword = request.getParameter("currentPassword");

		boolean isTrue;
		
		isTrue = userdao.insertdata( customerName,  email ,  dob , age , gender , phoneNo , country ,  currentPassword ) ;
				
		if(isTrue ==true) {
			String alertMessage = "Data Insert Successfull";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href=''</script>");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("");
			dis2.forward(request, response);
		}
	}

}

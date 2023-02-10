package bank.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bank.dao.RegisterDao;
import bank.model.Login;
import bank.model.Register;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int Logincnt=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String uname=request.getParameter("uname");
			String pass=request.getParameter("pass");
			
			Login lobj=new Login(uname, pass);
			lobj.setUname(uname);
			lobj.setPass(pass);
			
			List<Login> lstlogin=new ArrayList<Login>();
			lstlogin.add(lobj);
			
			RegisterDao regdao=new RegisterDao();
			List<Register> lstreg=regdao.validateData(lstlogin);
			
			HttpSession session=request.getSession();
			session.setAttribute("cust", lstreg);
			
			
			if(lstreg!=null) {
				response.sendRedirect("Dashboard.html");
			}
			else {
				Logincnt++;
					if(Logincnt<3)
						response.sendRedirect("Login.html");
					else {
						response.sendRedirect("block.html");
					}
			}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.DigitsPointOperators;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		ExpressionHolder expHolder = (ExpressionHolder) session.getAttribute("expHolder");
		if (expHolder == null) {
			expHolder = new ExpressionHolder();
		}

		String param = request.getParameter("symbol");
		
		for( DigitsPointOperators dpo : DigitsPointOperators.values())	{
			if(param.equals(dpo.symbol())){
				expHolder.setExpression(param);
			}
			
			/*if(param.equals(dpo.Minus.symbol()) || param.equals(dpo.Plus.symbol()) 
					|| param.equals(dpo.Mul.symbol()) || param.equals(dpo.Divide.symbol())){
				
			}*/
		}		
		  
		
		
	
		
		session.setAttribute("expHolder", expHolder);

		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

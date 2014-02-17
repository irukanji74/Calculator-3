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

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		ExpressionHolder2 expHolder = (ExpressionHolder2) session.getAttribute("expHolder");
		if (expHolder == null) {
			expHolder = new ExpressionHolder2();
		}

		String param = request.getParameter("symbol");

		if(param != null){
				expHolder.setExpression(param);
		}

		session.setAttribute("expHolder", expHolder);

		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

}

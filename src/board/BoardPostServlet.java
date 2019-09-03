package board;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//post 파일을 수정
/**
 * Servlet implementation class BoardPostServlet
 */
@WebServlet("*.aaa")
public class BoardPostServlet extends HttpServlet {
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    	throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	BoardMgr bMgr = new BoardMgr();
    	bMgr.insertBoard(request);
    	response.sendRedirect("list.jsp");
    }
}

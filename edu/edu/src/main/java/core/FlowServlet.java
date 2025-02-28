package core;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/flow")
public class FlowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FlowServlet() {
        super();
        System.out.println("FlowServlet 객체 생성....");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 메서드 호출....");
	}
	public void destroy() { // application 안에 있는 servlet이 수정됐을 때 실행됨
		System.out.println("destroy() 메서드 호출....");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 메서드 호출...."); //doGET 실행
	}

}

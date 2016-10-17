

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cars
 */
@WebServlet("/Cars")
public class Cars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String company = request.getParameter("company");
		
		if(company != null){
			response.setContentType("text/html");
			response.getWriter().write(generateJSON(company));
		}
	}
	
	/**
	 * Method to generate JSON
	 */
	
	public String generateJSON(String company) {
		StringBuffer returnData = null;
		
		if(company.equals("honda")){
			
			returnData = new StringBuffer("{\"nameCompany\":{");
			returnData.append("\"name\": \"Honda\",");
			returnData.append("\"cars\": [");
			returnData.append("{\"name\": \"Civic\"},");
			returnData.append("{\"name\": \"Acord\"}]");
			returnData.append("}}");
			
		} else if(company.equals("renault")) {
			
			returnData = new StringBuffer("{\"nameCompany\":{");
			returnData.append("\"name\": \"Renault\",");
			returnData.append("\"cars\": [");
			returnData.append("{\"name\": \"Thalia\"},");
			returnData.append("{\"name\": \"Clio\"}]");
			returnData.append("}}");
			
		} else if(company.equals("peugeot")) {
			
			returnData = new StringBuffer("{\"nameCompany\":{");
			returnData.append("\"name\": \"Peugeot\",");
			returnData.append("\"cars\": [");
			returnData.append("{\"name\": \"207\"},");
			returnData.append("{\"name\": \"308\"}]");
			returnData.append("}}");
			
		} else {		
			returnData = new StringBuffer("{\"nameCompany\":{");
			returnData.append("\"name\": \"No company.\",");
			returnData.append("\"cars\": [");
			returnData.append("{\"name\": \"No cars.\"}]");
			returnData.append("}}");
		}
		
		return returnData.toString();	
	}
}

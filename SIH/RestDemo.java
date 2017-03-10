package SIH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@WebServlet("/RestDemo")
public class RestDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    private JSONParser parser = new JSONParser();
    private JSONObject joUser = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		StringBuilder sb = new StringBuilder();
	    try 
	    {
	      BufferedReader reader = request.getReader();
	      String line = null;
	      while ((line = reader.readLine()) != null)
	      { sb.append(line);
	      }
	    } catch (Exception e) { e.printStackTrace(); }
	
	    JSONParser parser = new JSONParser();
	    JSONObject joUser = null;
        String username="";
        try
	    {
	    	//creating JSONObject out of JSON formatted String
	      joUser = (JSONObject) parser.parse(sb.toString());
	      username= joUser.get("username").toString();

	    } catch (Exception e) { e.printStackTrace(); }

		
	RestDemoBean rdb = new RestDemoBean();
	rdb.getDocument(username);
	PrintWriter out = response.getWriter();
    out.println(rdb.getContactInformation());
	}

}

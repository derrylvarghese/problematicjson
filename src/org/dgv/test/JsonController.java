package org.dgv.test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * Servlet implementation class JsonController
 */
@WebServlet("/JsonController")
public class JsonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JsonController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList issns = new ArrayList();

		Issn is = new Issn();
		is.setFormat("Paper");
		is.setVal("134-123");

		Issn i1 = new Issn();
		i1.setFormat("Electronic");
		i1.setVal("189-382");

		issns.add(is);
		issns.add(i1);

		String json = "{\"response\": {\"companyname\": \"ABC Company\",\"issn\": [{\"format\": \"paper\",\"val\": \"0018-9480\"},{\"format\": \"online\",\"val\": \"1557-9670\"}]},\"teststring\":\"testing me out\"}";

		ObjectMapper mapper = new ObjectMapper();
		MlJson record = mapper.readValue(json, MlJson.class);
		ObjectWriter writer = mapper.writer();
		writer.writeValue(response.getOutputStream(), record);

		response.setContentType("application/json;charset=UTF-8");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

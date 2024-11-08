package com.gaurav;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class GraphServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int vertices = Integer.parseInt(request.getParameter("vertices"));
		int start = Integer.parseInt(request.getParameter("source"));
		int end = Integer.parseInt(request.getParameter("dest"));
		Graph graph = new Graph(vertices);
		String edgeText = request.getParameter("edges");
		edgeText = edgeText.trim();
		String[]edges = edgeText.split("\n"); 
		PrintWriter out = response.getWriter();
		for(String edge: edges) {
			String[] edgeData = edge.split(",");
			int p = Integer.parseInt(edgeData[0].trim());
			int q = Integer.parseInt(edgeData[1].trim());
			graph.addEdge(p,  q);
		}
		List<Integer> shortestPath = graph.findPath(start, end);
		request.setAttribute("shortestPath", shortestPath);
		request.getRequestDispatcher("result.jsp").forward(request, response);
		
	}

}

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shortest Path Result</title>
</head>
<body>
	<h2>Shortest Path: </h2>
    <ul>
        <%
            // Retrieve the ArrayList from request attribute
            ArrayList<String> list = (ArrayList<String>) request.getAttribute("myList");
            
            // Check if list is not null and iterate over it
            if (list != null) {
                for (String item : list) {
                    out.println("<li>" + item + "</li>");
                }
            } else {
                out.println("<p>No items found.</p>");
            }
        %>
    </ul>
</body>
</html>
<html>
<body>
<h2><u>Shortest path</u></h2>
<p>I can give you the shortest path! just give me some information about the graph. Below i provided three text boxes.</p>
<ol type = '1'>
	<li>Give the total number of vertices</li>
	<li>Give the source in the first box</li>
	<li>Give the destination in the second box</li>
	<li>Give the edges in the third box</li>
</ol>
<form action = "GraphServlet" method = "POST">
	<label>Number of Vertices: <input type = "number" name = "vertices"></label><br>
	<label>Give the Source number: <input type = "number" name = "source"></label><br>
	<label>Give the Destination number: <input type = "number" name = "dest"></label><br>
	<label>Enter the edges(format : "a,b" for next edge move to next line): <textarea name="edges"></textarea></label><br>
	<input type = "Submit" value = "Find">
</form>
</body>
</html>

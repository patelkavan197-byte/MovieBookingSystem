<form action="BookingServlet" method="post">

Movie:
<input type="text"
name="movie"
value="<%=request.getParameter("movie")%>">

Seat:
<select name="seat">
<option>A1</option>
<option>A2</option>
<option>B1</option>
</select>

<input type="submit" value="Confirm">
</form>

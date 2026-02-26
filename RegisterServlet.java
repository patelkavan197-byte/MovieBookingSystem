package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import db.DBConnection;

public class RegisterServlet extends HttpServlet {

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

String name=req.getParameter("name");
String email=req.getParameter("email");
String pass=req.getParameter("password");

try{
Connection con=DBConnection.getConnection();

PreparedStatement ps=
con.prepareStatement(
"insert into users(name,email,password) values(?,?,?)");

ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,pass);

ps.executeUpdate();

res.sendRedirect("login.jsp");

}catch(Exception e){
e.printStackTrace();
}
}
}

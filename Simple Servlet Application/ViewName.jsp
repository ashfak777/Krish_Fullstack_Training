<%-- 
    Document   : ViewName
    Created on : Jul 16, 2022, 9:07:41 AM
    Author     : ashfak
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="servlet.process" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ViewName</title>
    </head>
    <body>
        <% ArrayList list = process.name_list;
        for(Object name:list){
        out.write("<p>"+name.toString()+"</p>");
        }
        
        %>
    </body>
</html>

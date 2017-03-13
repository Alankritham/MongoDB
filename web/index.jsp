<%-- 
    Document   : Handle
    Created on : Sep 21, 2015, 1:50:06 PM
    Author     : Alankritha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color:indianred;
                color:black;
            }
            h1{
                background-color:black;
                color:white;
                padding:40px;
                text-align: center;
            }
            .class{
                color:black;
                alignment-adjust: center;
                font-style: italic;
            }
        </style>
    </head>
    <body>
        <h1>Welcome to CraigsList</h1>
        <form>
            <button><a href="postad.jsp" />POST AD</button>
            <br>
            <button><a href="search.jsp"/>SEARCH</button>
        </form>
    </body>
</html>

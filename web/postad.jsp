<%-- 
    Document   : postad
    Created on : Sep 21, 2015, 5:15:40 PM
    Author     : Alankritha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PostAD</title>
        <style>
            body{
                background-color:white ;
                color:black;
            }
            h1{
               background-color: buttonface; 
               color:black;
               text-align: center; 
            }
        </style>
    </head>
    <body>
        <h1>Post your AD here !</h1>
        <form action="http://localhost:8080/MongoCraig/PostAd" method="post">
            <fieldset>
            <legend>Personal information:
            </legend>
            First name:
            <input type="text" name="firstname">
            <br>
            Last name:
            <input type="text" name="lastname">
            <br>
            <input type="radio" name="sex"
            value="male" checked> Male
            <br>
            <input type="radio" name="sex" value="female"> Female
            <br>
            What are you selling?
            <input type="text" name="sold-item">
            <br>
            Description:<br>
            <textarea name="desc" rows="4" cols="50"></textarea>
            <br>
            Price:
            <input type="text" name="price">
            <br>
            <input type="submit" value="Submit">
        </fieldset>
        </form>
        <br>
        
</body>
</html>

<%-- 
    Document   : header
    Created on : Sep 29, 2021, 8:04:36 PM
    Author     : os
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
            <div class="container">
                <a class="navbar-brand" href="/CoffeeShop/home">Coffee<small>Blend</small></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="oi oi-menu"></span> Menu
                </button>
                <div class="collapse navbar-collapse" id="ftco-nav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item"><a href="/CoffeeShop/home" class="nav-link">Home</a></li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle"  id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" href="/CoffeeShop/menu" >Menu</a>
                            <div class="dropdown-menu" aria-labelledby="dropdown04">
                                <a class="dropdown-item active" href="/CoffeeShop/menu">ALL DISH</a>
                                <c:forEach items="${listC}" var="o">
                                    <a class="dropdown-item active" href="/CoffeeShop/category?cid=${o.cId}">${o.cName}</a>
                                </c:forEach>
                            </div>
                        </li>



                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="room.jsp" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Customer</a>
                            <div class="dropdown-menu" aria-labelledby="dropdown04">
                                <c:if test="${sessionScope.acc == null}">
                                    <a class="dropdown-item" href="loginsignup/login.jsp">Login</a>
                                </c:if>

                                <c:if test="${sessionScope.acc != null}">
                                    <a class="dropdown-item" href="/CoffeeShop/logout">Logout</a>
                                </c:if>


                                <a class="dropdown-item" href="loginsignup/signUp.jsp">Sign Up</a>
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="room.jsp" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">US</a>
                            <div class="dropdown-menu" aria-labelledby="dropdown04">
                                <a class="dropdown-item" href="contact.jsp">Contact</a>
                                <a class="dropdown-item" href="about.jsp">About</a>
                                <a class="dropdown-item" href="services.jsp">Service</a>
                            </div>
                        </li>

                        <c:if test="${sessionScope.acc.isSell==1}">
                            <li class="nav-item"><a class="nav-link">Manager Account</a></li>
                            </c:if>
                            
                        <c:if test="${sessionScope.acc.isAdmin==1}">
                            <li class="nav-item"><a href="manager?cid=1" class="nav-link">Manager Product</a></li>
                            </c:if>

                        <c:if test="${sessionScope.acc != null}">
                            <li class="nav-item"><a class="nav-link">Hi, ${sessionScope.acc.user}</a></li>

                        </c:if>

                        <li class="nav-item cart"><a href="cart.jsp" class="nav-link"><span class="icon icon-shopping_cart"></span><span class="bag d-flex justify-content-center align-items-center"><small>1</small></span></a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </body>
</html>

<%-- 
    Document   : menu
    Created on : Sep 29, 2021, 8:02:30 PM
    Author     : os
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Coffee - Free Bootstrap 4 Template by Colorlib</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans:400,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Great+Vibes" rel="stylesheet">

        <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
        <link rel="stylesheet" href="css/animate.css">

        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">

        <link rel="stylesheet" href="css/aos.css">

        <link rel="stylesheet" href="css/ionicons.min.css">

        <link rel="stylesheet" href="css/bootstrap-datepicker.css">
        <link rel="stylesheet" href="css/jquery.timepicker.css">


        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/icomoon.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <jsp:include page="component/header.jsp"></jsp:include>

            <!-- END nav -->

            <section class="home-slider owl-carousel">

                <div class="slider-item" style="background-image: url(images/bg_3.jpg);" data-stellar-background-ratio="0.5">
                    <div class="overlay"></div>
                    <div class="container">
                        <div class="row slider-text justify-content-center align-items-center">

                            <div class="col-md-7 col-sm-12 text-center ftco-animate">
                                <h1 class="mb-3 mt-5 bread">Our Menu</h1>
                                <p class="breadcrumbs"><span class="mr-2"><a href="index.jsp">Home</a></span> <span>Menu</span></p>
                            </div>

                        </div>
                    </div>
                </div>
            </section>

            <section class="ftco-intro">
                <div class="container-wrap">
                    <div class="wrap d-md-flex align-items-xl-end">
                        <div class="info">
                            <div class="row no-gutters">
                                <div class="col-md-4 d-flex ftco-animate">
                                    <div class="icon"><span class="icon-phone"></span></div>
                                    <div class="text">
                                        <h3>000 (123) 456 7890</h3>
                                        <p>A small river named Duden flows by their place and supplies.</p>
                                    </div>
                                </div>
                                <div class="col-md-4 d-flex ftco-animate">
                                    <div class="icon"><span class="icon-my_location"></span></div>
                                    <div class="text">
                                        <h3>198 West 21th Street</h3>
                                        <p>	203 Fake St. Mountain View, San Francisco, California, USA</p>
                                    </div>
                                </div>
                                <div class="col-md-4 d-flex ftco-animate">
                                    <div class="icon"><span class="icon-clock-o"></span></div>
                                    <div class="text">
                                        <h3>Open Monday-Friday</h3>
                                        <p>8:00am - 9:00pm</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="book p-4">
                            <h3>Book a Table</h3>
                            <form action="#" class="appointment-form">
                                <div class="d-md-flex">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="First Name">
                                    </div>
                                    <div class="form-group ml-md-4">
                                        <input type="text" class="form-control" placeholder="Last Name">
                                    </div>
                                </div>
                                <div class="d-md-flex">
                                    <div class="form-group">
                                        <div class="input-wrap">
                                            <div class="icon"><span class="ion-md-calendar"></span></div>
                                            <input type="text" class="form-control appointment_date" placeholder="Date">
                                        </div>
                                    </div>
                                    <div class="form-group ml-md-4">
                                        <div class="input-wrap">
                                            <div class="icon"><span class="ion-ios-clock"></span></div>
                                            <input type="text" class="form-control appointment_time" placeholder="Time">
                                        </div>
                                    </div>
                                    <div class="form-group ml-md-4">
                                        <input type="text" class="form-control" placeholder="Phone">
                                    </div>
                                </div>
                                <div class="d-md-flex">
                                    <div class="form-group">
                                        <textarea name="" id="" cols="30" rows="2" class="form-control" placeholder="Message"></textarea>
                                    </div>
                                    <div class="form-group ml-md-4">
                                        <input type="submit" value="Appointment" class="btn btn-white py-3 px-4">
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>

            <section class="ftco-section">
                <div class="container">
                    <div class="row justify-content-center mb-5">
                        <div class="col-md-7 heading-section text-center ftco-animate">
                            <span class="subheading">Menu</span>
                            <h2 class="mb-4">Our Dish</h2>
                            <p>Searching our dish</p>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <form action="/CoffeeShop/searchC" class="search-form">
                            <div class="form-group">
                                <div class="icon">
                                    <span class="icon-search"></span>
                                </div>
                                <input name="txt" type="text" class="form-control" placeholder="Search...">
                            </div>
                        </form>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 mb-5 pb-3">
                            <h3 class="mb-5 heading-pricing ftco-animate">Starter</h3>
                        <c:forEach items="${listS}" var="o">
                            <div class="pricing-entry d-flex ftco-animate">
                                <div class="img" style="background-image: url(${o.img});"></div>
                                <div class="desc pl-3">
                                    <div class="d-flex text align-items-center">
                                        <h3><span><a href="/CoffeeShop/detail?pid=${o.id}">${o.name}</a></span></h3>
                                        <span class="price">$ ${o.price}</span>
                                    </div>
                                    <div class="d-block">
                                        <p>${o.desc}</p>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                    <div class="col-md-6 mb-5 pb-3">
                        <h3 class="mb-5 heading-pricing ftco-animate">Main Dish</h3>
                        <c:forEach items="${listM}" var="o">
                            <div class="pricing-entry d-flex ftco-animate">
                                <div class="img" style="background-image: url(${o.img});"></div>
                                <div class="desc pl-3">
                                    <div class="d-flex text align-items-center">
                                        <h3><span><a href="/CoffeeShop/detail?pid=${o.id}">${o.name}</a></span></h3>
                                        <span class="price">$ ${o.price}</span>
                                    </div>
                                    <div class="d-block">
                                        <p>${o.desc}</p>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                    <div class="col-md-6">
                        <h3 class="mb-5 heading-pricing ftco-animate">Desserts</h3>
                        <c:forEach items="${listD}" var="o">
                            <div class="pricing-entry d-flex ftco-animate">
                                <div class="img" style="background-image: url(${o.img});"></div>
                                <div class="desc pl-3">
                                    <div class="d-flex text align-items-center">
                                        <h3><span><a href="/CoffeeShop/detail?pid=${o.id}">${o.name}</a></span></h3>
                                        <span class="price">$ ${o.price}</span>
                                    </div>
                                    <div class="d-block">
                                        <p>${o.desc}</p>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                    <div class="col-md-6">
                        <h3 class="mb-5 heading-pricing ftco-animate">Drinks</h3>
                        <c:forEach items="${listDr}" var="o">
                            <div class="pricing-entry d-flex ftco-animate">
                                <div class="img" style="background-image: url(${o.img});"></div>
                                <div class="desc pl-3">
                                    <div class="d-flex text align-items-center">
                                        <h3><span><a href="/CoffeeShop/detail?pid=${o.id}">${o.name}</a></span></h3>
                                        <span class="price">${o.price}</span>
                                    </div>
                                    <div class="d-block">
                                        <p>${o.desc}</p>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </section>

        <section class="ftco-menu mb-5 pb-5">
            <div class="container">
                <div class="row justify-content-center mb-5">
                    <div class="col-md-7 heading-section text-center ftco-animate">
                        <span class="subheading">Discover</span>
                        <h2 class="mb-4">Our Products</h2>
                        <p>Discover our newest dishes</p>
                    </div>
                </div>
                <div class="row d-md-flex">
                    <div class="col-lg-12 ftco-animate p-md-5">
                        <div class="row">
                            <div class="col-md-12 nav-link-wrap mb-5">
                                <div class="nav ftco-animate nav-pills justify-content-center" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                                    
                                        <a class="nav-link active " id="v-pills-1-tab" data-toggle="pill" href="#v-pills-1" role="tab" aria-controls="v-pills-1" aria-selected="true">STARTED</a>
                                        <a class="nav-link " id="v-pills-2-tab" data-toggle="pill" href="#v-pills-2" role="tab" aria-controls="v-pills-2" aria-selected="true">MAIN DISH</a>
                                        <a class="nav-link " id="v-pills-3-tab" data-toggle="pill" href="#v-pills-3" role="tab" aria-controls="v-pills-3" aria-selected="true">DESSERT</a>
                                        <a class="nav-link " id="v-pills-4-tab" data-toggle="pill" href="#v-pills-4" role="tab" aria-controls="v-pills-4" aria-selected="true">DRINKS</a>
                                    

                                </div>
                            </div>



                            <div class="col-md-12 d-flex align-items-center">

                                <div class="tab-content ftco-animate" id="v-pills-tabContent">

                                    <div class="tab-pane fade show active " id="v-pills-1" role="tabpanel" aria-labelledby="v-pills-1-tab">
                                        <div class="row">
                                        <c:forEach items="${listNewS}" var="o">
                                            <div class="col-md-4 text-center">
                                                <div class="menu-wrap">
                                                
                                                    <a href="#" class="menu-img img mb-4" style="background-image: url(${o.img});"></a>
                                                    <div class="text">
                                                        <h3><a href="#">${o.name}</a></h3>
                                                        <p>${o.desc}</p>
                                                        <p class="price"><span>$ ${o.price}</span></p>
                                                        <p><a href="#" class="btn btn-primary btn-outline-primary">Add to cart</a></p>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                        </div>
                                    </div>
                                    
                                    <div class="tab-pane fade show " id="v-pills-2" role="tabpanel" aria-labelledby="v-pills-2-tab">
                                        <div class="row">
                                        <c:forEach items="${listNewM}" var="o">
                                            <div class="col-md-4 text-center">
                                                <div class="menu-wrap">
                                                
                                                    <a href="#" class="menu-img img mb-4" style="background-image: url(${o.img});"></a>
                                                    <div class="text">
                                                        <h3><a href="#">${o.name}</a></h3>
                                                        <p>${o.desc}</p>
                                                        <p class="price"><span>$ ${o.price}</span></p>
                                                        <p><a href="#" class="btn btn-primary btn-outline-primary">Add to cart</a></p>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                        </div>
                                    </div>
                                    
                                    <div class="tab-pane fade show " id="v-pills-3" role="tabpanel" aria-labelledby="v-pills-3-tab">
                                        <div class="row">
                                        <c:forEach items="${listNewD}" var="o">
                                            <div class="col-md-4 text-center">
                                                <div class="menu-wrap">
                                                
                                                    <a href="#" class="menu-img img mb-4" style="background-image: url(${o.img});"></a>
                                                    <div class="text">
                                                        <h3><a href="#">${o.name}</a></h3>
                                                        <p>${o.desc}</p>
                                                        <p class="price"><span>$ ${o.price}</span></p>
                                                        <p><a href="#" class="btn btn-primary btn-outline-primary">Add to cart</a></p>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                        </div>
                                    </div>
                                    
                                    <div class="tab-pane fade show " id="v-pills-4" role="tabpanel" aria-labelledby="v-pills-4-tab">
                                        <div class="row">
                                        <c:forEach items="${listNewDr}" var="o">
                                            <div class="col-md-4 text-center">
                                                <div class="menu-wrap">
                                                
                                                    <a href="#" class="menu-img img mb-4" style="background-image: url(${o.img});"></a>
                                                    <div class="text">
                                                        <h3><a href="#">${o.name}</a></h3>
                                                        <p>${o.desc}</p>
                                                        <p class="price"><span>$ ${o.price}</span></p>
                                                        <p><a href="#" class="btn btn-primary btn-outline-primary">Add to cart</a></p>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                        </div>
                                    </div>
                                    
                                    
                                    
                                    
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>


        <jsp:include page="component/footer.jsp"></jsp:include>



        <!-- loader -->
        <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


        <script src="js/jquery.min.js"></script>
        <script src="js/jquery-migrate-3.0.1.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/jquery.stellar.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/aos.js"></script>
        <script src="js/jquery.animateNumber.min.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script src="js/jquery.timepicker.min.js"></script>
        <script src="js/scrollax.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
        <script src="js/google-map.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>
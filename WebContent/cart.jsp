<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Electronic</title>
	<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <link href="Css/Style.css" rel="stylesheet" />
    <script src="Js/jquery-3.2.1.min.js"></script>
    <!-- <script src = "https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->

    <style>
        @import url('https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico');
    </style>
</head>
<body>
    <section>
        <!-- This is Section 1 of the page -->
        
            <img src="Images/Website_Logo.png" class="logo" />
    
        <div class="section2">
            <input type="text" placeholder="search" class="txtsrch" /><button type="button" class="btnsrch">Search</button>

            <img src="Images/if_call_322424.png" class="call-icon" />
            <span class="tel-no">0866171367</span>
            <nav>
                <a href="/ThiGK//IndexServlet" class="menuitem" >Home</a>
                <a class="menuitem" >Cart</a>
            </nav>
            <p class="featuredpara">List Cart</p>

            <div class="products">
            <c:forEach items="${listCart}" var="cart">
                <fieldset class="col1">
                    <h3>${cart.getId()}</h3>
                    <img src="${cart.getImages()}" class="img1" />
                    <h3>${cart.getName()}</h3>
                    <h3>$${cart.getPrice()}</h3>
                    <a href="/ThiGK//deleteCart?id=${cart.getProductID()}">Delete</a>
                </fieldset>
                </c:forEach>
            </div>
         </div>
    </section>

    <div class="background"></div>

    <div class="footer">

        <div class="outer">
            <div class="inner">
                <h4>Information</h4>
                <a>About</a>
                <a>Delivery Information</a>
                <a>Privacy Policy</a>
                <a>Tearm & Condition</a>
            </div>
            <div class="inner2">
                <h4>Costomer Information</h4>
                <a>Contact Us</a>
                <a>Return</a>
                <a>Site Map</a>
            </div>
            <div class="inner">
                <h4>My Account</h4>
                <a>Order History</a>
                <a>Wish list</a>
                <a>News Latter</a>
            </div>
            <div class="inner2">
                <h4>Follow Us</h4>
                <a>Facebook</a>
                <a>Twitter</a>
                <a>Google +</a>
                <a>Youtube</a>
            </div>
        </div>

        <hr />
        <div class="copyright">
            <span>Powered by Daily Tuition © 2021</span>
        </div>

    </div>

   
</body>
</html>

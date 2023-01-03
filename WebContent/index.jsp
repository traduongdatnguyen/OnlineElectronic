<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
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
        <div class="section1">
            <img src="Images/Website_Logo.png" class="logo" />
            <div class="navigation">
                <img src="Images/if_List_Text_Menu_Numbers_String_Burger_1329080.png" class="toggle" />
                <a class="cgr" >Categories</a>
            </div>
            <div>
            <c:forEach items="${listCategory}" var="category">
                <a class="submenu">${category.getName()}</a>
              </c:forEach>
            </div>

            <p class="para1">Specials</p>
            <div class="Special">
			<c:forEach items="${listProductSale}" var="product">
			 <fieldset>
			 <legend>${product.getStatus()}</legend>
                    <div class="div1">
                        <img src="${product.getImages()}" class="img1" />
                    </div>
                    <div class="div2">
                        <h3>$${product.getPriceNew()}<strike>$${product.getPrice()}</strike></h3>
                        <p>${product.getName()} ,${product.getDetail()}</p>
                        <a href="/ThiGK//AddCartServlet?id=${product.getProductID()}" >Buy Now</a>
                    </div>
                </fieldset>
                
			</c:forEach>   
            </div>
        </div>
        <!-- This is section 2 of the page -->
        <div class="section2">
            <input type="text" placeholder="search" class="txtsrch" /><button type="button" class="btnsrch">Search</button>
            <img src="Images/if_call_322424.png" class="call-icon" />
            <span class="tel-no">+084-866171367</span>
            
            <nav>
            	<span class="menuitem">Welcome back ${Name}</span>
                <c:if test="${admin}"><a href="add.jsp" class="menuitem" >AddProduct</a> </c:if>
                  <c:if test="${check}"><a href="logout.jsp"  class="menuitem">Logout</a> </c:if>
                  <c:if test="${admin}"><a href="/ThiGK//AdminServlet" class="menuitem" >Admin</a> </c:if> 
                  <a href="/ThiGK//CartServlet" class="menuitem">Cart</a>
            </nav>

            <div class="slider">
                <div class="slides">
                <c:forEach items="${listProductSlider}" var="slide">
                <div class="slide1">
                        <img src="${slide.getImages()}" class="img1" />
                    </div>
                </c:forEach>               
                </div>
            </div> 
            
            <!-- lấy từ data ra --> 
            <c:forEach items="${listProductHot}" var="Hot">
            <div class="content1">
            <!--dai dien cho mang la items-->
               <!--   hot la dai dien cho tung items items trong mang -->
               
                <div class="innertitle1">
                    <h3>${Hot.getName() }</h3>
                    <p class="para1">${Hot.getDetail()}</p>
                    <br/>
                    <a class="para1" href="/ThiGK//AddCartServlet?id=${Hot.getProductID()}">Shop Now!</a>
                    
                </div>
                <div class="inner1">
                    <img src="${Hot.getImages()}" class="img1" />
                </div>
                
            </div>
             </c:forEach>
            <p class="featuredpara">Latest</p>
			
            <div class="products">
            <c:forEach items="${listProductNew}" var="New"> 
            
           		 <fieldset class="col1">
                    <legend>${New.getStatus() }</legend>
                    <img src="${New.getImages() }" class="img1" />
                    <h3>$${New.getPriceNew()}<strike>$${New.getPrice()}</strike></h3>
                    <h4>${New.getName()}</h4>
                    <p>${New.getDetail()}</p>
                    <a class="para1" href="/ThiGK//AddCartServlet?id=${New.getProductID()}">Buy Now!</a>
                </fieldset>
             </c:forEach>
            </div>
            <p class="featuredpara">Featured</p>
            <div class="products">
            <c:forEach items="${listProductHotDeal}" var="HotDeal"> 
                <fieldset class="col1">
                    <legend>${HotDeal.getStatus() }</legend>
                    <img src="${HotDeal.getImages() }" class="img1" />
                    <h3>$${HotDeal.getPriceNew()}<strike>$${HotDeal.getPrice()}</strike></h3>
                    <h4>${HotDeal.getName()}</h4>
                    <p>${HotDeal.getDetail()}</p>
                    <a class="para1" href="/ThiGK//AddCartServlet?id=${HotDeal.getProductID()}">Buy Now!</a>
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

    <script>

        var $slides = $('.slides');
        var $slide = $('.slide1');
        var count = 1;

        $(document).ready(function () {

            setInterval(function () {

                $slides.animate({ 'margin-left': '-=68vw' }, 1200, function () {

                    count++;
                    if (count === 4) {
                        $slides.css("margin-left", 0);
                        count = 1;
                    }

                });
            }, 4000);
        });

    </script>
</body>
</html>

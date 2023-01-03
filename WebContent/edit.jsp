<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Add Product</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="Css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Update Product!</h1>
              </div>
              <form class="user" action="/ThiGK//editProductServlet" method="post">
              <c:forEach items="${listProductByID}" var="list">
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input value="${list.getName()}" type="text" name="Name" class="form-control form-control-user" id="" placeholder="Name">
                  </div>
                  <div class="col-sm-6">
                    <input value="${list.getDetail()}" type="text" name="Detail" class="form-control form-control-user" id="" placeholder="Detail" >
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input value="${list.getPrice()}" type="text" name="Price" class="form-control form-control-user" id="" placeholder="Price">
                  </div>
                  <div class="col-sm-6">
                    <input value="${list.getPriceNew()}" type="text" name="PriceNew" class="form-control form-control-user" id="" placeholder="PriceNew" >
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input value="${list.getImages()}" type="file" name="Images" class="form-control form-control-user" id="" placeholder="Images">
                  </div>
                  <div class="col-sm-6">
                    <input value="${list.getStatus()}" type="text" name="Status" class="form-control form-control-user" id="" placeholder="Status" >
                  </div>
                </div>
                <input type="submit" class="btn btn-primary btn-user btn-block" >
                
                <hr>
              </c:forEach>
              <a class="btn btn-primary btn-user btn-block" href="/ThiGK//AdminServlet">Back</a>
              </form>
              <hr>
              
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="Js/sb-admin-2.min.js"></script>

</body>

</html>

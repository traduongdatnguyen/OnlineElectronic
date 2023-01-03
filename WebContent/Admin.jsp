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

  <title>Admin</title>

  <!-- Custom fonts for this template -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="Css/sb-admin-2.min.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">
  <div id="wrapper">
    <div id="content-wrapper" class="d-flex flex-column">
      <div id="content">
        <div class="container-fluid">
          <h1 class="h3 mb-2 text-gray-800"><a href="/ThiGK/IndexServlet">< Home </a> </h1>
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">DataTables Product</h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                
                 <thead>
                    <tr>
                      <th>ID</th>
                      <th>Name</th>
                      <th>Detail</th>
                      <th>Price</th>
                      <th>PriceNew</th>
                      <th>Images</th>
                      <th>Status</th> 
	                    </tr>
                  </thead>
                  <c:forEach items="${listProduct}" var="product">
                  <tbody>
                    <tr>
                      <td>${product.getProductID()}</td>
                      <td>${product.getName()}</td>
                      <td>${product.getDetail()}</td>
                      <td>$${product.getPrice()}</td>
                      <td>$${product.getPriceNew()}</td>
                      <td>${product.getImages()}</td>
                      <td>${product.getStatus()}</td>
                      <td><a href="/ThiGK//getDataEditServlet?id=${product.getProductID()}">Update</a></td>
                      <td><a href="/ThiGK//deleteProductServlet?id=${product.getProductID()}">Delete</a></td>
                      
                    </tr>
                  </tbody>
                </c:forEach>
                 
                </table>
              </div>
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

  <!-- Page level plugins -->
  <script src="vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="Js/demo/datatables-demo.js"></script>

</body>

</html>

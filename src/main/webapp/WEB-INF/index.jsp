
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="./css/app.css" rel="stylesheet">
</head>
<body>
<div class="container">
<h3 class="pb-4 mb-4 fst-italic border-bottom  ">
POSTS
</h3>


<c:forEach var="p" items="${lista}">

 <div class="row justify-content-center">
    <div class="col-12 col-sm-8 col-md-6 col-lg-4">
      <div class="card">
 
        <div class="card-body">
        <h4 class="card-title"><c:out value="${p.titulo}"/></h2>
          <small class="text-muted cat">
            <i class="far fa-clock text-info"></i> <c:out value="${p.autor}"/>
          </small>
          <p class="card-text"><c:out value="${p.texto}"/></p>
        <div class="card-footer text-muted d-flex justify-content-between bg-transparent border-top-0">
           
        </div>
      </div>
    </div>
  </div>
        <p></p>
</c:forEach>


</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
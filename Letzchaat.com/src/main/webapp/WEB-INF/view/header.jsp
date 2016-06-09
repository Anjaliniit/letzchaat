<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:url value="/resources/bootstrap/css/" var="bcss"/>
<c:url value="/resources/bootstrap/js/" var="bjs"/>
<c:url value="/resources/images/" var="imgloc"/>
<html>
<head><title>LetZChaat</title>
<link rel="stylesheet" href="${bcss}bootstrap.min.css"/>
<link rel="stylesheet" href="${bcss}bootstrap-theme.min.css"/>
<script src="${bjs}angular.min.js"></script>
<style>
<!--nav-bar script-->
.navbar-header{height:150px; color:blue;}
#main{height:100%;}

<!--footer script-->
#footer {
   position:absolute;
   bottom:0px;
   width:100%;
   height:120px;   /* Height of the footer */
}


</style>
</head>
<body>
<nav class="navbar navbar-inverse .navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="${session.getContextPath()}/Letzchaat.com/index"><h3>LetZChaat</h3></a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li class="active"><a href="${session.getContextPath()}/Letzchaat.com/index">Home</a></li>
      <li><a href="#">Forums</a></li>
      <li><a href="#">Groups</a></li>
      <li><a href="#">Members</a></li>
      <li><a href="#">Blog</a></li> 
       <li><a href="${session.getContextPath()}/Letzchaat.com/login"><span
							class="glyphicon glyphicon-user"></span> Sign In</a></li>
      <li><a href="${session.getContextPath()}/Letzchaat.com/signup"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
    </ul>
    
  </div>
</nav>
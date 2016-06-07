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

.navbar-fixed-top{height:150px; color:blue;}
.navbar-brand{text-align: center;}

</style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="index">LetZChaat</a>
    <ul class="nav navbar-nav navbar-right">
             <li><form method="post" action="login"><input style="margin-top: 8px" class="form-control" type="text" placeholder="Username" /></li>
             <li>&nbsp;&nbsp;</li>
             <li><input style="margin-top: 8px" class="form-control" type="password" placeholder="Passsword" /></li>
             <li>&nbsp;&nbsp;</li>
             <li><input style="margin-top: 8px" class="btn btn-info" name="commit" type="submit" value="Log In" /></form></li>
             <li>&nbsp;&nbsp;</li>
           </ul>
  </div>
</nav>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<center><h2 class="add-user-heading">Create an account</h2></center>
<p>&nbsp;</p>
 <div class="row">
<div class="col-xs-2"><img src="${imgloc}home1.jpg" height="200" width="200" class="img-responsive" alt="home"></div>
<div class="col-xs-1"></div>
<div class="col-xs-9">

<div class="container central">
		<form:form action="register" model="user" commandName="user">	
		<div class="row">
			<div class=col-xs-3><form:label path="fname"><spring:message text="FirstName"/></form:label></div>
			<div class=col-xs-4><form:input path="fname"/></div>
			<div class=col-xs-5><form:errors path="fname" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-3><form:label path="lname"><spring:message text="LastName"/></form:label></div>
			<div class=col-xs-4><form:input path="lname"/></div>
			<div class=col-xs-5><form:errors path="lname" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-3><form:label path="emailid"><spring:message text="Email"/></form:label></div>
			<div class=col-xs-4><form:input path="emailid"/></div>
			<div class=col-xs-5><form:errors path="emailid" cssStyle="color: #ff0000;"/></div>
		</div>
	    <div class="row">
			<div class=col-xs-3><form:label path="password"><spring:message text="Password"/></form:label></div>
			<div class=col-xs-4><form:input path="password"/></div>
			<div class=col-xs-5><form:errors path="password" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-3><form:label path="gender"><spring:message text="Gender"/></form:label></div>
			<div class=col-xs-4> 
			 <form:select path="gender">
				<form:option value="" label="--- Select ---" />
				<form:option value="Male">Male</form:option>
				<form:option value="Female">Female</form:option>
		     </form:select></div>
           <div class=col-xs-5><form:errors path="gender" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-3><form:label path="mobile"><spring:message text="Mobile"/></form:label></div>
			<div class=col-xs-4><form:input path="mobile"/></div>
			<div class=col-xs-5></div>
		</div>
		<div class="row">
			<div class=col-xs-3><form:label path="dob"><spring:message text="DateOfBirth"/></form:label></div>
			<div class=col-xs-4><form:input path="dob"/></div>
			<div class=col-xs-5><form:errors path="dob" cssStyle="color: #ff0000;"/></div>
		</div>		
		<div class="row">
			<div class=col-xs-3></div>
		    <div class=col-xs-4><input type="submit" value="<spring:message text="ADD USER"/>"></div>
		    <div class=col-xs-5></div>
		</div>
	    </form:form>
	 </div>
  </div>
</div>





<footer>



</footer>
<script src="${bjs}jquery-2.1.1.min.js"></script>
    <script src="${bjs}bootstrap.min.js"></script>

</body>
</html>



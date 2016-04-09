<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://example.com/tags"%>

<!doctype html>
<html data-ng-app>
<head>
<title>Can You?</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script src="menuScript.js"></script>
<script src="smooth-scrolling.js"></script>

<!--  angular files -->
<script src="angular.js"></script>
<script src="emailController.js"></script>
<script src="loading.js"></script>

<!-- initialize smooth scroll -->
<script>
	smoothScroll.init();
</script>
<!-- ----------------------------- -->


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<link href="<c:url value='app.css' />" rel="stylesheet"></link>
<link href="<c:url value='text.css' />" rel="stylesheet"></link>
<link href="<c:url value='buttons.css' />" rel="stylesheet"></link>
<link href="<c:url value='menuCss.css' />" rel="stylesheet"></link>
<link href="<c:url value='submenu.css' />" rel="stylesheet"></link>

</head>

<body>

	<div id='cssmenu'>
		<ul>
			<li><a data-scroll href='#tutorials'>Tutorial</a></li>
			<li><a data-scroll href='#aboutUs'>Description</a></li>
			<li><a data-scroll href='#contact'>Contact</a></li>
		</ul>
	</div>



	<div class="tutorials container-fluid" id="tutorials">

		<div class="java-basic-text">
			<h1>
				<strong>Java basic series</strong>
			</h1>
		</div>

		<iframe width="40%" height="50%"
			src="https://www.youtube.com/embed/watch?v=Sv6dMFF_yts&list=RDgnhXHvRoUd0&index=22"> </iframe>
			
		<div class="java-basic-text">
			<p> Today we will  learn about java. <br> 
			after this series you will have knowledge about lists, maps, sets, interfaces, abstract class etc. <br>
			just watch it!</p>
		</div>	
			
	</div>


	<div class="aboutUs" id="aboutUs" data-ng-controller="List">

		<div class="aboutUs-text">
			<h1>
				<strong>thirst for knowledge? </strong>
			</h1>
			<p>check description, github projects and some interesting links</p>

		</div>

		<div class="article-tabs">
			<ul>
				<li class="action-button shadow animate blue"><a
					data-ng-click="changeArticle(1)">Description</a></li>
				<li class="action-button shadow animate blue"><a
					data-ng-click="changeArticle(2)">GitHub</a></li>
				<li class="action-button shadow animate blue"><a
					data-ng-click="changeArticle(3)">More informations</a></li>
			</ul>
		</div>

		<div class="article-content">{{article.content}}</div>




	</div>


	<t:contactform>
	</t:contactform>






</body>
</html>
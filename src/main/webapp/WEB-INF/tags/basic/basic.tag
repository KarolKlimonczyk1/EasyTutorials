<%-- <%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<meta http-equiv="Content-type" content="text/html;charset=ISO-8859-1">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<%-- <c:set var="req" value="${pageContext.request}" /> --%>
<%-- <c:set var="url">${req.requestURL}</c:set> --%>
<%-- <c:set var="baseURL" --%>
<%-- 	value="${fn:substring(url, 0, fn:length(url) - fn:length(req.requestURI))}${req.contextPath}/" /> --%>

<!doctype html>
<html>
<head>
<title>Can You?</title>

	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.1/angular.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.1/angular-route.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.1/angular-sanitize.min.js"></script>

	<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script src="menuScript.js"></script>
<script src="smooth-scrolling.js"></script>

<!--  angular files -->

<script src="angular.js"></script>
<script src="emailController.js"></script>
<script src="loading.js"></script>
	<script src="articleEditorController.js"></script>
	<script src="htmlInjection.js"></script>
	<script src="articlesListController.js"></script>

<!-- initialize smooth scroll -->
<script>
	smoothScroll.init();
</script>
<!-- ----------------------------- -->

	<%--------------Text editor-----------------------%>
	<script src="//cdn.tinymce.com/4/tinymce.min.js"></script>
	<%--<script>tinymce.init({--%>
	<%--selector:'textarea',--%>
	<%----%>
	<%--plugins: "image",--%>
	<%--menubar: "insert",--%>
	<%--toolbar: "image",--%>
	<%--image_list: [--%>
	<%--{title: 'My image 1', value: 'http://www.tinymce.com/my1.gif'},--%>
	<%--{title: 'My image 2', value: 'http://www.moxiecode.com/my2.gif'}--%>
	<%--]--%>


	<%--});</script>--%>

	<script>
		tinymce.init({
			selector: 'custom_textarea',
			height: 500,
			plugins: [
				"advlist autolink lists link image charmap print preview anchor",
				"searchreplace visualblocks code fullscreen",
				"insertdatetime media table contextmenu paste imagetools"
			],
			toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image",
			imagetools_cors_hosts: ['www.tinymce.com', 'codepen.io'],
			content_css: [
				'//fast.fonts.net/cssapi/e6dc9b99-64fe-4292-ad98-6974f93cd2a2.css',
				'//www.tinymce.com/css/codepen.min.css'
			]
		});
	</script>

	<%--------------------------------------------------%>

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

<body ng-app="myapp">

	<div id='cssmenu'>
		<ul>
			<li class='active'><a data-scroll href='#home'>Home</a></li>
			<li><a data-scroll href='#tutorials'>Tutorials</a></li>
			<li><a data-scroll href='#aboutUs'>About us</a></li>
			<li><a data-scroll href='#contact'>Contact</a></li>
		</ul>
	</div>

	<!-- header  -->
	<header class="text-center" id="home">

		<div class="intro-text">
			<h1>
				EASY <strong><span class="color">PROGRAMMING</span></strong>
			</h1>
			<p>the simplest tutorials with the best knowledge</p>
			<a href="#aboutUs" class="btnAboutUs">About us</a>
		</div>
	</header>



	<div class="tutorials container-fluid" id="tutorials">

		<div class="tutorial-text">
			<h1>
				<strong>SELECT YOUR WAY!</strong>
			</h1>
			<p>start Your adventure and select one of series</p>

		</div>

		<div class="row">
			<div class="img-container col-xs-6 col-sm-3 col-md-2  col-xl-1">
				<a href="http://localhost:8080/mavenWebApp/cplus-basic"  target="_blank" ><img
						src="http://www.paperoff.com.br/img/brain.png"
						alt="" /> </a>
				<p>C++ Basic</p>
			</div>
			<div class="img-container col-xs-6 col-sm-3 col-md-2  col-xl-1">
				<a href="http://localhost:8080/mavenWebApp/java-basic"  target="_blank" ><img
					src="https://www.kyleadams.me/wp-content/uploads/2014/10/blogicon2.png"
					alt="" /> </a>
				<p>JAVA Basic</p>
			</div>
			<div class="img-container col-xs-6 col-sm-3 col-md-2  col-xl-1">
				<img
					src="https://cdn3.iconfinder.com/data/icons/brain-games/1042/Puzzle.png"
					alt="" />
				<p>JAVA Advance</p>
			</div>
			<div class="img-container col-xs-6 col-sm-3 col-md-2  col-xl-1">
				<img
					src="https://cdn3.iconfinder.com/data/icons/brain-games/1042/Tic-Tac-Toe-Game.png"
					alt="" />
				<p>MySql Basic</p>
			</div>
			<div class="img-container col-xs-6 col-sm-3 col-md-2  col-xl-1">
				<img src="http://www.paperoff.com.br/img/brain.png" alt="" />
				<p>JavaScript Basic</p>
			</div>
			<div class="img-container col-xs-6 col-sm-3 col-md-2  col-xl-1">
				<img
					src="https://cdn3.iconfinder.com/data/icons/brain-games/1042/Chess-Game.png"
					alt="" />
				<p>Spring Framework Basic</p>
			</div>
		</div>
	</div>


	<div class="aboutUs" id="aboutUs" ng-controller="Ctrl">

		<div class="aboutUs-text">
			<h1>
				<strong>Are you interested?</strong>
			</h1>
			<p>read more about us</p>

		</div>

		<div class="article-tabs">
			<ul>
				<li class="action-button shadow animate blue"><a
						data-ng-click="changeArticle(1)">Projects</a></li>
				<li class="action-button shadow animate blue"><a
						data-ng-click="changeArticle(2)">History</a></li>
				<li class="action-button shadow animate blue"><a
						data-ng-click="changeArticle(3)">News</a></li>
				<li class="action-button shadow animate blue"><a
						data-ng-click="changeArticle(4)">Articles</a></li>
			</ul>
		</div>


		<div class="article-content" ng-bind-html="article.content">
		</div>


	</div>

	<!-- ------------contact form ---------------------- -->

	<div id="contact" class="contact" data-ng-controller="ContactForm">

		<form data-ng-submit="sendEmail(message)" class="smart-green">
			<h1>
				Contact Form <span>Please fill all the texts in the fields.</span>
			</h1>
			<label> <span>Your Name :</span> <input
				data-ng-model="message.senderName" placeholder="Firstname Surname"
				type="text" required />
			</label> <label> <span>Your Email :</span> <input
				data-ng-model="message.senderEmail" placeholder="example@gmail.com"
				type="email" required />
			</label> <label> <span>Message :</span> <textarea
					data-ng-model="message.content" placeholder="Your Message to Us"
					required></textarea>
			</label> <label> <span>&nbsp;</span> <input type="submit"
				class="button" value="Send" />
			</label> {{messageSending}}
		</form>

	</div>


	<div class="aboutUs" data-ng-controller="ArticleEditor">
		<h1> Admin area</h1>
		<div data-ng-controller="ArticleListCtrl">
			<select id="oldTopic" ng-model="changedArticle"
					ng-options="article.topic for article in articleList"></select>
			Set new topic name: <input type="text" id="topicName">
		</div>

		<form data-ng-submit="setArticle()">
			<%--<form data-ng-submit="setArticle(articleEditor.content)" >--%>
			<custom_textarea id="myid"
			<%--data-ng-model="articleEditor.content" placeholder="Article Editor" --%>
			></custom_textarea>
			<input type="submit" class="button" value="Send"/>


		</form>

	</div>


	</div>

</body>
</html>
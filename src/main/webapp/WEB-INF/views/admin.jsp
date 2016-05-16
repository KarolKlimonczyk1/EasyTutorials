<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%--<%@taglib prefix="t" uri="http://example.com/tags" %>--%>

<%--<meta http-equiv="Content-type" content="text/html;charset=ISO-8859-1">--%>


<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>--%>

<%--<!doctype html>--%>
<%--<html>--%>
<%--<head>--%>
<%--<title>Can You?</title>--%>

<%--<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.1/angular.min.js"></script>--%>
<%--<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.1/angular-route.js"></script>--%>
<%--<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.1/angular-sanitize.min.js"></script>--%>

<%--<script src="http://code.jquery.com/jquery-latest.min.js"--%>
<%--type="text/javascript"></script>--%>
<%--<script src="menuScript.js"></script>--%>
<%--<script src="smooth-scrolling.js"></script>--%>

<%--<!--  angular files -->--%>

<%--<script src="angular.js"></script>--%>
<%--<script src="emailController.js"></script>--%>
<%--<script src="loading.js"></script>--%>
<%--<script src="articleEditorController.js"></script>--%>
<%--<script src="htmlInjection.js"></script>--%>
<%--<script src="articlesListController.js"></script>--%>

<%--<!-- initialize smooth scroll -->--%>
<%--<script>--%>
<%--smoothScroll.init();--%>
<%--</script>--%>
<%--<!-- ----------------------------- -->--%>

<%--&lt;%&ndash;------------Text editor---------------------&ndash;%&gt;--%>
<%--<script src="//cdn.tinymce.com/4/tinymce.min.js"></script>--%>

<%--<script>--%>
<%--tinymce.init({--%>
<%--selector: 'custom_textarea',--%>
<%--height: 500,--%>
<%--plugins: [--%>
<%--"advlist autolink lists link image charmap print preview anchor",--%>
<%--"searchreplace visualblocks code fullscreen",--%>
<%--"insertdatetime media table contextmenu paste imagetools"--%>
<%--],--%>
<%--toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image",--%>
<%--imagetools_cors_hosts: ['www.tinymce.com', 'codepen.io'],--%>
<%--content_css: [--%>
<%--'//fast.fonts.net/cssapi/e6dc9b99-64fe-4292-ad98-6974f93cd2a2.css',--%>
<%--'//www.tinymce.com/css/codepen.min.css'--%>
<%--]--%>
<%--});--%>
<%--</script>--%>

<%--&lt;%&ndash;----------------------------------------------&ndash;%&gt;--%>

<%--<link rel="stylesheet"--%>
<%--href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"--%>
<%--integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"--%>
<%--crossorigin="anonymous">--%>

<%--<link href="<c:url value='app.css' />" rel="stylesheet"></link>--%>
<%--<link href="<c:url value='text.css' />" rel="stylesheet"></link>--%>
<%--<link href="<c:url value='buttons.css' />" rel="stylesheet"></link>--%>
<%--<link href="<c:url value='menuCss.css' />" rel="stylesheet"></link>--%>
<%--<link href="<c:url value='submenu.css' />" rel="stylesheet"></link>--%>

<%--</head>--%>
<%--<body>--%>

<%--<div class="aboutUs" data-ng-controller="ArticleEditor">--%>
<%--<h1> Admin area</h1>--%>
<%--<div data-ng-controller="ArticleListCtrl">--%>
<%--<select id="oldTopic" ng-model="changedArticle"--%>
<%--ng-options="article.topic for article in articleList"></select>--%>
<%--Set new topic name: <input type="text" id="topicName">--%>
<%--</div>--%>

<%--<form data-ng-submit="setArticle()">--%>
<%--&lt;%&ndash;<form data-ng-submit="setArticle(articleEditor.content)" >&ndash;%&gt;--%>
<%--<custom_textarea id="myid"--%>
<%--&lt;%&ndash;data-ng-model="articleEditor.content" placeholder="Article Editor" &ndash;%&gt;--%>
<%--></custom_textarea>--%>
<%--<input type="submit" class="button" value="Send"/>--%>


<%--</form>--%>

<%--</div>--%>

<%--</body>--%>
<%--</html>--%>


<%-- <%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<meta http-equiv="Content-type" content="text/html;charset=ISO-8859-1">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


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
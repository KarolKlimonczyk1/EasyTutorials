<meta http-equiv="Content-type" content="text/html;charset=ISO-8859-1">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
    <div class="aboutUs-text">
        <h1>
            <strong>Admin area</strong>
        </h1>

    </div>
    <div data-ng-controller="ArticleListCtrl">
        <select id="oldTopic" ng-model="changedArticle"
                ng-options="article.topic for article in articleList"></select>
        <input type="text" id="topicName" placeholder="New topic name">
    </div>

    <form data-ng-submit="setArticle()">
        <%--<form data-ng-submit="setArticle(articleEditor.content)" >--%>
        <custom_textarea id="myid"
        <%--data-ng-model="articleEditor.content" placeholder="Article Editor" --%>
        ></custom_textarea>
        <input type="submit" class="button" value="Send"/>


    </form>


</div>


<div ng-app="rootApp" class="aboutUs" style="background: #0db6c6;" data-ng-controller="pictureController">

    <form data-ng-submit="setTutorialsMenu(cpp)">

        <span> <h3 style="color: black">C++: </h3>
            <input data-ng-model="cpp.title" type="hidden" ng-init="cpp.title ='C++'"> </input>
            <input data-ng-model="cpp.picture" type="text"> </input> </span>

        <input type="submit" class="button" value="Save"/>
    </form>

    <form data-ng-submit="setTutorialsMenu(java)">

        <span> <h3 style="color: black">JAVA: </h3>
            <input data-ng-model="java.title" type="hidden" ng-init="java.title ='java'"> </input>
            <input data-ng-model="java.picture" type="text"> </input> </span>

        <input type="submit" class="button" value="Save"/>
    </form>


    <form data-ng-submit="setTutorialsMenu(linux)">

        <span> <h3 style="color: black">LINUX: </h3>
            <input data-ng-model="linux.title" type="hidden" ng-init="linux.title ='linux'"> </input>
            <input data-ng-model="linux.picture" type="text"> </input> </span>

        <input type="submit" class="button" value="Save"/>
    </form>


    <h2><a href="<c:url value="/logout" />">Logout</a></h2>


</div>


</body>
</html>
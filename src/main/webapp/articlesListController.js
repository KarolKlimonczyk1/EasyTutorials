var urlBase = "http://localhost:8080/mavenWebApp";

app.controller('ArticleListCtrl', function ($scope, $http, $sce) {


    $http.post(urlBase + '/article-list').success(function (data) {

            $scope.articleList = data;
        }
    );
});
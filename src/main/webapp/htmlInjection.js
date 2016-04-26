var urlBase = "http://localhost:8080/mavenWebApp";
var articleJson = {
    "id": 1,
    "topic": "top"
};

var app = angular.module('myapp', ['ngRoute', 'ngSanitize']);

app.controller('Ctrl', function ($scope, $http, $sce) {
    
    $scope.number = 1;

    articleJson = {
        "id": $scope.number,
        "topic": "top"
    };

    $http.post(urlBase + '/list', articleJson).success(function (data) {

            $scope.article = data;
            $scope.article.content = $sce.trustAsHtml($scope.article.content);

        }
    );

    $scope.changeArticle = function (articleNumber) {

        articleJson = {
            "id": articleNumber,
            "topic": "top"
        };

        $http.post(urlBase + '/list', articleJson).success(function (data) {

                $scope.article = data;
                $scope.article.content = $sce.trustAsHtml($scope.article.content);

            }
        );

    }


});
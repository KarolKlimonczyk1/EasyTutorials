var urlBase = "http://localhost:8080/mavenWebApp";

function getCsrfHeader() {
    var csrfToken = $("input[name='_csrf']").val();

    var headers = {};
    headers["X-CSRF-TOKEN"] = csrfToken;
    headers["_csrf"] = csrfToken;
    return headers;
};

app.controller('ArticleListCtrl', function ($scope, $http, $sce) {

    var headers = getCsrfHeader();

    var req = {
        method: 'POST',
        url: urlBase + '/article-list',
        headers: headers
    };

    $http.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
    $http(req).success(function (data) {

            $scope.articleList = data;
        }
    );
});


app.controller('pictureController', function ($scope, $http) {


    $http.post(urlBase + '/gettutorials').success(function (data) {

            $scope.tutorialsMenu = data;
        }
    ).error(function () {
        alert("picture controller error! Data:");

    });


    $scope.setTutorialsMenu = function (data) {

        var json = {
            "title": data.title,
            "picture": data.picture
        };

        $http.post(urlBase + '/updatetutorialsmenu', json).success(function () {

                $scope.java.picture = "";
                $scope.cpp.picture = "";
                $scope.linux.picture = "";
            }
        ).error(function () {
            alert("set tutorial error");
        });
    }
});

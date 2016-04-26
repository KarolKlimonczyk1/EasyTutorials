
var urlBase = "http://localhost:8080/mavenWebApp";
var articleJson = {
	"id" : 1,
	"topic" : "top"
};

function List($scope, $http) {


	$scope.number = 1;

	articleJson = {
		"id" : $scope.number,
		"topic" : "top"
	};

	$http.post(urlBase + '/list', articleJson).success(function(data) {

			$scope.article = data;

		}

	);

	$scope.changeArticle = function(articleNumber) {

		articleJson = {
			"id" : articleNumber,
			"topic" : "top"
		};

		$http.post(urlBase + '/list', articleJson).success(function(data) {

				$scope.article = data;

			}

		);

	}

}
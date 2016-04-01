var urlBase="http://localhost:8080/mavenWebApp";

//function Hello($scope, $http) {
//    $http.get('http://rest-service.guides.spring.io/greeting').
//        success(function(data) {
//            $scope.greeting = data;
//            $scope.myname="Karol";
//        });
//}

function List($scope, $http){
	
	
		 $http.get(urlBase+'/list').

	     success(function(data) {

	         $scope.country = data;
	         
	        }
	
	     );
}
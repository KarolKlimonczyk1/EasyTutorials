var urlBase = "http://localhost:8080/mavenWebApp";

var emailJson = {
	"senderName" : "default",
	"senderEmail" : "default",
	"content" : "default"
}

function ContactForm($scope, $http) {


	$scope.sendEmail = function(data) {

		
			$scope.messageSending="Please wait, message is sending...";


		$http.post(urlBase + '/sendEmail', data).success(function() {

			$scope.message.senderName="";
			$scope.message.senderEmail="";
			$scope.message.content="";
			
			$scope.messageSending="";
		}

		).error(function(){
			$scope.messageSending="Something was wrong. Probably email inputted by you doesn't exist.";
			
		});

	}

}


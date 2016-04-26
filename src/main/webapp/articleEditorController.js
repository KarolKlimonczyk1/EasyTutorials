var urlBase = "http://localhost:8080/mavenWebApp";


var emailJson = {
    "senderName": "default",
    "senderEmail": "default",
    "content": "default"
}

function ArticleEditor($scope, $http) {


    $scope.setArticle = function () {
        var newContent = tinymce.get("myid").getContent();
        

        $http.post(urlBase + '/article-editor', newContent).success(function () {


            }
        ).error(function () {
            // $scope.articleEditor.content="Something was wrong. Please try again."

        });

    }

}


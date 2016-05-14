var urlBase = "http://localhost:8080/mavenWebApp";


function ArticleEditor($scope, $http) {


    $scope.setArticle = function () {
        // var newContent = tinymce.get("myid").getContent();

        var newArticle = {
            topic: document.getElementById("oldTopic").value, content: tinymce.get("myid").getContent(),
            newTopic: document.getElementById("topicName").value
        };


        $http.post(urlBase + '/article-editor', newArticle).success(function () {

            
            }
        ).error(function () {
            // $scope.articleEditor.content="Something was wrong. Please try again."

        });

    }

}


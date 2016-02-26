<!--  <!doctype html>
<html data-ng-app>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
   		<script src="hello.js"></script>
    </head>
    <body>
        <div>
        <label>Name:</label>
        <input type="text" data-ng-model="yourName" placeholder="Enter a name here">
        <hr>
        <h1>Hello {{yourName}}!</h1>
        </div>
    </body>
</html>

 -->

<!doctype html>
<html data-ng-app>
<head>
<title>Hello AngularJS</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script src="hello.js"></script>
</head>

<body>
	<div data-ng-controller="Hello">
		<p>The ID is {{greeting.id}}</p>
		<p>The content is {{greeting.content}}</p>

	</div>

	<div data-ng-controller="List">

	

		<ul>
			<li data-ng-repeat="x in country">{{x.countryName }}</li>
		</ul>
		
	<input data-ng-model="countryNumber" >
		<p>Number: {{countryNumber}} </p> 
		
	<p>Element of list: {{country[countryNumber].countryName}}</p> 
	</div>

</body>
</html>
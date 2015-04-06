var myApp = angular.module('myApp',['ngRoute']);

myApp.config(['$routeProvider','$locationProvider',
        function($routeProvider, $locationProvider) {
          $routeProvider
          	.when('/home', {
              templateUrl: 'templates/home.html',
              controller: 'TodoController'
          	})
            .otherwise({
            	redirectTo: 'home'
            });
          
}]);
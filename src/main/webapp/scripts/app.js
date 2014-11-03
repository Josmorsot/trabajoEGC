var cavApp = angular.module("cavApp",["ngRoute","cavControllers"])

cavApp.config(['$routeProvider','$locationProvider', 
function($routeProvider,$locationProvider) {
	$routeProvider.when('/', {
		templateUrl: 'partials/main.html',
		controller : 'createController'
	}),
	$routeProvider.when('/create', {
		templateUrl: 'partials/form.html',
		controller : 'createController'
	});
}]);
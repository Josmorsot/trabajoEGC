var cavControllers = angular.module("cavControllers", []);
cavControllers.controller('createController', function($scope, $http){
	$scope.qs=[]
	$scope.i = 0;
	$scope.survey={title:"",description:"",startDate:"",endDate:"",questions:[]};
	$scope.addQuestionField = function(){
		$scope.i+=1;
		$scope.qs.push($scope.i);
	};
	
	$scope.submit = function(){
		console.log($scope.survey);
	};
})
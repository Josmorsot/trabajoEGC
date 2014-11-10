var cavControllers = angular.module("cavControllers", []);
cavControllers.controller('createController', function($scope, $http){
	$scope.qs=[]
	$scope.i = 0;
	$scope.survey={type:"survey", title:"",description:"",startDate:"",endDate:"",questions:[]};
	$scope.addQuestionField = function(){
		$scope.i+=1;
		$scope.qs.push($scope.i);
	};
	$scope.submit = function(survey){
		console.log(survey)
		$http.post("vote/save.do",survey).success(function(data,status){
			console.log(survey);
		});
	};
})
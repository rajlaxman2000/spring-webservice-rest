function studentController($scope,$http) {
	var id;
	$scope.getData = function(){
		id = $scope.std_id;
		$http.get('http://localhost:8080/SpringMiniProj/rest/todos/'+id).
	    success(function(data) {
	    	if(!data || data==""){
	    		$scope.stdRecords=true;
	    		$scope.errMsg = false;
	    		$scope.errorMessage = "No record found";	
	    	}else{
	    		$scope.stdRecords=false;
		    	$scope.errMsg = true;
		    	$scope.student = data;	    	}	    	
	    }).error(function(data, status, headers, config) {
	    	$scope.errMsg = false;
	    	$scope.stdRecords=true;
	    	$scope.errorMessage = 'Error loading data';
	    });
	};
	
	
}
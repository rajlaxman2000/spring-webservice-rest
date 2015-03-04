function GetStudent($scope, $http) {
	/*var id =$scope.std_id; */
	var id = 9; 
    $http.get('http://localhost:8080/SpringMiniProj/rest/todos/9').
        success(function(data) {
            $scope.student = data;
        }).error(function(data, status, headers, config) {
        	alert('Error loading data');
        });

}
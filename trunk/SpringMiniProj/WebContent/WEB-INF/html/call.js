function GetStudent($scope, $http) {
	var id =$scope.std_id; 
    $http.get('http://localhost:8080/SpringMiniProj/rest/todos/'+id).
        success(function(data) {
            $scope.student = data;
        });
}
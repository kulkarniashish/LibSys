angular.module('libSysApp').controller('BookEditController', function($scope, $http, $routeParams, $location) {

	// id is present, then first get from server
	// and just assign
	var bookId = $routeParams.id;
	console.log(bookId);

	if (!bookId) {
		// $location.path('/plan/media_plan/list');
		$scope.book = {};
		return;
	}

	$http({
		method : 'GET',
		url : './api/book/' + bookId
	}).success(function(data, status, headers, config) {
		$scope.book = data;
	}).error(function(data, status, headers, config) {
		// called asynchronously if an error occurs
		// or server returns response with an error status.
	});

}); 

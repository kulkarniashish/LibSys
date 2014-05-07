/**
 * Created by Chandrahaas on 3/19/14.
 */
angular.module('libSysApp').controller('UserEditController', function($scope, $http, $routeParams, $location) {

	// id is present, then first get from server
	// and just assign
	var userId = $routeParams.id;
	console.log(userId);

	if (!userId) {
		// $location.path('/plan/media_plan/list');
		$scope.user = {};
		return;
	}

	$http({
		method : 'GET',
		url : './api/user/' + userId
	}).success(function(data, status, headers, config) {
		$scope.user = data;
	}).error(function(data, status, headers, config) {
		// called asynchronously if an error occurs
		// or server returns response with an error status.
	});

}); 

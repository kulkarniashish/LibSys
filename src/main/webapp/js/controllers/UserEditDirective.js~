angular.module('libSysApp').directive('userEdit', function($http,$location) {

	return {
		restrict : 'AE',
		scope : {
			user : '='
		},
		templateUrl : 'views/widgets/UserEdit.html',
		controller : function($scope) {
			
			$scope.save = function(user) {
				console.log(JSON.stringify(user));
				$http({
					method : 'POST',
					url : './api/user/',
					data : user
					
					
				}).success(function(data, status, headers, config) {
					console.log('User saved.');
					$location.path("/" );
				}).error(function(data, status, headers, config) {
					window.alert('error saving user.')
					// called asynchronously if an error occurs
					// or server returns response with an error status.
				});
			};
		}
	};
}); 

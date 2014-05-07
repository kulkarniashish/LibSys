'use strict';

angular.module('libSysApp').
	directive('userList', function($http, $location) {

	return {
		restrict : 'AE',
		scope : {
			list : '='
		},
		templateUrl : 'views/widgets/UsersList.html',
		controller : function($scope) {
			$http({
				method : 'GET',
				url : './api/book/'
			}).success(function(data, status, headers, config) {
				$scope.books = data.content;
			});

			$scope.gotoPlacementEditPage = function(placementId) {
				// debugger;
				$location.path('/plan/_plan/edit');
				console.log('called');
				// _.defer(function() {
				// });
			};

		
		}
	};
});

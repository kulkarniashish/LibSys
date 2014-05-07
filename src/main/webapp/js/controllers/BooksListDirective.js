'use strict';

angular.module('libSysApp').
	directive('bookList', function($http, $location) {

	return {
		restrict : 'AE',
		scope : {
			list : '='
		},
		templateUrl : 'views/widgets/UsersList.html',
		controller : function($scope) {
			$http({
				method : 'GET',
				url : './api/plan/pmp_placement'
			}).success(function(data, status, headers, config) {
				$scope.placements = data.content;
			});
			$scope.grpList = [];
			$scope.$watch('list',function (newValue, oldValue) {
				if(!newValue) return;

				$scope.grpList = _.groupBy($scope.list,'reason')
			});
			$scope.gotoPlacementEditPage = function(placementId) {
				// debugger;
				$location.path('/plan/media_plan/edit');
				console.log('called');
				// _.defer(function() {
				// });
			};

		
		}
	};
});

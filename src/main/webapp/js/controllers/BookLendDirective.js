angular.module('libSysApp').directive('bookLend', function($http,$location) {

	return {
		restrict : 'AE',
		scope : {
			bookLend : "=",

		},
		templateUrl : 'views/widgets/BookLend.html',
		controller : function($scope) {
		
			//Get UserNames. 
			$http({
				method : 'GET',
				url : './api/user/'
			}).success(function(data, status, headers, config) {
				$scope.users = data.content;
			});

			//Get UserNames. 
			$http({
				method : 'GET',
				url : './api/book/'
			}).success(function(data, status, headers, config) {
				$scope.books = data.content;
			});	

			$scope.save = function(st)
			{
				$http({
					method : 'POST',
					url : './api/lend/book/' + st.bookId.id + '/user/' + st.userId.id,
					data : st			
				
				}).success(function(data, status, headers, config) {
					console.log('BookLending saved.');
					$location.url("/");
				}).error(function(data, status, headers, config) {
					window.alert('error saving book.')
					// called asynchronously if an error occurs
					// or server returns response with an error status.
				});
			}			
		}
	};
}); 

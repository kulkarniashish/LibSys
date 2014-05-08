angular.module('libSysApp').directive('booksLendList', function($http,$location) {

	return {
		restrict : 'AE',
		scope : {
			bookLending : "=",

		},
		templateUrl : 'views/widgets/BooksLendList.html',
		controller : function($scope) {
		
				
		}
	};
}); 

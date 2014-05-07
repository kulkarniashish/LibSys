angular.module('appnexus-web').factory('$restClient', function($http){
	return {			
				advertiser : {
					get : function(){
						return $http({
									method : 'GET',
									url : './api/appnexus/advertiser/',
									params : {
										page:0,
										size:10
									}
								});
					},
					getById : function(id){
						return $http({
						method : 'GET',
						url : './api/appnexus/advertiser/' + id
						});
					},
					getByNameContaining : function(name){
						return $http({
									method : 'GET',
									url : './api/appnexus/advertiser/search/name',
									params : {
										q:name,
										page:0,
										size:10
									}
								});
					}
				
				}
			}
				
});
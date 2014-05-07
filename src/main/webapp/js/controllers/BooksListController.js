'use strict';

angular.module('libSysApp').controller('BooksListController', function($scope, $http) {

    $scope.findAll = function() {
        $http({
            method : 'GET',
            url : './api/book'
        }).success(function(data, status, headers, config) {
		//Get Data from WebService call            
		$scope.list = data.content;
        }).error(function(data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    $scope.findAll();
});

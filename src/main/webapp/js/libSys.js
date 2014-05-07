'use strict';

angular.module('libSysApp', ['ngRoute']).
config(function($routeProvider) {
	$routeProvider.
		when('/users', {
		templateUrl : 'views/pages/UsersListPage.html',
		controller : 'UsersListController'
	}).when('/books', {
		templateUrl : 'views/pages/BooksListPage.html',
		controller : 'BooksListController'
	}).when('/lend', {
		templateUrl : 'views/widgets/LendBook.html',
		controller : 'LendBookController'
	}).when('/return', {
		templateUrl : 'views/widgets/ReturnBook.html',
		controller : 'ReturnBookController'
	}).when('/lendHistory', {
		templateUrl : 'views/widgets/LendHistory.html',
		controller : 'LendHistoryController'
	}).when('/user/edit', {
		templateUrl : 'views/pages/UserEditPage.html',
		controller : 'UserEditController'
	}).when('/book/edit', {
		templateUrl : 'views/pages/BookEditPage.html',
		controller : 'BookEditController'
	}).otherwise({
		redirectTo : '/users'
	});
});

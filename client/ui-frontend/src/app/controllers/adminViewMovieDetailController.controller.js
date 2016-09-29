(function(){
    'use strict';

    angular
        .module('movieflixapp')
        .controller('adminViewMovieDetailController', adminViewMovieDetailController);

    adminViewMovieDetailController.$inject = ['adminService','$routeParams','$location'];
    function adminViewMovieDetailController(adminService, $routeParams,$location){
        var viewDetailVm = this;

        viewDetailVm.updateMovie = updateMovie;
        viewDetailVm.deleteMovie = deleteMovie;
        init();

        function init(){
            console.log("Show parameters");
            console.log($routeParams);

            adminService.getMovieById($routeParams.id)
                .then(function(data){
                    console.dir(data);
                    viewDetailVm.movie = data;
                })
                .catch(function (error) {
                    console.log(error);
                })
        }

        function updateMovie(){
            console.log('Update Movie');
            adminService.updateMovies($routeParams.id,viewDetailVm.movie);
        }

        function deleteMovie(){
            console.log('Delete Movie');
            adminService.deleteMovies($routeParams.id,viewDetailVm.movie)
                .then(function(data) {
                    $location.path('/adminviewmovie');
                }, function(error) {
                    console.log(error);
                })
        }

    }
})();